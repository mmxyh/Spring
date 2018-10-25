package com.imooc.aop.schema.advisors;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.Ordered;
import org.springframework.dao.PessimisticLockingFailureException;

public class ConcurrentOperationExecutor implements Ordered {
    private static final int DEFAULT_MAX_RETRIES = 2;
    private int maxRetries = DEFAULT_MAX_RETRIES;
    private int order = 1;

    public static int getDefaultMaxRetries() {
        return DEFAULT_MAX_RETRIES;
    }

    public int getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    @Override
    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Object doConcurrentOperation(ProceedingJoinPoint pjp) throws Throwable {
        int numAttempts = 0;
        PessimisticLockingFailureException lockingFailureException;
        do {
            numAttempts++;
            System.out.println("Try times: " + numAttempts);
            try {
                return pjp.proceed();
            } catch (PessimisticLockingFailureException ex) {
                lockingFailureException = ex;
            }
        } while (numAttempts <= this.maxRetries);
        System.out.println("Try error: "+numAttempts);
        throw lockingFailureException;
    }
}

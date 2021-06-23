package com.webservice;

import javax.jws.WebService;

@WebService
public interface DemoWebservice {
    public String queryBaseTx();

    public String queryBaseTxById(long id);


}
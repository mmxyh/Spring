#第1章 概述
#第2章 Spring IOC容器
#第3章 Spring Bean装配(上)
##3-4 Spring Bean装配之自动装配(Autowiring)
* No:不做任何操作
* ByName:根据属性名自动装配
* ByType:
* Constructor:
##3-5 Spring Bean装配之Resources
* 针对与资源文件的统一接口
* Resources
* ResourceLoader
#第4章 Spring Bean装配(下)
##4-1 Bean管理的注解
* Classpath扫描与组件管理
* 类的自动检测与注册Bean
* <context:annotation-config/>
* @Component,@Repository,@service，@Controller
* @Required
    适用于bean属性的setter方法
* @Autowired
    传统的setter方法
    可用于构造器或成员变量
    默认情况下，如因找不到合适的bean将会导致autowiring失败抛出异常
    每个类只能有一个构造器被标记为required=true
* @Qualifier
* @Resource
#第5章 Spring AOP基本概念
##4-1 AOP基本概念及特点
* 切面(Aspect)
  一个关注点的模块化，这个关注点可能会横切多个对象
* 连接点
  程序执行过程中的某个特定的点
* 通知(Advice)
  在切面的某个特定的连接点上执行的动作
* 切入点
  匹配连接点的断言，再AOP中同志和一个切入点表达式关联
* 引入
  在不修改类代码的前提下，为类添加新的方法和属性
* 目标对象
  被一个或者多个切面所通知的对象
* AOP代理
  AOP框架创建的对象，用来实现切面契约(aspect contract)（包括通知方法执行等功能）
* 织入
  把切面连接到其它的应用程序类型或者对象上，并 创建一个被通知的对象，分为：编译时织入/类加载时织入/执行时织入


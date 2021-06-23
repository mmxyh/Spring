package com.controller;


import com.webservice.DemoWebservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;


@Controller
@RequestMapping("wsClient")
public class DemoClient {

    /**
     * jdk原生调用(需要获取服务接口文件)
     * @param args
     */
    public static void main(String[]args) {

        try {
            URL wsdlURL = new URL("http://localhost:8082/webservice/demo?wsdl");
            //访问http://localhost:8082/webservice显示的wsdl
            QName SERVICE_NAME = new QName("http://impl.webservice.com/", "DemoWebserviceImplService");
            Service service = Service.create(wsdlURL, SERVICE_NAME);
            DemoWebservice client = service.getPort(DemoWebservice.class);
            String result = client.queryBaseTx();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}

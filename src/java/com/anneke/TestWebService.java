package com.anneke;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.Endpoint;

/**
 *
 * @author HOME
 */
@WebService(serviceName = "TestWebService")
public class TestWebService {

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Fuck" + txt + " !";
    }

    @WebMethod(operationName = "test")
    public String test(@WebParam(name = "name1") String txt1,
            @WebParam(name = "name2") String txt2) {
        return "Fuck " + txt1 + " " + txt2;
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/WS/test", new TestWebService());
        System.out.println("Service is published!");
    }
}

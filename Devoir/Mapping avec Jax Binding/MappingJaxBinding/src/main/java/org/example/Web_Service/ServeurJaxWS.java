package org.example.Web_Service;

import jakarta.xml.ws.Endpoint;

public class ServeurJaxWS
{
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/",new Releve());
        System.out.println("Web service deploye sur http://0.0.0.0:9191/");
    }
}

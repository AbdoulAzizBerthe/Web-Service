package Abdoul.Aziz;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueWS());
        System.out.println("Web service deploye sur http://0.0.0.0:9191/");
    }
}
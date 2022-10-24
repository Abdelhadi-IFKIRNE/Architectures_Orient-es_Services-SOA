package ws;

import jakarta.xml.ws.Endpoint;

public class serverWsdl {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:8989/",new bankAccountService());
        System.out.println("votre serveur est en train d'écouter ....");
    }
}

package ServerJaxWS;

import WebServices.AccountWebService;

import javax.xml.ws.Endpoint;

public class serverJaxWs {
    public static void main(String[] args) {
        String url="http://0.0.0.0:8686/";
        Endpoint.publish(url,new AccountWebService());
        System.out.println("Your server start in : "+url);
    }
}

package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class bankAccountService {

    @WebMethod(operationName = "conversion")
    public double conversion(@WebParam(name = "amount") double mt){
        return mt*11;
    }

    @WebMethod(operationName = "getAccount")
    public Compte getAccount(@WebParam(name = "code") int code){
        return  new Compte(1,87785,"CM");
    }

    @WebMethod(operationName = "getAllAccount")
    public List<Compte> getAllAccounts(){
        return List.of(
          new Compte(1,87785,"CM"),
          new Compte(2,87785,"CM"),
          new Compte(3,87785,"CM"),
          new Compte(4,87785,"CM")
        );
    }
}

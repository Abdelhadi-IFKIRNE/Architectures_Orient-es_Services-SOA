package WebServices;

import Metier.Compte;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@WebService(name = "AccountWebService")
public class AccountWebService {

    @WebMethod(operationName = "conversionEuroToDh")
    public double conversionEuroDh(@WebParam(name = "amount") double mt){
        return mt*10;
    }

    @WebMethod(operationName = "getOneAccount")
    public Compte getAccount(@WebParam(name = "code") String code){
        return new Compte(UUID.randomUUID().toString(),code,Math.random()+605548);
    }

    @WebMethod(operationName = "getListOfAccounts")
    public List<Compte> getAllAccounts(){
        List<Compte> accounts=new ArrayList<>();

        for (int i = 0; i <10 ; i++) {
            Compte compte=new Compte(UUID.randomUUID().toString(),UUID.randomUUID().toString(),Math.random()*2+50547);
            accounts.add(compte);
        }
        return accounts;
    }

}

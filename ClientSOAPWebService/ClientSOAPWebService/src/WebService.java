import proxy.AccountWebService;
import proxy.AccountWebServiceService;

public class WebService {
    public static void main(String[] args) {
        AccountWebService proxy=new AccountWebServiceService().getAccountWebServicePort();
         System.out.println(proxy.conversionEuroToDh(158));
    }
}

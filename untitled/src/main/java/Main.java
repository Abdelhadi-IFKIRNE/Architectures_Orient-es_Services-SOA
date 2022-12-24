import service.Imetier;
import service.ImetierImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Imetier imetier=new ImetierImpl();
        System.out.println(imetier.getInformation("felecitations abdelhadi vous avez validé votre semestre dans la session normale, avec ",16));
    }
}
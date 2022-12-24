package service;

public class ImetierImpl implements Imetier {
    @Override
    public String getInformation(String message, int number) {
        return message + " : "+ number;
    }
}

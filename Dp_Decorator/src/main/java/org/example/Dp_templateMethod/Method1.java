package org.example.Dp_templateMethod;

public class Method1 extends Template{
    @Override
    public int operattion1() {
        System.out.println("j'applique les defs de l'impli : ***** Method 1 **********");
        return 19;
    }

    @Override
    public int operattion2() {
        return 20;
    }
}

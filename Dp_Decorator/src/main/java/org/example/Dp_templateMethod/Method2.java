package org.example.Dp_templateMethod;

public class Method2 extends Template{
    @Override
    public int operattion1() {
        System.out.println("j'applique les defs de l'impl :****** Method 2**********");
        return 119;
    }

    @Override
    public int operattion2() {
        return 200;
    }
}

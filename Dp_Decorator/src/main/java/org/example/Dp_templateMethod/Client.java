package org.example.Dp_templateMethod;

public class Client {
    public static void main(String[] args) {
        Template template=new Method1();
        template.testemplate();
        template=new Method2();
        template.testemplate();
    }
}

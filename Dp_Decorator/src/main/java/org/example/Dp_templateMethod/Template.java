package org.example.Dp_templateMethod;

public abstract class Template {
    private int sum=0;
    public void testemplate(){
        for (int i = 0; i <10 ; i++) {
            sum+=i;
        }
        sum=sum+operattion1();
        sum*=operattion2();
        System.out.println("votre sum est: "+sum);
    }

    public abstract int operattion1();
    public abstract int operattion2();
}

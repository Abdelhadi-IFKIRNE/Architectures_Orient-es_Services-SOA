package org.example.Dp_Composite;

public class Main {

    public static void main(String[] args) {
    Dossier dossier=new Dossier("dossier");
    Dossier dossier1=new Dossier("dossier1");
    Dossier dossier2=new Dossier("dossier2");
    dossier.addComposant(dossier1);
    Fichier fichier=new Fichier("fichier");
    Fichier fichier1=new Fichier("fichier1");
    Fichier fichier2=new Fichier("fichier2");
    Fichier fichie3=new Fichier("fichier3");
    Fichier fichie4=new Fichier("fichier4");
    dossier.addComposant(fichier);
    dossier.addComposant(fichier1);
    dossier.addComposant(fichier2);
    dossier1.addComposant(fichie3);
    dossier1.addComposant(dossier2);
    dossier2.addComposant(fichie4);
    dossier.operation();
    }
}

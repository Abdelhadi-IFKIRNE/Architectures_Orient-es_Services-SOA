package com.example.security.GKeyPair;

import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class GenerateKeyPair {
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        KeyPairGenerator keyPairGenerator=KeyPairGenerator.getInstance("rsa");
        var keyPair=keyPairGenerator.generateKeyPair();
        byte[] pub=keyPair.getPublic().getEncoded();
        byte[] pri=keyPair.getPrivate().getEncoded();
        PemWriter pemWriter=new PemWriter(new OutputStreamWriter(new FileOutputStream("pub.pem")));
        PemObject pemObject=new PemObject("PUBLIC KEY",pub);
        pemWriter.writeObject(pemObject);
        pemWriter.close();
        PemWriter pemWriter1=new PemWriter(new OutputStreamWriter(new FileOutputStream("pri.pem")));
        PemObject pemObject1=new PemObject("PRIVATE KEY",pri);
        pemWriter1.writeObject(pemObject1);
        pemWriter1.close();
    }
}

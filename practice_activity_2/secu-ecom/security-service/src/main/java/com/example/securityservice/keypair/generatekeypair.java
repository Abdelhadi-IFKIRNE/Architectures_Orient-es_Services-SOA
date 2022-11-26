package com.example.securityservice.keypair;

import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class generatekeypair {
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        KeyPairGenerator keyPairGenerator=KeyPairGenerator.getInstance("rsa");
        var keypar=keyPairGenerator.generateKeyPair();
        byte[] pub=keypar.getPublic().getEncoded();
        byte[] priv=keypar.getPrivate().getEncoded();
        PemWriter pemWriter=new PemWriter(new OutputStreamWriter(new FileOutputStream("pub.pem")));
        PemObject pemObject=new PemObject("PUBLIC KEY",pub);
        pemWriter.writeObject(pemObject);
        pemWriter.close();
        PemWriter pemWriter1=new PemWriter(new OutputStreamWriter(new FileOutputStream("priv.pem")));
        PemObject pemObject1=new PemObject("PRIVATE KEY",priv);
        pemWriter1.writeObject(pemObject1);
        pemWriter1.close();
    }
}

package br.com.dnkt.javanewfeatures.java8.base64;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Base64;
import java.util.Random;

public class Base64Example {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String textToEncode = "This is a text to be encoded. Just a simple example. Thanks.";

        String encodeText = Base64.getEncoder().encodeToString(textToEncode.getBytes("utf-8"));
        System.out.println("Encoded text:" + encodeText);

        String decodedText = new String(Base64.getDecoder().decode(encodeText),"utf-8");
        System.out.println("Decoded text:" + textToEncode);
    }

}

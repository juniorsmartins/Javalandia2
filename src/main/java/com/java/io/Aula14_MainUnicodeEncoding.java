package com.java.io;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Aula14_MainUnicodeEncoding
{
    public static void main(String[] args)
    {
        String s = "c";
        System.out.println(s.codePointAt(0)); // Mostra qual Unicode do C

        // Permite saber qual encoding é utilizado pelo sistema local
        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        // Permite forçar o uso de outro encoding e verificar quantos bytes consome
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        System.out.println("\nEncoding: " + StandardCharsets.UTF_8 + "\nBytes: " + bytes.length);

        bytes = s.getBytes(StandardCharsets.UTF_16);
        System.out.println("\nEncoding: " + StandardCharsets.UTF_16 + "\nBytes: " + bytes.length);

        bytes = s.getBytes(StandardCharsets.ISO_8859_1);
        System.out.println("\nEncoding: " + StandardCharsets.ISO_8859_1 + "\nBytes: " + bytes.length);

        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println("\nEncoding: " + StandardCharsets.US_ASCII + "\nBytes: " + bytes.length);

        bytes = s.getBytes(StandardCharsets.UTF_16BE);
        System.out.println("\nEncoding: " + StandardCharsets.UTF_16BE + "\nBytes: " + bytes.length);

        System.out.println("\n-------------------\n");
        // Converte os bytes com o encoding desejado
        String convertido = new String(bytes, StandardCharsets.UTF_16LE);
        System.out.println(convertido);

        System.out.println("\n-------------------\n");

    }
}

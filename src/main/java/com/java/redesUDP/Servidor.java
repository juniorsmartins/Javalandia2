package com.java.redesUDP;

import java.net.*;
import java.io.*;

public class Servidor 
{
    public static final String piada = "O que cai em pé e corre deitado? R: a chuva!";

    public static void main(String[] args) throws IOException
    {
        DatagramSocket dgSocket = new DatagramSocket(7777);
        byte[] mensagem = new byte[128];
        
        DatagramPacket dgPacket = new DatagramPacket(mensagem, mensagem.length);
        
        dgSocket.receive(dgPacket);
        
        String msg = new String(dgPacket.getData());
        System.out.println("A mensagem recebida é: " + msg);

        InetAddress ia = dgPacket.getAddress();
        int porta = dgPacket.getPort();
        
        mensagem = piada.getBytes();
        
        dgPacket = new DatagramPacket(mensagem, mensagem.length, ia, porta);
        
        dgSocket.send(dgPacket);
    }
}
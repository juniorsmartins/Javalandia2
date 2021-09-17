package com.java.redesUDP;

import java.net.*;
import java.io.*;

public class Cliente 
{
    public static void main(String[] args) throws IOException
    {
        DatagramSocket dgSocket = new DatagramSocket();
        byte[] mensagem = new byte[128];
        
        // Envio
        String msg = "Quero uma piada";
        mensagem = msg.getBytes();
        
        InetAddress endereco = InetAddress.getByName("localhost");
        
        DatagramPacket dgPacket = new DatagramPacket(mensagem, mensagem.length, endereco, 7777);
        
        dgSocket.send(dgPacket);
        
        // Receber
        mensagem = new byte[128];
        dgPacket = new DatagramPacket(mensagem, mensagem.length);
       
        dgSocket.receive(dgPacket);
        
        String piada = new String(dgPacket.getData());
        System.out.println(piada);
    }
}
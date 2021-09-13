package com.java.redes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.*;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ChatMulticast_1 extends Thread
{
    private static String usuario = null;
    private static InetAddress endereco;
    private static int porta;
    
    @Override
    public void run()
    {
        try
        {
            byte[] msg = new byte[128];
            
            MulticastSocket socket = new MulticastSocket(porta);
            socket.joinGroup(endereco);
            
            while(true) 
            {
                DatagramPacket dgPacket = new DatagramPacket(msg, msg.length);
                socket.receive(dgPacket);
                
                String mensagem = new String(dgPacket.getData());
                if(!mensagem.contains(usuario)) 
                {
                    out.println("\n" + mensagem + "\n");
                    out.print("Digite a mensagem: ");
                }
                msg = new byte[128];
            }
        } catch(IOException e) 
        {}
    }
    
    public static void main(String[] args) 
    {
        String[] args2 = null;
        args2[0] = "50000";
        args2[1] = "localhost";

        // Verifica se possui a quantidade correta de argumentos
        if(args2.length != 2)
        {out.println("Parâmetros estão incorretos!\nJava BatePapo <endereco_multicast> <porta>"); exit(1);}
        
       try 
       {    // Armazena os argumentos nos atributos porta e endereco            
            porta = Integer.parseInt(args2[1]);
            endereco = InetAddress.getByName(args2[0]);
            
            ChatMulticast_1 bp = new ChatMulticast_1();
            bp.start();
            
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
            
            System.out.print("Digite o seu nome: ");
            usuario = br.readLine();
            
            MulticastSocket socket = new MulticastSocket();
            socket.joinGroup(endereco);
            
            byte[] msg = new byte[128];
            
            while(true) {
                
                System.out.print("Digite a mensagem: ");
                String mensagem = br.readLine();
                
                if(mensagem.equals("sair")) {
                    System.exit(0);
                }
                
                mensagem = usuario + " diz: " + mensagem;
                
                msg = mensagem.getBytes();
                
                DatagramPacket dgPacket =
                        new DatagramPacket(msg, msg.length, endereco, porta);
                
                socket.send(dgPacket);
            }
        } catch(IOException e) 
        {}
    }
}
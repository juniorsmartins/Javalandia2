package com.java.redesUDP;

import java.net.*;
import java.io.*;

public class MulticastChat extends Thread 
{
    private static String user = null;
    private static InetAddress endereco;
    private static int porta;
    
    public MulticastChat(){};
    
    @Override
    public void run()
    {
        try
        {
            byte[] buffer = new byte[64];
            
            MulticastSocket socket = new MulticastSocket(porta);
            socket.joinGroup(endereco);
            
            while(true)
            {
                DatagramPacket receberPacote = new DatagramPacket(buffer, buffer.length);
                socket.receive(receberPacote);
                
                String mensagem = new String(receberPacote.getData());
                
                if(!mensagem.contains(user))
                {
                    System.out.print("\r ");
                    System.out.println("\n" + mensagem + "\n");
                    System.out.print("Digite a mensagem: ");
                }
                buffer = new byte[64];
            }
        }catch(Exception e)
        {System.out.println("Exception: " + e.getMessage());}
    }
    
    public static void main(String[] args) 
    {
        if(args.length != 2) 
        {
            System.out.println("Parametros incorretos: java MulticastChat <multicast> <porta>");
            System.exit(1);
        }

        try 
        {
            endereco = InetAddress.getByName(args[0]);
            porta = Integer.parseInt(args[1]);

            Thread t = new MulticastChat();
            t.start();

            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            byte[] buffer = new byte[64];
            System.out.print("Digite o seu nome: ");
            user = entrada.readLine();

            MulticastSocket socket = new MulticastSocket();
            socket.joinGroup(endereco);

            while(true) 
            {
                System.out.print("Digite a mensagem: ");
                String mensagem = entrada.readLine();

                if(mensagem.equals("sair")) 
                    System.exit(0);
                    
                mensagem = user + " diz: " + mensagem;

                buffer = mensagem.getBytes();

                DatagramPacket enviarPacote = new DatagramPacket(buffer, buffer.length, endereco, porta);

                socket.send(enviarPacote);
            }
        }catch(Exception e) 
        {System.out.println("Exception: " + e.getMessage());}
    }
}
package com.java.redes;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Aula02_socket_servidor 
{
    public static void main(String[] args) throws IOException
    {
        // Criar servidor
        ServerSocket server = new ServerSocket(56001);
        System.out.println("Servidor iniciado na porta " + server.getLocalPort());
        
        // Mostrar dados do servidor
        InetAddress inet = server.getInetAddress();
        System.out.println("HostAddress: " + inet.getHostAddress());
        System.out.println("HostName: " + inet.getHostName());
        System.out.println("Address: " + inet.getAddress());
        
        // Criar conexao
        Socket socket = null;
        String mensa; int inteiro; float valor;

        // Tratar excecao
        try
        {
            socket = server.accept(); // Aguardar conexao - ouvir
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            
            
        }
        catch(IOException ioe)
        {System.err.println("\nExcecao!\n");}
        finally
        {socket.close();}
    }
}
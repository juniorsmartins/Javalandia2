package com.java.redesTCP;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Aula04_socket_server 
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        // Criar servidor
        ServerSocket server = null;
        // Ouvidos aberto para conexao
        Socket conexao = null;

        try
        {
            // Criar servidor
            server = new ServerSocket(44444);
            // Ouvidos aberto para conexao
            conexao = server.accept();
            // Criar canal para receber objeto
            ObjectInputStream obi = new ObjectInputStream(conexao.getInputStream());

            // Receber o objeto
            Aula04_socket_pessoa pes = (Aula04_socket_pessoa) obi.readObject();

            // Mostrar objeto recebido
            System.out.println(pes);
        
        }catch(IOException ioe)
        {
            conexao.close();
            server.close();
        }
    }
}
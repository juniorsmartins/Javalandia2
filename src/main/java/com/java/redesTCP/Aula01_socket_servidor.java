package com.java.redesTCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Aula01_socket_servidor 
{
    public static void main(String[] args) throws IOException
    {
        // A Classe ServerSocket cria um canal de comunicação e permite conexões de um host cliente utilizando um socket
        // Declaração: public ServerSocket(int porta) throws IOException
        ServerSocket server = new ServerSocket(56000); // Servidor criado
        Socket socket = null;
        try
        {
            socket = server.accept(); // Aguardando o estabelecimento da conexao via socket (o método accept fica ouvindo)
            System.out.println("\nConexão estabelecida entre Servidor-Cliente");
            
            DataInputStream entrada = new DataInputStream(socket.getInputStream()); // Definido canal datastream para recebimento
            String mensagem = entrada.readUTF(); // recebimento
            
            System.out.println("Mensagem recebida no servidor: " + mensagem);
            String mensagemAlterada = mensagem.trim().replace("o", "x").toUpperCase();
            
            DataOutputStream saida = new DataOutputStream(socket.getOutputStream());
            saida.writeUTF(mensagemAlterada);
        }
        catch(IOException ioe)
        {
            System.err.println("Excecao!");
        }
        finally
        {socket.close();}
    }
}
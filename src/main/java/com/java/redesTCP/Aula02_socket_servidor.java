package com.java.redesTCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
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

        // Tratar excecao
        try
        {
            socket = server.accept(); // Aguardar conexao - ouvir
            System.out.println("Servidor estabelece conexao com o cliente! Uso da porta " + socket.getPort());

            // Define referencia de canal de entrada
            DataInputStream dataIn = new DataInputStream(socket.getInputStream()); 
            String mensagem = dataIn.readUTF(); // Recebe uma String

            // Mostra a mensagem recebida
            System.out.println("A mensagem recebida é: " + mensagem);
            // Trata a mensagem recebida
            String mensagemTratada = mensagem.toUpperCase(); 
            // Mostra a mensagem tratada
            System.out.println("A mensagem tratada é: " + mensagemTratada);

            // Define referencia de canal de saida
            DataOutputStream dataOut = new DataOutputStream(socket.getOutputStream());
            // Reenviar a mensagem após tratamento
            dataOut.writeUTF(mensagemTratada);

        }
        catch(IOException ioe)
        {System.err.println("\nExcecao!\n");}
        finally
        {
            socket.close();
            server.close();
        }
    }
}
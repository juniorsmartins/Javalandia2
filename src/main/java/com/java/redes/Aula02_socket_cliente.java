package com.java.redes;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Aula02_socket_cliente 
{
    public static void main(String[] args) throws IOException
    {
        // Define conexao
        Socket socket = null;
        DataOutputStream dataOut = null;
        DataInputStream dataIn = null;

        // Tratamento de excecao
        try
        {
            // Define conexao
            socket = new Socket("127.0.0.1", 56001);

            // Solicita mensagem para o usuario
            System.out.println("\nDigite mensagem para o servidor: ");
            // Capta a mensagem do usuario
            Scanner scan = new Scanner(System.in);
            String mensagem = scan.nextLine();

            // Define referencia do canal de saida
            dataOut = new DataOutputStream(socket.getOutputStream());
            // Envia a mensagem para o servidor
            dataOut.writeUTF(mensagem);

            // Define referencia do canal de entrada
            dataIn = new DataInputStream(socket.getInputStream());
            // Recebe a mensagem retornada
            String mensagemRetornada = dataIn.readUTF();

            // Apresenta a mensagem retornada
            System.out.println("Resposta do servidor: " + mensagemRetornada);

        }catch(IOException ioe)
        {System.err.println("Excecao!");}
        finally
        {
            // Fecha canais e conexao
            dataOut.close();
            dataIn.close();
            socket.close();
        }
    }
}
package com.java.redes;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Aula01_socket_cliente 
{
    public static void main(String[] args) throws IOException 
    {
        // Um socket é uma conexão bilateral entre dois computadores. Ele faz uso do protocolo TCP, logo herda as características desse protocolo.
        // Declaração: public Socket(String ipserver, int porta) throws IOException
        Socket socket = new Socket("127.0.0.1", 56000);
        
        // Para enviar dados de um socket é preciso instanciar um objeto DataOutputStream passando o socket por meio do getOutputStream()
        DataOutputStream saida = new DataOutputStream(socket.getOutputStream());
        // Saída de dados pelo socket
        String enviarStr = " Olá, Mundo! ";
        saida.writeUTF(enviarStr);
        
        // Para ler os dados de um socket é preciso instanciar um objeto DataInputStream passando o socket por meio do getInputStream()
        DataInputStream entrada = new DataInputStream(socket.getInputStream());
        // Entrada-leitura de dados vindos pelo socket
        String receberStr = entrada.readUTF();
        
        System.out.println("Resultado após servidor trabalhar na mensagem: " + receberStr);
        
    }
}
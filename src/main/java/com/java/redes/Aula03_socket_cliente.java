package com.java.redes;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Aula03_socket_cliente 
{
    public static void main(String[] args) throws IOException
    {
        // PROTOCOLO TCP - O TCP é um protocolo orientado a conex˜ao. Assim, e preciso estabelecer uma conex˜ao (handshaking), antes
        // de qualquer transmiss˜ao de dados entre dois computadores. Dentro desse contexto, cada maquina cliente necessitará
        // estabelecer uma conex˜ao ao servidor, abrindo um canal de comunicac˜ao entre os dois computadores (hosts).
        // Vantagens desse protocolo:
        // – garantia de entrega dos pacotes ao destino;
        // – mantéem a integridade dos dados enviados;
        // – realiza a entrega dos pacotes de maneira ordenada;
        
        // Tratamento de excecao
        try
        {
            // Criar conexao
            Socket conexao = new Socket("127.0.0.1", 55002);
            // Criar canal de saída de mensagem
            DataOutputStream dataOut = new DataOutputStream(conexao.getOutputStream());
            // Metodo para envio de mensagem
            dataOut.writeUTF("Me torneio assinante Alura no dia de hoje (13.09.21)!"); 
            
            // Criar canal de entrada de mensagem
            DataInputStream dataIn = new DataInputStream(conexao.getInputStream());
            // Metodo para recebimento de resposta
            String retorno = dataIn.readUTF();
            
            // Mostrar resposta do servidor
            System.out.println("Resposta do servidor: " + retorno);
            
        }catch(IOException ioe)
        {System.err.println("\nExceção!\n");}
    }
}
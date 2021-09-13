package com.java.redesUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Aula01_datagramSocket_server 
{
    public static void main(String[] args) throws Exception
    {
        // Criar conexao
        DatagramSocket dataServer = new DatagramSocket(50000);
        
        // Criar arrays para armazenar mensagem de saida e entrada
        byte[] dadosPraEnviar = new byte[1024];
        byte[] dadosPraReceber = new byte[1024];
        
        // Loop infinito para servidor continuar a receber conexoes
        while(true)
        {
            try
            {
                // Reserva espaço para a entrada de datagramas
                DatagramPacket pacotePraReceber = new DatagramPacket(dadosPraReceber, dadosPraReceber.length);
                // Recebe datagrama
                dataServer.receive(pacotePraReceber);
                // Converte a mensagem recebida em string
                String mensagem = new String(pacotePraReceber.getData());
                // Obtém endereço IP e porta de transmissão
                InetAddress endereco = pacotePraReceber.getAddress();
                int porta = pacotePraReceber.getPort();

                // Faz tratamento na mensagem
                String respostaPraMensagem = mensagem.toUpperCase();

                // Converte a string em array para enviar
                dadosPraEnviar = respostaPraMensagem.getBytes();

                // Cria datagrama para enviar
                DatagramPacket pacotePraEnviar = 
                        new DatagramPacket(dadosPraEnviar, dadosPraEnviar.length, endereco, porta);

                // Envia datagrama pelo socket
                dataServer.send(pacotePraEnviar);
            }catch(IOException ioe)
            {System.err.println("Excecao!");}
        }
    }
}
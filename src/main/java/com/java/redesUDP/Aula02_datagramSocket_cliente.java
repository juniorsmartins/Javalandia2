package com.java.redesUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Aula02_datagramSocket_cliente 
{
    public static void main(String[] args) throws IOException
    {
        // Criar conexao
        DatagramSocket dgSocket = new DatagramSocket();
        // Criar array de bytes para suportar o fluxo de bytes que será enviado para a rede
        byte[] msg = new byte[128];
        // Definir a mensagem para ser enviada
        String mensagem = "Servidor - manda uma charada!";
        // Converte a mensagem string em bytes num array
        msg = mensagem.getBytes();
        // Define o endereço do servidor
        InetAddress enderecoServidor = InetAddress.getByName("localhost");
        // Criar o pacote de datagramas para carregar o array de byte (que contém a mensagem) pela rede
        DatagramPacket dgPacket = new DatagramPacket(msg, msg.length, enderecoServidor, 7777);
        // O datagramSocket usa um método para enviar o pacote para o servidor
        dgSocket.send(dgPacket);
        
        // ----- Retorno da mensagem -----
        // Gera novo array de bytes para suporte do fluxo de dados que virá como resposta
        msg = new byte[128];
        // Gera novo pacote para receber
        dgPacket = new DatagramPacket(msg, msg.length);
        // O dgSocket usa o método receive para receber um pacote da rede
        dgSocket.receive(dgPacket);
        // Tiro do array de bytes, que está dentro do pacote, a mensagem para dentro de uma string
        String resposta = new String(dgPacket.getData());
        // Mostro a resposta do servidor
        System.out.println(resposta);
    }
}
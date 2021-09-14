package com.java.redesUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Aula02_datagramSocket_server 
{
    // Atributo de Classe - Armazenar uma resposta padrão para retornar ao cliente
    private static final String mensaPadrao = "O que cai de pé e corre deitado? A chuva";

    public static void main(String[] args) throws IOException
    {
        // Criar conexao
        DatagramSocket dgSocket = new DatagramSocket(7777);
        
        // Definir tamanho do suporte da mensagem - irá armazenar a mensagem
        byte[] mensagem = new byte[128];
        
        // Criar o pacote para receber o datagrama que contém a mensagem - o suporte da mensagem será inserido dentro do pacote
        DatagramPacket dgPacket = new DatagramPacket(mensagem, mensagem.length);
        
        // Recebe os dados do cliente
        dgSocket.receive(dgPacket);
        
        // Converte os dados do pacote em mensagem string
        String msg = new String(dgPacket.getData());
        
        // Mostra a mensagem recebida
        System.out.println("Mensagem: " + msg);
        
        // Obter endereço e porta do emissor do pacote/mensagem
        InetAddress ia = dgPacket.getAddress();
        int porta = dgPacket.getPort();

        // Converte a mensagem string em array de bytes - assim prepara para envio pela rede
        mensagem = mensaPadrao.getBytes();
        
        // Insere o array de bytes num pacote para envio - é preciso reconstruir o pacote com todas as informações novas
        dgPacket = new DatagramPacket(mensagem, mensagem.length, ia, porta);
         
        // Envio do pacote pelo dataqramSocket
        dgSocket.send(dgPacket);
        
    }
}
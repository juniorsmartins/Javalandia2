package com.java.redesUDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Aula01_datagramSocket_cliente 
{
    public static void main(String[] args) throws Exception
    {
        // Criar conexao
        DatagramSocket dataCliente = null;

        try
        {
            // Solicitar mensagem para o usuário
            System.out.println("\nDigite a mensagem: ");
            // Criar fluxo de entrada
            BufferedReader entradaUsuario = new BufferedReader(new InputStreamReader(System.in));
            // Captar a mensagem num recipiente
            String message = entradaUsuario.readLine();

            // Criar conexao
            dataCliente = new DatagramSocket();

            // Traduzir hostname para IP
            InetAddress endereco = InetAddress.getByName("localhost");

            // Criar array para armazenar a mensagem do usuario
            byte[] dadosPraEnviar = new byte[1024];
            // Armazenar a mensagem do usuário dentro do array de bytes
            dadosPraEnviar = message.getBytes();

            // Criar pacote de datagrama para enviar dados
            DatagramPacket pacotePraEnviar = new DatagramPacket(dadosPraEnviar, dadosPraEnviar.length, endereco, 50000);
            // Enviar o capote pelo socket criado mais acima
            dataCliente.send(pacotePraEnviar);

            // Criar array para receber a mensagem devolvida do servidor
            byte[] dadosPraReceber = new byte[1024];
            // Criar pacote de datagrama para receber dados
            DatagramPacket pacotePraReceber = new DatagramPacket(dadosPraReceber, dadosPraReceber.length);
            // Método bloqueante para ouvir recebimento de pacote
            dataCliente.receive(pacotePraReceber);

            // Converte o pacote recebido em mensagem string
            String mensagemRetornada = new String(pacotePraReceber.getData());

            // Mostra a resposta do servidor para o usuário
            System.out.println("\nResposta do servidor: " + mensagemRetornada);
        }catch(IOException ex)
        {
            System.out.println("Excecao!");
        }
        finally
        {
            // Fecha conexao
            dataCliente.close();
        }
    }
}
package com.java.redesMulticast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Aula01_multicastChat extends Thread
{
    // Atributos de Classe
    private static String user = "";
    private static InetAddress endereco;
    private static int porta;
    
    // Construtor padrão
    public Aula01_multicastChat(){};
    
    // Método Driver para startar a aplicação
    public static void main(String[] args) 
    {
        // Tratamento de excecao
        try
        {
            // Recupera o endereço do parâmetro de entrada
            endereco = InetAddress.getByName("232.0.0.1");
            // Recupera a porta do parâmetro de entrada
            porta = Integer.parseInt("50000");

            // Cria objeto multicastChat do tipo thread e dá start no run (inicia a execução da thread em paralelo ao fluxo principal)
            Thread t = new Aula01_multicastChat();
            t.start();

            // Solicita o nome do usuário
            BufferedReader entrada1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Digite teu nome: ");
            user = entrada1.readLine();

            // Criar acesso ao grupo de multicast
            MulticastSocket mcSocket = new MulticastSocket();
            mcSocket.joinGroup(endereco);
            
            // Array de bytes para armazenar mensagem string. Esse array será inserido num pacote e enviado pela rede
            byte[] arraySuporte = new byte[64];
            
            // Loop infinito
            while(true)
            {
                Thread.sleep(50);
                // Solicita mensagem para o usuário
                System.out.println("Digite a mensagem: ");
                String mensagem = entrada1.readLine();
                
                // Condicional de saida - Caso o usuário digite sair, a aplicação será desligada
                if(mensagem.equalsIgnoreCase("sair"))
                {System.exit(0);}
                
                // concatena o nome do usuário com a mensagem
                String men = (user + " diz: " + mensagem);
                
                // Converte a mensagem string em um array de bytes, assim prepara para armazenar num pacote e enviar pela rede
                arraySuporte = men.getBytes();
                
                // Cria o pacote de envio
                DatagramPacket dgPacoteEnviar = new DatagramPacket(arraySuporte, arraySuporte.length, endereco, porta);
                
                // O socket envia o pacote pela rede
                mcSocket.send(dgPacoteEnviar);

            }
        }catch(Exception ioe)
        {System.err.println("Excecao!");}
    }
    
    @Override
    public void run()
    {
        try
        {
            // Criar array para receber a mensagem string
            byte[] buff = new byte[64];
            
            // Criar conexao
            MulticastSocket socketMult = new MulticastSocket(porta);
            // Registrar a conexao num grupo em determinado endereco
            socketMult.joinGroup(endereco);
            
            // Loop infinito
            while(true)
            {
                // Criar pacote de recebimento
                DatagramPacket receberPacote = new DatagramPacket(buff, buff.length);
                // O socketMulticasti recebe o pacote - método bloqueante
                socketMult.receive(receberPacote);
                
                // Converter a mensagem do pacote em string
                String mensa = new String(receberPacote.getData());
                
                // Condicional
                if(mensa.contains(user))
                {
                    System.out.println("\r");
                    System.out.println("\n" + mensa + "\n");
                }
                
                // Limpa o buffer para nova mensagem
                buff = new byte[64];
            }
        }catch(Exception eee)
        {System.err.println("Excecao no run()!");}
    }
}
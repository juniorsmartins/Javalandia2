package com.utfpr.avaliacoes.redes.atividade06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.System.*;
import java.rmi.Naming;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClienteUrna2 
{
    // Coleção para armazenamento temporário de votos
    public List<Voto> urna2 = new ArrayList<>();
    
    // Construtor privado
    private ClienteUrna2()
    {iniciarUrna();};

    // Iniciar o sistema da urna
    private void iniciarUrna()
    {
        // Try-catch para tratar exceções
        try
        {
            // Busca o objeto impVoto baseado no nome
            String objName = "rmi://localhost/eleicoes"; // Define o nome
            iVoto impVoto = (iVoto) Naming.lookup(objName); // Busca pelo nome
            out.println("\n------------------ Urna Ativa! ------------------");

            String encerrarUrna = "n";
            do
            {
                // Apresentar opções de voto
                out.println("--------------------------------------------------");
                out.println("--------------- CANDIDATOS");
                out.println("--------------------------------------------------");
                out.println("-------  1. Jair Messias Bolsonaro  ");
                out.println("-------  2. Luiz Inácio Lula da Silva ");
                out.println("-------  3. João Doria                    ");
                out.println("-------  4. Ciro Gomes                  ");
                out.println("-------  5. Branco                         ");
                out.println("--------------------------------------------------");

                // Captar votos
                Voto voto = null;
                do
                {
                    // Entrada de dados do console 
                    System.out.println("Digite o número do candidato (1 a 5): ");
                    Scanner scan = new Scanner(in);
                    String opcaoDeVoto = scan.nextLine();
                    // Método remoto para captar votos
                    voto = impVoto.criarVotos(opcaoDeVoto, voto);
                }while(voto == null);

                // Capta o voto de forma local temporariamente
                urna2.add(voto);
                
                // Perguntar se deseja encerrar a urna ou continuar votando
                out.println("\n\tDeseja encerrar a urna ('s' ou 'n'): ");
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                encerrarUrna = br.readLine();

            }while(!encerrarUrna.equalsIgnoreCase("s"));
            
            // Enviar os votos para a urna central-servidor
            out.println("\n-------------------- Enviando Votos --------------------");
            impVoto.enviarVotosParaContagem(urna2);
            Thread.sleep(5010);

            // Contagem parcial dos votos
            Map<String, Long> resultadoParcial = urna2.stream().collect(Collectors.groupingBy(Voto::getNomeDoCandidato, Collectors.counting()));

            // Apresentar resultado parcial
            out.println("\n-------------------- Resultado Da Urna --------------------");
            Stream<Map.Entry<String, Long>> resultado = resultadoParcial.entrySet().stream()
                        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));

            resultado.forEach(voto -> out.println("\t- " + voto.getKey() + ": " + voto.getValue()));
            out.println("\n");
            
        }catch(Exception e)
        {
            System.err.println("Excecão; " + e.toString());
            e.printStackTrace();
        }
    };
    
    // Método Driver
    public static void main(String[] args) 
    {new ClienteUrna2();}
}
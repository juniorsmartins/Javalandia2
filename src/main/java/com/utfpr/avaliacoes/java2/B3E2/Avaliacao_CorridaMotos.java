package com.utfpr.avaliacoes.java2.B3E2;

import com.utfpr.avaliacoes.java2.B3E2.Avaliacao_CorridaMotos.Corrida.Motociclista;
import java.util.ArrayList;
import java.util.Collections;
/**
 * @author Junior Soares Martins
 */
public class Avaliacao_CorridaMotos 
{   
    volatile static ArrayList<Motociclista> ordemChegada;
    volatile static ArrayList<Motociclista> ranking;
    static private int qtdCorridas;
    static private int qtdMotos;
    volatile static private int kmPista;
    volatile static private int pontuacao;
    
    public static void main(String[] args) 
    {
        // Entrada dos valores (definir número de corridas, quantia de competidores por corrida e a quantidade de km percorridos por pista)
        qtdCorridas = 10; // Quantidade de corridas
        qtdMotos = 10; // Quantia de corredores por corrida
        kmPista = 8; // Quantia de km para serem percorridos por pista
        ordemChegada = new ArrayList<>(qtdMotos);
        ranking = new ArrayList<>(qtdMotos);
                
        // Início de loop - para iniciar corridas
        for(int i = 1; i <= qtdCorridas; i++)
        {
            pontuacao = 10;
            String nome = "Corrida série: " + String.valueOf(i);
            Corrida corrida = new Corrida(nome);
            
            // Início de loop - para a thread principal aguardar o término da corrida
            while(corrida.thLargada.isAlive()) 
            {
                try 
                {Thread.sleep(50);} 
                catch (InterruptedException e) 
                {System.err.println("Corrida Interrompida!");}
            } // Fim de loop - para a thread principal aguardar o término da corrida

            if(ranking.isEmpty())
            {
                ranking = new ArrayList<>(ordemChegada);
                ordemChegada.clear();
            }else if(!ranking.isEmpty())
            {
                for(Motociclista moto : ordemChegada)
                {
                    for(int num = 0; num < qtdMotos; num++)
                    {
                        if(ranking.get(num).numComp == moto.numComp)
                        {
                            ranking.get(num).pontosComp += moto.pontosComp;
                        }
                    }
                }
                ordemChegada.clear();
            }
        } // Fim de loop - De início de corridas
        
        // Início do fechamento do campeonato
        System.out.println("\n-- Campeonato Encerrado! --");
        System.out.println("\n-------------------------");
        System.out.println("-------- RANKING --------");
        System.out.println("-------------------------");
        System.out.println("Lista em ordem decrescente");
        Collections.sort(ranking);
        ranking.forEach(moto -> System.out.println(moto.toString()));
        System.out.println("\n-- Premiações! --");
        System.out.println("\n-------------------------");
        System.out.println("--------- PÓDIO ---------");
        System.out.println("-------------------------");
        System.out.println("\n-----    Campeão    -----" + ranking.get(0));
        System.out.println("\n-----     Vice     -----" + ranking.get(1) + "\n\n");
        // Fim do fechamento do campeonato
    }


    
            static class Corrida implements Runnable
            {
                Thread thLargada;

                Corrida(String nome)
                {
                    thLargada = new Thread(this, nome);
                    thLargada.setPriority(Thread.MAX_PRIORITY);
                    thLargada.start();
                }

                @Override
                public void run()
                {
                    System.out.println("\n-------------------------------");
                    System.out.println("ID: " + thLargada.getId() + " " + thLargada.getName());
                    System.out.println("-------------------------------");
                    // Início de loop - para criar os competidores 
                    for(int x = 0; x < qtdMotos; x++)
                    {
                        String nomeComp = "Competidor #" + String.valueOf(x);
                        Motociclista moto = new Motociclista(nomeComp, x);
                    } // Fim de loop - para criar os competidores
                } 
                


                        class Motociclista implements Runnable, Comparable<Motociclista>
                        {
                            Thread thCompetidor;
                            private Integer numComp;
                            private Integer pontosComp = 0;

                            Motociclista(String nomeComp, Integer numComp)
                            {
                                this.numComp = numComp;
                                thCompetidor = new Thread(this, nomeComp);
                                thCompetidor.start();
                            }

                            @Override
                            public void run()
                            {
                                // Percurso da corrida (km de pista)
                                for(int x = 0; x < kmPista; x++)
                                {System.out.println(thCompetidor.getName() + " no km: " + x);}
                                System.out.println(thCompetidor.getName() + " passa pela linha de chegada!");
                                // Chamada de método sincronizado
                                this.areaCritica();
                            }

                            @Override
                            public String toString()
                            {
                                return "\nNome Thread: " + thCompetidor.getName() + 
                                        "\nNumero Competidor: " + this.numComp + 
                                        "\nPontos: " + this.pontosComp;
                            }

                            @Override
                            public int compareTo(Motociclista compareMotociclista) 
                            {
                                return (compareMotociclista.pontosComp - this.pontosComp);
                            }

                            // Início de método sincronizado para ser chamado no run()
                            synchronized void areaCritica()
                            {
                                this.pontosComp = pontuacao;
                                if(pontuacao > 0)
                                {pontuacao = pontuacao - 1;}
                                ordemChegada.add(this);
                            } // Fim de método sincronizado para ser chamado no run()
                        }
    }
}
package com.utfpr.avaliacoes.redes.atividade06;

import static java.lang.System.*;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ServidorEleitoral
{
    // Atributos Estáticos - coleções para contagem de votos
    public volatile static Map<String, Long> votacaoFinal = new LinkedHashMap<>();
    public volatile static List<Voto> urnaCentral = new ArrayList<>();
    public static int totalUrnas = 2;
    public static int numeroUrnas = 0;

    // Construtor
    public ServidorEleitoral(){};
      
    // Método Driver
    public static void main(String[] args) 
    {
        try
        {
            // Cria objeto para se tornar acessível via rede
            iVoto impVoto = new ImpVoto();
            String nomeObjeto = "rmi://localhost/eleicoes";
            
            // Registra o objeto no RMI de registros
            LocateRegistry.createRegistry(1099);
            Naming.rebind(nomeObjeto, impVoto); // Vincula o nome com o objeto que dará acesso aos métodos
            
            // Aviso de operacionabilidade
            out.println("\n-------------------- Servidor Ativo!  --------------------");
            
            // Verificar resultados parciais a cada 5 segundos
            int i = 0;
            do
            {
                // Processar votos captados
                if(!urnaCentral.isEmpty())
                {
                    // Contagem parcial dos votos
                    Map<String, Long> resultadoParcial1 = urnaCentral.stream().collect(Collectors.groupingBy(Voto::getNomeDoCandidato, Collectors.counting()));

                    // Apresentar resultado parcial
                    out.println(++i + "\n-------------------- Resultado Parcial --------------------");
                    Stream<Map.Entry<String, Long>> resultadoParcial2 = resultadoParcial1.entrySet().stream()
                                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));

                    for(Map.Entry<String, Long> voto : resultadoParcial2.toList())
                    {out.println("\t- " + voto.getKey() + ": " + voto.getValue());}
                    out.println("\n\n");
                }
                
                // Aguardar por cinco segundos
                Thread.sleep(5000);
                out.println(".");
            }while(numeroUrnas < 2);         

            // Apresentar resultado final
            out.println("\n-------------------- Votação Encerrada! Resultado Final --------------------");
            impVoto.calcularResultados();
            
            Stream<Map.Entry<String, Long>> resultadoFinal = votacaoFinal.entrySet().stream()
                                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));

            for(Map.Entry<String, Long> voto : resultadoFinal.toList())
            {out.println("\t- " + voto.getKey() + ": " + voto.getValue());}
            out.println("\n\n");
            
            exit(0);

        }catch(Exception e)
        {e.printStackTrace();}
    }
}
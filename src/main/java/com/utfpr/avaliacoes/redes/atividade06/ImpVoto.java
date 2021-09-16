package com.utfpr.avaliacoes.redes.atividade06;

import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.stream.Collectors;

public class ImpVoto extends UnicastRemoteObject implements iVoto
{
    @Override
    public Voto criarVotos(String opcaoDeVoto, Voto voto) 
    {
        // Rotear para criar voto
        switch(opcaoDeVoto)
        {
            case "1":
            case "Jair Messias Bolsonaro":
                voto = new Voto("Jair Messias Bolsonaro");
                break;
            case "2":
            case "Luiz Inácio Lula da Silva":
                voto = new Voto("Luiz Inácio Lula da Silva");
                break;
            case "3":
            case "João Doria":
                voto = new Voto("João Doria");
                break;
            case "4":
            case "Ciro Gomes":
                voto = new Voto("Ciro Gomes");
                break;
            case "5":
            case "Branco":
                voto = new Voto("Branco");
                break;
            default:
                break;
        }
        return voto;
    }

    @Override
    public void enviarVotosParaContagem(List<Voto> urna)
    {
        for(Voto voto : urna)
        {ServidorEleitoral.urnaCentral.add(voto);}
        ServidorEleitoral.numeroUrnas += 1;
    };

    @Override
    public void calcularResultados()
    {
        ServidorEleitoral.votacaoFinal = ServidorEleitoral.urnaCentral
                .stream().collect(Collectors.groupingBy(Voto::getNomeDoCandidato, Collectors.counting()));
    };
}
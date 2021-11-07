package com.patterns.estrutural.adapter.exemplo01;

import com.patterns.comportamental.state.exemplo01.DomainException;
import com.patterns.estrutural.adapter.exemplo01.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento
{
    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http)
    {this.http = http;}

    public void registrar(Orcamento orcamento)
    {
        if(!orcamento.isFinalizado())
        {throw new DomainException("Orcamento não finalizado!");}

        // chamada HTTP para API externa (pode ser feito por: URL Connection ou HTTP Client ou Lib Rest)
        String url = "http://api.externa/orcamento"; // url fictícia
        Map<String, Object> dados = Map.of("valor", orcamento.getValor(),"quantidadeItens", orcamento.getQuantidade());
        http.post(url, dados);
    }



}







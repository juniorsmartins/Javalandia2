package com.patterns.observer.exemplo01;

import com.patterns.observer.exemplo01.acoes.EnviarEmailPedido;
import com.patterns.observer.exemplo01.acoes.SalvarPedidoBancoDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos
{
    public static void main(String[] args)
    {
        String cliente = "Marília de Souza";
        BigDecimal valorOrcamento = new BigDecimal("600");
        int quantidadeItens = 10;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new SalvarPedidoBancoDados(), new EnviarEmailPedido()));
        handler.execute(gerador);

    }
}










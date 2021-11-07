package com.patterns.comportamental.command.exemplo01;

import java.math.BigDecimal;

public class TestesPedidos
{
    public static void main(String[] args)
    {
        String cliente = "Marília de Souza";
        BigDecimal valorOrcamento = new BigDecimal("600");
        int quantidadeItens = 10;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(/*aqui passaria as dependências repository e etc*/);
        handler.execute(gerador);

    }
}










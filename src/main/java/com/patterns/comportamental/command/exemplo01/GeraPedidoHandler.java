package com.patterns.comportamental.command.exemplo01;

import java.time.LocalDateTime;

public class GeraPedidoHandler
{
    // construtor com injeção de dependências: repository, service e etc.

    public void execute(GeraPedido dados)
    {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        // aqui usaria a injeção de dependência para mandar salvar com repository e etc....
        System.out.println("Salvar pedido");
        System.out.println("Enviar confirmação por e-mail");
    }
}








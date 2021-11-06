package com.patterns.observer.exemplo01;

import com.patterns.observer.exemplo01.acoes.AcaoAposGerarPedido;
import com.patterns.observer.exemplo01.acoes.EnviarEmailPedido;
import com.patterns.observer.exemplo01.acoes.SalvarPedidoBancoDados;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler
{
    private List<AcaoAposGerarPedido> acoes;

    public void execute(GeraPedido dados)
    {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

    }


}








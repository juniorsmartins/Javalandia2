package com.patterns.estrutural.adapter.exemplo01;

import com.patterns.estrutural.adapter.exemplo01.http.JavaHttpClient;

import java.math.BigDecimal;

public class TestesAdapter
{
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);
    }
}

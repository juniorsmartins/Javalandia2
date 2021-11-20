package com.java.moeda;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;
import org.javamoney.moneta.FastMoney;
import org.javamoney.moneta.Money;
import org.javamoney.moneta.convert.ExchangeRateType;
import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.NumberValue;
import javax.money.convert.CurrencyConversion;
import javax.money.convert.ExchangeRateProvider;
import javax.money.convert.MonetaryConversions;

public class Aula03_ConverterDinheiro
{
    public static void main(String[] args)
    {
        //Primeiro vamos criar as moedas e os valores
        // moedas
        CurrencyUnit dolar = Monetary.getCurrency("USD");
        CurrencyUnit real = Monetary.getCurrency("BRL");
        // valores
        MonetaryAmount valorProdutoDolar = FastMoney.of(90, dolar);
        MonetaryAmount valorImpostoReal = FastMoney.of(30, real);

        //Agora vamos usar o provider para pegar a cotação
        ExchangeRateProvider provider = MonetaryConversions.getExchangeRateProvider(ExchangeRateType.ECB);

        //Vamos pegar a conversão atual(do dia)
        CurrencyConversion conversaoAtual = provider.getCurrencyConversion(dolar);

        //Agora vamos transformar o valor do imposto em Real para dólar
        MonetaryAmount valorImpostoDolar = conversaoAtual.apply(valorImpostoReal);

        //Agora que o valor do imposto está em dólar, podemos somar com o valor inicial do produto
        MonetaryAmount valorFinalProdutoDolar = valorProdutoDolar.add(valorImpostoDolar);

        System.out.println(valorFinalProdutoDolar);

        valorMensalidadeAluno();
    }

    public static void valorMensalidadeAluno()
    {
        String nomeAluno = "Lazaro Jr";

        CurrencyUnit real = Monetary.getCurrency("BRL");
        MonetaryAmount valorMensalidade = Money.of(35, real);

        NumberValue valosMensalidadeSemMoeda = valorMensalidade.getNumber();

        NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
        String valorMensalidadePorExtenso = conversor.toWords(valosMensalidadeSemMoeda.doubleValue());

        System.out.println("Sistema de Cobrança Alura. Boa noite "+ nomeAluno + ". A sua mensalidade desse é de " + valorMensalidadePorExtenso);
    }
}

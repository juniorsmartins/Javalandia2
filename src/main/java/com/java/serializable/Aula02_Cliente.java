package com.java.serializable;

import java.io.Serializable;

public class Aula02_Cliente implements Serializable
{
    private String nome;
    private int idade;
    private double salario;

    public Aula02_Cliente(){}

    public String getNome()
    {return nome;}
    public void setNome(String nome)
    {this.nome = nome;}
    public int getIdade()
    {return idade;}
    public void setIdade(int idade)
    {this.idade = idade;}
    public double getSalario()
    {return salario;}
    public void setSalario(double salario)
    {this.salario = salario;}

    @Override
    public String toString() {
        return "Aula02_Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                '}';
    }
}

package com.java.iterator;

public class Aula01_Cliente
{
    private String nome;
    private String cpf;

    public Aula01_Cliente(String nome, String cpf)
    {
        this.setNome(nome);
        this.setCpf(cpf);
    }

    public String getNome()
    {return nome;}
    public void setNome(String nome)
    {this.nome = nome;}
    public String getCpf()
    {return cpf;}
    public void setCpf(String cpf)
    {this.cpf = cpf;}

    @Override
    public String toString()
    {
        return "\nCliente\nNome: " + this.getNome()
                + "\nCPF: " + this.getCpf();
    }
}

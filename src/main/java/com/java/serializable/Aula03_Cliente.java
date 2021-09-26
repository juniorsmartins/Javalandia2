package com.java.serializable;

import java.io.Serializable;

public class Aula03_Cliente implements Serializable
{
    private static final long serialVersionUID = 1L;

    private String nome;
    private String cpf;
    private String profissao;

    public Aula03_Cliente(){}
    public Aula03_Cliente(String nome, String cpf, String profissao)
    {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setProfissao(profissao);
    }

    public String getNome()
    {return nome;}
    public void setNome(String nome)
    {this.nome = nome;}
    public String getCpf()
    {return cpf;}
    public void setCpf(String cpf)
    {this.cpf = cpf;}
    public String getProfissao()
    {return profissao;}
    public void setProfissao(String profissao)
    {this.profissao = profissao;}

    @Override
    public String toString()
    {
        return "\nCliente"
                + "\nNome: " + this.getNome()
                + "\nCPF: " + this.getCpf()
                + "\nProfissão: " + this.getProfissao();
    }
}

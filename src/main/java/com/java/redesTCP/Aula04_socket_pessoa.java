package com.java.redesTCP;

import java.io.Serializable;

public class Aula04_socket_pessoa implements Serializable
{
    // Atributo de Instância
    private String nome;
    private int idade;
    // Construtor
    public Aula04_socket_pessoa(){};
    public Aula04_socket_pessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters
    public String getNome() 
    {return nome;}
    public void setNome(String nome) 
    {this.nome = nome;}
    public int getIdade() 
    {return idade;}
    public void setIdade(int idade) 
    {this.idade = idade;}

    // Metodo sobreescrito
    @Override
    public String toString() 
    {return "\n Aula04_socket_pessoa {" 
            + "nome = " + nome 
            + ", idade = " + idade 
            + "}\n";}
}
package com.java.redesRMI;

import java.io.Serializable;

public class Aula01_Pessoa implements Serializable
{
    // Atributos de Instância
    private String nome;
    private int idade;
    
    // Métodos Getters e Setters
    public String getNome() 
    {return nome;}
    public void setNome(String nome) 
    {this.nome = nome;}
    public int getIdade() 
    {return idade;}
    public void setIdade(int idade) 
    {this.idade = idade;}
    
    // Metodos sobreescritos
    @Override
    public String toString() 
    {return "Aula01_Pessoa {" + "Nome = " + nome + ", Idade = " + idade + '}';}
}
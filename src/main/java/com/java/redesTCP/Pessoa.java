package com.java.redesTCP;

import java.io.Serializable; 
 
// Modelo Cliente - Mvc
public final class Pessoa implements Serializable
{
    // Atributos de Instância 
    private String nome = ""; 
    private int idade = 0; 
    private String mensagem = ""; 
     
    // Construtores 
    public Pessoa(){}; // Padrão
    public Pessoa(String nome, int idade) // Parametrizado 
    { 
        super(); 
        this.setNome(nome); 
        this.setIdade(idade); 
    } 
     
    // Métodos Setters(modificador) 
    public void setNome(String nome) 
    {this.nome = nome;} 
    public void setIdade(int idade) 
    {this.idade = idade;} 
    public void setMensagem(String mensagem) 
    {this.mensagem = mensagem;} 
 
    // Métodos Getters(acesso) 
    public String getNome() 
    {return nome;} 
    public int getIdade() 
    {return idade;} 
    public String getMensagem() 
    {return mensagem;}
}
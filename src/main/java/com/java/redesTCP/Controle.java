package com.java.redesTCP;

import com.utfpr.ITelaControle;
import com.utfpr.Pessoa;
import java.io.IOException; 
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream; 
import java.net.Socket; 

// Controle Cliente - mvC 
public final class Controle implements ITelaControle
{
    // Atributos de instância 
    private Socket conexao; 
    private ObjectOutputStream forward; 
    private ObjectInputStream received;  
     
    @Override 
    public String acionarControle(String txt_nome, String txt_idade) 
    { 
        int idade; 
 
        // Tratamento de exceção na conversão do string/texto em inteiro 
        try 
        { 
            idade = Integer.parseInt(txt_idade); 
        } 
        catch(NumberFormatException nfe) 
        {return "Idade Inválida! Tente novamente.";} 
         
        // Instancia pessoa com as informações inputadas pelo usuário 
        Pessoa modeloPessoa = new Pessoa(txt_nome, idade); 
         
        // Repositório da mensagem de retorno do servidor 
        String mensagem = ""; 
        try 
        { 
            // Define endereço de conexao com o servidor e porta 
            conexao = new Socket("127.0.0.1", 53321); 
             
            // Cria canal de fluxo de saida 
            forward = new ObjectOutputStream(conexao.getOutputStream()); 
             
            // Enviar objeto ao servidor 
            forward.writeObject(modeloPessoa); 
             
            // Criar canal de fluxo de entrada 
            received = new ObjectInputStream(conexao.getInputStream()); 
             
            // Receber resposta do servidor 
            Pessoa modeloPessoaRetornado = new Pessoa(); 
            modeloPessoaRetornado = (Pessoa) received.readObject(); 
              
            // Recupera a mensagem do servidor para exibição 
            mensagem = modeloPessoaRetornado.getMensagem(); 
 
            // Fechar conexão e canais 
            received.close(); 
            forward.close(); 
            conexao.close(); 
        } 
        catch (ClassNotFoundException ex)  
        {ex.toString();} 
        catch(IOException ii) 
        {ii.toString();} 
        
        return mensagem; 
    }; 
}
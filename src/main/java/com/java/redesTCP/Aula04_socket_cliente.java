package com.java.redesTCP;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Aula04_socket_cliente 
{
    public static void main(String[] args) throws IOException
    {
        // Criar conexao
        Socket conexao = null;
        // Criar canal de envio
        ObjectOutputStream out = null;

        // Tratamento de excecao
        try
        {
            // Criar conexao
            conexao = new Socket("127.0.0.1", 44444);
            // Criar canal de envio
            out = new ObjectOutputStream(conexao.getOutputStream());
            
            // Criar objeto para envio
            Aula04_socket_pessoa pes = new Aula04_socket_pessoa();
            pes.setNome("Paulo");
            pes.setIdade(52);
            
            // Enviar objeto
            out.writeObject(pes);
            
        }catch(IOException ioe)
        {System.err.println("Excecao!");}
        finally
        {
            out.close();
            conexao.close();
        }
    }
}
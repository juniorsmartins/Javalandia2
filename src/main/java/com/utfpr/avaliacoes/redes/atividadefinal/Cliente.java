package com.utfpr.avaliacoes.redes.atividadefinal;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Cliente 
{
    public Cliente()
    {run();}
      
    public static void main(String[] args) 
    {new Cliente();}
    
    private void run()
    {
        try
        {
            String nomeObjetoRemoto = "rmi://localhost/calcular";
            ICalculadora objetoRemoto = (ICalculadora) Naming.lookup(nomeObjetoRemoto);
            
            System.out.println("\n---------- Cliente Ativo! ----------");

            boolean loop = true;
            do
            {
                Scanner scan = new Scanner(System.in);
                System.out.println("\n------------------------------");
                System.out.println("----------- MENU -------------");
                System.out.println("------------------------------");
                System.out.println("---------- 0 - Sair ----------");
                System.out.println("---------- 1 - Somar ---------");
                System.out.println("--------- 2 - Dividir --------");
                System.out.println("--------- 3 - Subtrair -------");
                System.out.println("------- 4 - Multiplicar ------");
                System.out.println("------------------------------");
                System.out.println("-- Digite uma opcao: ");
                String opcao = scan.nextLine();
                long resultado = 0;
                switch(opcao)
                {
                    case "0":
                        System.exit(0);
                        break;
                    case "1":
                        somar(scan, objetoRemoto);
                        loop = false;
                        break;
                    case "2":
                        dividir(scan, objetoRemoto);
                        loop = false;
                        break;
                    case "3":
                        subtrair(scan, objetoRemoto);
                        loop = false;
                        break;
                    case "4":
                        multiplicar(scan, objetoRemoto);
                        loop = false;
                        break;
                    default:
                        break;
                }
            }while(loop == true);
            
        }catch(NotBoundException | MalformedURLException | RemoteException re)
        {System.err.println("\nExcecao!");}
    }
    
    public void somar(Scanner scan, ICalculadora objetoRemoto)
    {
        boolean resp = false;
        do
        {
            try
            {
                System.out.println("\nDigite valor A: ");
                long valorA = Long.parseLong(scan.nextLine());
                System.out.println("Digite valor B: ");
                long valorB = Long.parseLong(scan.nextLine());
                
                System.out.println("\nResultado da soma: " + objetoRemoto.add(valorA, valorB));
                
                resp = true;
            }catch(RemoteException | NumberFormatException nfe)
            {System.err.println("\nExcecao! Tente novamente.");}
        }while(resp == false);
    }
    
    public void dividir(Scanner scan, ICalculadora objetoRemoto)
    {
        boolean resp = false;
        do
        {
            try
            {
                System.out.println("\nDigite valor A: ");
                long valorA = Long.parseLong(scan.nextLine());
                System.out.println("Digite valor B: ");
                long valorB = Long.parseLong(scan.nextLine());
                
                System.out.println("\nResultado da divisao: " + objetoRemoto.div(valorA, valorB));
                
                resp = true;
            }catch(ArithmeticException | RemoteException | NumberFormatException nfe)
            {System.err.println("\nExcecao! Tente novamente.\n");}
        }while(resp == false);
    }
    
    public void subtrair(Scanner scan, ICalculadora objetoRemoto)
    {
        boolean resp = false;
        do
        {
            try
            {
                System.out.println("\nDigite valor A: ");
                long valorA = Long.parseLong(scan.nextLine());
                System.out.println("Digite valor B: ");
                long valorB = Long.parseLong(scan.nextLine());
                
                System.out.println("\nResultado da subtracao: " + objetoRemoto.sub(valorA, valorB));
                
                resp = true;
            }catch(RemoteException | NumberFormatException nfe)
            {System.err.println("\nExcecao! Tente novamente.\n");}
        }while(resp == false);
    }
    
    public void multiplicar(Scanner scan, ICalculadora objetoRemoto)
    {
        boolean resp = false;
        do
        {
            try
            {
                System.out.println("\nDigite valor A: ");
                long valorA = Long.parseLong(scan.nextLine());
                System.out.println("Digite valor B: ");
                long valorB = Long.parseLong(scan.nextLine());
                
                System.out.println("\nResultado da multiplicacao: " + objetoRemoto.mul(valorA, valorB));
                
                resp = true;
            }catch(RemoteException | NumberFormatException nfe)
            {System.err.println("\nExcecao! Tente novamente.\n");}
        }while(resp == false);
    }
}

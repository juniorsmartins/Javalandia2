package com.java.io;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Aula13_MainScanner
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(new File("contas.csv"));
        System.out.println();

        while(scan.hasNextLine())
        {
            String linha = scan.nextLine();
            System.out.println(linha);

//            String[] valores = linha.split(",");
//            System.out.println(Arrays.toString(valores));
//            System.out.println(valores[3]);

            // Novo Scanner para tratar cada linha
            Scanner scanLinha = new Scanner(linha);
            scanLinha.useLocale(Locale.US); // define padrão de regras - por exemplo: sabe do . ponto em números flutuantes
            scanLinha.useDelimiter(",");

            String tipoConta = scanLinha.next();
            int agencia = scanLinha.nextInt();
            int numero = scanLinha.nextInt();
            String titular = scanLinha.next();
            double saldo = scanLinha.nextDouble();

/*            String valorFormatado = String.format(new Locale("pt", "BR"),"Tipo Conta: %s - " +
                    "Agência: %04d - Número: %d - Titular: %15s - Saldo: %.2f\n",
                    tipoConta, agencia, numero, titular, saldo);
            System.out.println(valorFormatado);
*/
            // ou pode ser assim

            System.out.format(new Locale("pt", "BR"),"Tipo Conta: %s - " +
                            "Agência: %04d - Número: %d - Titular: %15s - Saldo: %.2f\n\n",
                    tipoConta, agencia, numero, titular, saldo);

            scanLinha.close();
        }
        scan.close();
    }
}

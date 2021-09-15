package com.utfpr.avaliacoes.java2.B2A1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileSystem {

    // FIXME ajustar para o caminho no PC do aluno
    public static String ROOT = "D:" + File.separator + "hd";

    // Construtor
    public FileSystem() {
        executar();
    }

    private void executar() 
    {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao sistema de arquivos!");

        var stop = false;
        var currentPath = Paths.get(ROOT);
        while (!stop) {
            try {
                System.out.println("$>");
                final var command = Command.parseCommand(scanner.nextLine());
                currentPath = command.execute(currentPath); 
                stop = command.shouldStop();
            } catch (UnsupportedOperationException | IOException ex) {
                System.out.printf("%s", ex.getMessage()).println();
            }
        }

        System.out.println("Sistema de arquivos encerrado.");
    }

    // M�todo Driver
    public static void main(String[] args) {
        new FileSystem();
    }
}

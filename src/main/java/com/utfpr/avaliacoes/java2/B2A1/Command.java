package com.utfpr.avaliacoes.java2.B2A1;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.stream.Stream;

public enum Command {

    LIST() {
        @Override
        boolean accept(String command) {
            final var commands = command.split(" ");
            return commands.length > 0 && commands[0].startsWith("LIST") || commands[0].startsWith("list");
        }

        @Override
        Path execute(Path path) throws IOException 
        {

            // TODO implementar o LIST
            Path dirs = Paths.get(FileSystem.ROOT);
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(dirs)) 
            {
                System.out.println("Conte�do de: " + dirs.toString());
                for (Path file: stream) 
                {System.out.println(file.getFileName());}
            } catch (UnsupportedOperationException | IOException x) 
            {System.err.println(x);}

                        
            return path;
        }
    },
    SHOW() {
        private String[] parameters = new String[]{};

        @Override
        void setParameters(String[] parameters) {
            this.parameters = parameters;
        }

        @Override
        boolean accept(String command) {
            final var commands = command.split(" ");
            return commands.length > 0 && commands[0].startsWith("SHOW") || commands[0].startsWith("show");
        }

        @Override
        Path execute(Path path) throws IOException 
        {
            
            // TODO implementar o SHOW
            if(parameters.length == 2)
            {
                Path caPath = Paths.get(FileSystem.ROOT);
                String caminho = caPath + File.separator + parameters[1];
                File fille = new File(caminho);
                if(fille.exists() && fille.isFile() && fille.canRead())
                {
                    if(fille.getName().endsWith(".txt"))
                    {
                        try
                        {
                            try (Stream<String> lines = Files.lines(fille.toPath())) 
                            {lines.forEach(System.out::println);}
                        }
                        catch(UnsupportedOperationException | IOException oo)
                        {oo.printStackTrace();}
                    }else
                    {System.out.println("N�o h� suporte ao arquivo! O comando Show funciona apenas com arquivos de extens�o: txt");}
                }
                else if(fille.exists() && fille.isDirectory())
                {System.out.println("O comando Show n�o funciona com diret�rios!");}
                else
                {System.out.println("Nome Inexistente! Tente novamente");}
            }
            else if(parameters.length == 1)
            {System.out.println("Comando incompleto! Acrescente o nome do arquivo");}
            else
            {System.out.println("Comando inv�lido! Tente novamente");}

            
            return path;
        }
    },
    BACK() {
        @Override
        boolean accept(String command) {
            final var commands = command.split(" ");
            return commands.length > 0 && commands[0].startsWith("BACK") || commands[0].startsWith("back");
        }

        @Override
        Path execute(Path path) 
        {

            // TODO implementar o BACK
            if(!FileSystem.ROOT.equalsIgnoreCase("d:\\hd"))
            {
                File arquivoFile = new File(FileSystem.ROOT);
                String endereco = arquivoFile.getParent();
                FileSystem.ROOT = endereco;
            }else
            {System.out.println("J� estamos na ra�z do diretorio! hd");}

            
            return path;
        }
    },
    OPEN() {
        private String[] parameters = new String[]{};

        @Override
        void setParameters(String[] parameters) {
            this.parameters = parameters;
        }

        @Override
        boolean accept(String command) {
            final var commands = command.split(" ");
            return commands.length > 0 && commands[0].startsWith("OPEN") || commands[0].startsWith("open");
        }

        @Override
        Path execute(Path path) 
        {
            
            // TODO implementar o OPEN
            if(parameters.length == 2)
            {
                Path camPath = Paths.get(FileSystem.ROOT);
                String novoCaminho = camPath + File.separator + parameters[1];
                File fil = new File(novoCaminho);
                if(fil.exists() && fil.isDirectory())
                {
                    FileSystem.ROOT = novoCaminho;
                }
                else if(fil.exists() && fil.isFile())
                {System.out.println("O comando Open n�o funciona com arquivos! ");}
                else
                {System.out.println("Nome incorreto! Tente novamente");}
            }
            else if(parameters.length == 1)
            {System.out.println("Comando incompleto! Acrescente o nome do diret�rio");}
            else
            {System.out.println("Comando inv�lido! Tente novamente");}


            return path;
        }
    },
    DETAIL() {
        private String[] parameters = new String[]{};

        @Override
        void setParameters(String[] parameters) {
            this.parameters = parameters;
        }

        @Override
        boolean accept(String command) {
            final var commands = command.split(" ");
            return commands.length > 0 && commands[0].startsWith("DETAIL") || commands[0].startsWith("detail");
        }

        @Override
        Path execute(Path path) throws IOException 
        {

            // TODO implementar o DETAIL
            if(parameters.length == 2)
            {
                Path cPath = Paths.get(FileSystem.ROOT);
                String caminho = cPath + File.separator + parameters[1];
                File fille = new File(caminho);
                Path p = Paths.get(fille.getPath());
                BasicFileAttributes view = Files.getFileAttributeView(p, BasicFileAttributeView.class).readAttributes();
                FileTime fileTime = view.creationTime();
                if(fille.exists())
                {
                    System.out.println("� diret�rio [" + view.isDirectory() + "]");
                    System.out.println("Size [" + view.size() + "]");
                    System.out.println("Criado em [" + view.creationTime() + "]");
                    System.out.println("�ltimo acesso [" + view.lastAccessTime() + "]");
                }
                else
                {System.out.println("Nome Inexistente! Tente novamente");}
            }
            else if(parameters.length == 1)
            {System.out.println("Comando incompleto! Acrescente o nome do arquivo ou do diret�rio");}
            else
            {System.out.println("Comando inv�lido! Tente novamente");}

            return path;
        }
    },
    EXIT() {
        @Override
        boolean accept(String command) {
            final var commands = command.split(" ");
            return commands.length > 0 && commands[0].startsWith("EXIT") || commands[0].startsWith("exit");
        }

        @Override
        Path execute(Path path) {
            System.out.print("Saindo...");
            return path;
        }

        @Override
        boolean shouldStop() {
            return true;
        }
    };

    abstract Path execute(Path path) throws IOException;

    abstract boolean accept(String command);

    void setParameters(String[] parameters) {
    }

    boolean shouldStop() {
        return false;
    }

    public static Command parseCommand(String commandToParse) {

        if (commandToParse.isBlank()) {
            throw new UnsupportedOperationException("Type something...");
        }

        final var possibleCommands = values();

        for (Command possibleCommand : possibleCommands) {
            if (possibleCommand.accept(commandToParse)) {
                possibleCommand.setParameters(commandToParse.split(" "));
                return possibleCommand;
            }
        }

        throw new UnsupportedOperationException("Can't parse command [%s]".formatted(commandToParse));
    }
}












                // TODO implementar o SHOW
//            if(parameters.length == 2)
//            {
//                Path p4 = FileSystems.getDefault().getPath(path + File.separator + parameters[1]);
//                try (Stream<String> lines = Files.lines(p4)) 
//                {lines.forEach(System.out::println);}
//                catch(IOException e) 
//                {e.printStackTrace();}
//
//                System.out.println("Teste " + parameters.length);
//            }
//            else if(parameters.length == 1)
//            {System.out.println("Comando incompleto! Acrescente o diret�rio ou arquivo");}
//            else
//            {System.out.println("Comando inv�lido! Tente novamente");}


            // TODO implementar o LIST
//            File diretorio = new File(FileSystem.ROOT);
//            System.out.println("Endere�o: " + diretorio.getAbsolutePath());
//            for(File file:diretorio.listFiles())
//            {System.out.println(file.getName());}





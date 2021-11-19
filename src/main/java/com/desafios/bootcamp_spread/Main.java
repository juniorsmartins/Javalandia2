package com.desafios.bootcamp_spread;

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        Curso curso1 = new Curso();
        curso1.setTitulo("Bootcamp Spread");
        curso1.setDescricao("Desafio Java Developer");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Bootcamp Dio");
        curso2.setDescricao("Desafio JavaScript Developer");
        curso2.setCargaHoraria(6);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Fundamentos de Java 8 e 11");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        System.out.println("----------------------------------------------");

        Dev dev1 = new Dev();
        dev1.setNome("Camila");
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println("----- Antes -----");
        System.out.println("Conteúdo inscrito de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("Conteúdo concluído de " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        dev1.progredir();
        System.out.println("----- Depois -----");
        System.out.println("Conteúdo inscrito de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("Conteúdo concluído de " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("XP = " + dev1.calcularTotalXp());

        System.out.println("----------------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("----- Antes -----");
        System.out.println("Conteúdo inscrito de " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("Conteúdo concluído de " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("----- Depois -----");
        System.out.println("Conteúdo inscrito de " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("Conteúdo concluído de " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        System.out.println("XP = " + dev2.calcularTotalXp());




    }


}





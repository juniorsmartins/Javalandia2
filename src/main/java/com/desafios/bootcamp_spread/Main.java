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

    }


}





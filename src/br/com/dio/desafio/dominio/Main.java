package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descriçao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descriçao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("Descrição mentoria de java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devGabriel.getConteudoInscritos());
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devGabriel.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos" + devGabriel.getConteudoConcluidos());
        System.out.println("XP" + devGabriel.calcularXp());

        System.out.println("---------------------------------------");

        Dev devFernando = new Dev();
        devFernando.setNome("Fernando");
        devFernando.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devFernando.getConteudoInscritos());
        devFernando.progredir();
        devFernando.progredir();
        devFernando.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devFernando.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos" + devFernando.getConteudoConcluidos());
        System.out.println("XP" + devFernando.calcularXp());







    }


}

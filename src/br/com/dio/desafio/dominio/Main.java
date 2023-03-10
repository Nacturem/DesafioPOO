package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("descriçao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java Script");
        curso2.setDescricao("Descriçao curso JS");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo(" SQL");
        curso3.setDescricao("Descriçao curso SQL");
        curso3.setCargaHoraria(10);


        Curso curso4 = new Curso();
        curso4.setTitulo("Python");
        curso4.setDescricao("Descriçao curso Python");
        curso4.setCargaHoraria(15);

        Curso curso5 = new Curso();
        curso5.setTitulo("PHP");
        curso5.setDescricao("Descriçao curso PHP");
        curso5.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria de java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(curso4);
        bootcamp.getConteudos().add(curso5);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriel = new Dev();
        System.out.println(" ");
        devGabriel.setNome("Gabriel:");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gabriel: \n"  + devGabriel.getConteudoInscritos());
        devGabriel.progredir();
        devGabriel.progredir();
        devGabriel.progredir();
        devGabriel.progredir();
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Gabriel:\n" + devGabriel.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Gabriel:\n" + devGabriel.getConteudoConcluidos());
        System.out.println("Total XP: " + devGabriel.calcularXp());

        System.out.println("---------------------------------------");

        Dev devFernando = new Dev();
        devFernando.setNome("Fernando");
        devFernando.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Fernando:\n" + devFernando.getConteudoInscritos());
        devFernando.progredir();
        devFernando.progredir();
        devFernando.progredir();
        devFernando.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Fernando:\n" + devFernando.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Fernando:\n" + devFernando.getConteudoConcluidos());
        System.out.println("Total XP: " + devFernando.calcularXp());


        System.out.println("---------------------------------------");

        Dev devAllysoon = new Dev();
        devFernando.setNome("Allysson");
        devAllysoon.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Allysson:\n" + devAllysoon.getConteudoInscritos());
        devAllysoon.progredir();
        devAllysoon.progredir();
        devAllysoon.progredir();
        System.out.println("Conteúdos Inscritos Allysson:\n" + devAllysoon.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Allysson:\n" + devAllysoon.getConteudoConcluidos());
        System.out.println("Total XP: " + devAllysoon.calcularXp());


    }


}

package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

   private LocalDate data;

    public LocalDate getData() {
        return data;
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }


    public Mentoria() {
    }


    @Override
    public String toString() {
       return "Mentoria{" +
                   " " + getTitulo() + '\'' +
                 ", Descricao='" + getDescricao() + '\'' +
               ", Data= " + data +
                '}';

    }



}




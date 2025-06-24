package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

      Curso curso1 = new Curso();
      curso1.setTitulo("Curso Java");
      curso1.setDescricao("descricao do Curso Java");
      curso1.setCargaHoraria(8);
      System.out.println(curso1.getTitulo());

      Mentoria mentoria1 = new Mentoria();
      mentoria1.setTitulo("Mentoria Java");
      mentoria1.setDescricao("descricao do mentoria Java");
      mentoria1.setData(LocalDate.now());
    }
}
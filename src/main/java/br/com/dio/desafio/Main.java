package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

      Curso curso1 = new Curso();
      curso1.setTitulo("Curso Java");
      curso1.setDescricao("descricao do Curso Java");
      curso1.setCargaHoraria(8);

      Mentoria mentoria1 = new Mentoria();
      mentoria1.setTitulo("Mentoria Java");
      mentoria1.setDescricao("descricao do mentoria Java");
      mentoria1.setData(LocalDate.now());

      Bootcamp bootcamp = new Bootcamp();
      bootcamp.setNome("Bootcamp Java");
      bootcamp.setDescricao("descricao do Bootcamp Java");
      bootcamp.getConteudos().add(curso1);
      bootcamp.getConteudos().add(mentoria1);

      Dev devSamara = new Dev();
      devSamara.setNome("Samara");
      devSamara.inscreverBootcamp(bootcamp);
      devSamara.progredir();
      System.out.println(devSamara.getConteudosInscritos());
      System.out.println(devSamara.getConteudosConcluidos());
      System.out.println(devSamara.calcularTotalXp());
    }
}
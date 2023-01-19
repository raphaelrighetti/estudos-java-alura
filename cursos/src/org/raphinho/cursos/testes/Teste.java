package org.raphinho.cursos.testes;

import org.raphinho.cursos.modelos.Aula;
import org.raphinho.cursos.modelos.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        Curso java = new Curso("Curso de Java", "Raphael Righetti");

        Aula aula1 = new Aula("Conhecendo Java", 15);
        Aula aula2 = new Aula("Mais Java", 10);
        Aula aula3 = new Aula("Java pra caramba", 30);

        java.addAula(aula1);
        java.addAula(aula2);
        java.addAula(aula3);

        System.out.println(java.getTempoTotal());

        List<Aula> aulasImutaveis = java.getAulas();

        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);

        aulasMutaveis.sort(Comparator.comparingInt(Aula::getDuracao));

        System.out.println(aulasMutaveis);
    }
}

package org.raphinho.exerciciostream.testes;

import org.raphinho.exerciciostream.modelos.Curso;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teste {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();

        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos = cursos.stream()
                .filter(c -> c.getAlunos() >= 50)
                .sorted((c1, c2) -> Integer.compare(c2.getAlunos(), c1.getAlunos()))
                .collect(Collectors.toList());

        System.out.println(cursos);
    }
}

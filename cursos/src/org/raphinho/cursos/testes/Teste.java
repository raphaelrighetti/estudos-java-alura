package org.raphinho.cursos.testes;

import org.raphinho.cursos.modelos.Aluno;
import org.raphinho.cursos.modelos.Aula;
import org.raphinho.cursos.modelos.Curso;

import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();

        Curso java = new Curso("Curso de Java", "Raphael Righetti");
        Curso python = new Curso("Curso de Python", "Raphael Righetti");

        cursos.add(python);
        cursos.add(java);

        Aluno raphael = new Aluno("Raphael", 1234);
        Aluno raphaelTambem = new Aluno("Raphael", 1234);
        Aluno kaique = new Aluno("Kaique", 4321);
        Aluno banzoli = new Aluno("Banzoli", 5678);

        Aula aulaJava1 = new Aula("Conhecendo Java", 15);
        Aula aulaJava2 = new Aula("Mais Java", 10);
        Aula aulaJava3 = new Aula("Java pra caramba", 30);
        Aula aulaPython1 = new Aula("Tudo sobre o Python", 500);

        java.addAula(aulaJava1);
        java.addAula(aulaJava2);
        java.addAula(aulaJava3);

        java.matricula(raphael);
        java.matricula(banzoli);
        python.matricula(raphael);
        python.matricula(kaique);
        python.matricula(banzoli);

        System.out.println(raphael.hashCode());
        System.out.println(raphaelTambem.hashCode());

        System.out.println("raphael.equals(raphaelTambem) ?");
        System.out.println(raphael.equals(raphaelTambem));
        System.out.println("Está matriculado?");
        System.out.println(java.estaMatriculado(raphaelTambem));

        cursos.sort(null);

        System.out.println(cursos);
    }
}

package org.raphinho.cursos.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

    private String nome;
    private List<Aula> aulas = new ArrayList<>();
    private String professor;

    public Curso(String nome, String professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void addAula(Aula aula) {
        aulas.add(aula);
    }

    public void removeAula(Aula aula) {
        aulas.remove(aula);
    }

    public String getProfessor() {
        return professor;
    }

    public int getTempoTotal() {
        return aulas.stream().mapToInt(Aula::getDuracao).sum();
    }
}

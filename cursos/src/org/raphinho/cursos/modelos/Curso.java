package org.raphinho.cursos.modelos;

import java.util.*;

public class Curso implements Comparable<Curso> {

    private String nome;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
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

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public int getTotalAlunos() {
        return alunos.size();
    }

    public void matricula(Aluno aluno) {
        alunos.add(aluno);
        matriculaParaAluno.put(aluno.getNumMatricula(), aluno);
    }

    public Aluno buscaMatriculado(int matricula) {
        return matriculaParaAluno.get(matricula);
    }

    public void removeAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return alunos.contains(aluno);
    }

    public String getProfessor() {
        return professor;
    }

    public int getTempoTotal() {
        return aulas.stream().mapToInt(Aula::getDuracao).sum();
    }

    @Override
    public String toString() {
        return "[Curso: " + nome +
                ", Duração: " + getTempoTotal() +
                ", Alunos: " + getTotalAlunos() +
                ", Professor: " + professor +
                "]";
    }

    @Override
    public int compareTo(Curso curso) {
        return Integer.compare(curso.getTotalAlunos(), getTotalAlunos());
    }
}

package org.raphinho.cursos.modelos;

import java.util.Objects;

public class Aluno {

    private String nome;
    private int numMatricula;

    public Aluno(String nome, int numMatricula) {
        if (nome == null) throw new NullPointerException("O nome é um campo obrigatório!");
        this.nome = nome;
        this.numMatricula = numMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    @Override
    public String toString() {
        return "[Aluno: " + nome + ", Matrícula: " + numMatricula + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return numMatricula == aluno.numMatricula && nome.equals(aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numMatricula);
    }
}

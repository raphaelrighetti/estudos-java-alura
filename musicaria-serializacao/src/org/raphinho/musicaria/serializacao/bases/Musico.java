package org.raphinho.musicaria.serializacao.bases;

import org.raphinho.musicaria.serializacao.repertorios.Repertorio;

import java.io.Serializable;

public abstract class Musico implements Serializable {

    private String nome;
    private int idade;
    private final String instrumento;
    private Repertorio repertorio;
    private boolean drogado;

    public Musico(String nome, int idade, String instrumento, boolean drogado) {
        this.nome = nome;
        this.idade = idade;
        this.instrumento = instrumento;
        this.drogado = drogado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Repertorio getRepertorio() {
        return repertorio;
    }

    public void setRepertorio(Repertorio repertorio) {
        this.repertorio = repertorio;
    }

    public boolean isDrogado() {
        return drogado;
    }

    public void setDrogado(boolean drogado) {
        this.drogado = drogado;
    }
}

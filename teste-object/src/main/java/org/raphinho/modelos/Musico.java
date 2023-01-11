package org.raphinho.modelos;

public abstract class Musico {

    private String nome;
    private int idade;
    private String instrumento;
    private boolean drogado;

    public Musico(String nome, int idade, String instrumento, boolean drogado) {
        this.nome = nome;
        this.idade = idade;
        this.instrumento = instrumento;
        this.drogado = drogado;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", É drogado: " + drogado;
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

    public String getInstrumento() {
        return instrumento;
    }

    public boolean isDrogado() {
        return drogado;
    }

    public void setDrogado(boolean drogado) {
        this.drogado = drogado;
    }
}

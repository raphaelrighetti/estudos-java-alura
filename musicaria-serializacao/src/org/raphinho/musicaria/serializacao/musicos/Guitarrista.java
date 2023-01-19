package org.raphinho.musicaria.serializacao.musicos;

import org.raphinho.musicaria.serializacao.bases.Musico;

public class Guitarrista extends Musico {

    public Guitarrista(String nome, int idade, boolean drogado) {
        super(nome, idade, "Guitarra", drogado);
    }

    public String doSolo(int index) {
        return "Estou fazendo o solo da música " + this.getRepertorio().getMusica(index);
    }
}

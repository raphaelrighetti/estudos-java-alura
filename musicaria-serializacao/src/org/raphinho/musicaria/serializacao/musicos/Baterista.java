package org.raphinho.musicaria.serializacao.musicos;

import org.raphinho.musicaria.serializacao.bases.Musico;

public class Baterista extends Musico {

    public Baterista(String nome, int idade, boolean drogado) {
        super(nome, idade, "Bateria", drogado);
    }

    public String doTutsTats(int index) {
        return "Estou fazendo o tuts tats na música " + this.getRepertorio().getMusica(index);
    }
}

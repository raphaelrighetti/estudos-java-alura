package org.raphinho.musicaria.serializacao.musicos;

import org.raphinho.musicaria.serializacao.bases.Musico;

public class Baixista extends Musico {

    public Baixista(String nome, int idade, boolean drogado) {
        super(nome, idade, "Baixo", drogado);
    }

    public String doSlap(int index) {
        return "Estou fazendo slap na música " + this.getRepertorio().getMusica(index);
    }
}

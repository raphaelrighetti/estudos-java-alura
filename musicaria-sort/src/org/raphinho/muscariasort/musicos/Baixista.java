package org.raphinho.muscariasort.musicos;

import org.raphinho.muscariasort.modelos.Musico;

public class Baixista extends Musico {

    public Baixista(String nome, int idade, boolean drogado) {
        super(nome, idade, "Baixo", drogado);
    }

    @Override
    public String toString() {
        return this.getClass()+ ", " + super.toString();
    }
}

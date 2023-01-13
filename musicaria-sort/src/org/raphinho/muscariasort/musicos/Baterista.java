package org.raphinho.muscariasort.musicos;

import org.raphinho.muscariasort.modelos.Musico;

public class Baterista extends Musico {

    public Baterista(String nome, int idade, boolean drogado) {
        super(nome, idade, "Bateria", drogado);
    }

    @Override
    public String toString() {
        return this.getClass()+ ", " + super.toString();
    }
}

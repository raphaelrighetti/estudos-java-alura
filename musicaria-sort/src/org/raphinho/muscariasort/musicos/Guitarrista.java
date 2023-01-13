package org.raphinho.muscariasort.musicos;

import org.raphinho.muscariasort.modelos.Musico;

public class Guitarrista extends Musico {

    public Guitarrista(String nome, int idade, boolean drogado) {
        super(nome, idade, "Guitarra", drogado);
    }

    @Override
    public String toString() {
        return this.getClass()+ ", " + super.toString();
    }
}

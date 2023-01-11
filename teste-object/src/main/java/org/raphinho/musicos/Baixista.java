package org.raphinho.musicos;

import org.raphinho.modelos.Musico;

public class Baixista extends Musico {

    public Baixista(String nome, int idade, boolean drogado) {
        super(nome, idade, "Baixo", drogado);
    }

    @Override
    public String toString() {
        return this.getClass()+ ", " + super.toString();
    }
}

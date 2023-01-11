package org.raphinho.guardador.teste;

import org.raphinho.guardador.modelos.Guardador;

public class Teste {

    public static void main(String[] args) {
        Guardador guardador = new Guardador();

        guardador.add("arroz");
        guardador.add(1);
        guardador.add(3.27);

        System.out.println(guardador.get(2));
        System.out.println(guardador.getLength());
    }
}

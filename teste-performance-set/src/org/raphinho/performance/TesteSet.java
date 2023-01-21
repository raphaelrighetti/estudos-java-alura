package org.raphinho.performance;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();

        long tempoAntes = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        for (int numero : numeros) {
            numeros.contains(numero);
        }

        long tempoDepois = System.currentTimeMillis();

        long tempoGastoFor = tempoDepois - tempoAntes;

        System.out.println(numeros.size());

        System.out.println(tempoGastoFor);
    }
}

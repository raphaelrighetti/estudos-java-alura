package org.raphinho.performance;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

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

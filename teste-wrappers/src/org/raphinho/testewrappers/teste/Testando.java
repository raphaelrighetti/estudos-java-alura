package org.raphinho.testewrappers.teste;

import org.raphinho.testewrappers.modelos.Soma;

public class Testando {

    public static void main(String[] args) {
        Number result = Soma.exec("2.223432", 2);

        System.out.println(result);
    }
}

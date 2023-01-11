package org.raphinho.testearray;

public class Teste {

    public static void main(String[] args) {

        Pessoa lua = new Pessoa("Lua");
        Pessoa rapha = new Pessoa("Raphael");

        Pessoa[] pessoas = new Pessoa[2];

        pessoas[0] = rapha;
        pessoas[1] = lua;

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

//        int[] inteiros = new int[5];
//
//        for (int i = 0; i < inteiros.length; i++) {
//            inteiros[i] = i + 1;
//        }
//
//        for (int inteiro : inteiros) {
//            System.out.println(inteiro);
//        }
    }
}

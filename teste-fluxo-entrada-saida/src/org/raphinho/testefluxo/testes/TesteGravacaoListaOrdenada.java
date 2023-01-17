package org.raphinho.testefluxo.testes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TesteGravacaoListaOrdenada {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Raphael");
        nomes.add("Lua");
        nomes.add("Kaique");
        nomes.add("Guilherme");
        nomes.add("Appolari");
        nomes.add("Patrick");

        nomes.sort(null);

        try (PrintWriter pw = new PrintWriter("teste2.txt")) {
            nomes.forEach((String nome) -> pw.println(nome));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

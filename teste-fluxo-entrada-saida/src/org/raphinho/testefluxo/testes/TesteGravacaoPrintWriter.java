package org.raphinho.testefluxo.testes;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteGravacaoPrintWriter {

    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("teste2.txt")) {
            pw.println("estou testando escrever em um arquivo usando o PrintWriter :)");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

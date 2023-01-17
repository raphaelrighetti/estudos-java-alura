package org.raphinho.testefluxo.testes;

import java.io.IOException;
import java.io.PrintStream;


public class TesteGravacaoPrintStream {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("teste2.txt")) {
            ps.println("estou testando escrever em um arquivo usando o PrintStream :)");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

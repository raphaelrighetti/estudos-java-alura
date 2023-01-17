package org.raphinho.testefluxo.testes;

import java.io.FileWriter;
import java.io.IOException;

public class TesteGravacaoFileWriter {

    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("teste2.txt")) {
            fw.write("esse aqui não tem println :(");
            fw.write(System.lineSeparator());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

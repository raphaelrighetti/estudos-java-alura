package org.raphinho.testefluxo.testes;

import java.io.*;

public class TesteGravacao {

    public static void main(String[] args) throws IOException {
        OutputStream fos = new FileOutputStream("teste2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("testando gravacao em arquivo");
        bw.newLine();
        bw.write(Integer.toString(123));

        bw.close();
    }
}

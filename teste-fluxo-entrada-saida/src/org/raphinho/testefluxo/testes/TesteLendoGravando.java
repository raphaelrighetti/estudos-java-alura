package org.raphinho.testefluxo.testes;

import java.io.*;

public class TesteLendoGravando {

    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("lorem-ipsum.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = new FileOutputStream("lorem-ipsum2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while (linha != null) {
            bw.write(linha);
            bw.newLine();
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();
        bw.close();
    }
}

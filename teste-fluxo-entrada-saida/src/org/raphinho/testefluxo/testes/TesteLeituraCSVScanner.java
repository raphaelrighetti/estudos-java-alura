package org.raphinho.testefluxo.testes;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraCSVScanner {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(new File("pessoas.csv"))) {
            while (s.hasNextLine()) {
                Scanner linhaScanner = new Scanner(s.next());

                linhaScanner.useDelimiter(",");
                linhaScanner.useLocale(Locale.US);

                List<String> pessoaInformation = new ArrayList<>();

                while (linhaScanner.hasNext()) {
                    pessoaInformation.add(linhaScanner.next());
                }

                System.out.println(pessoaInformation);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

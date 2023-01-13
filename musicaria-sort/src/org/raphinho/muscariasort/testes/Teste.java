package org.raphinho.muscariasort.testes;

import org.raphinho.muscariasort.comparators.MusicoComparator;
import org.raphinho.muscariasort.modelos.Musico;
import org.raphinho.muscariasort.musicos.Baixista;
import org.raphinho.muscariasort.musicos.Baterista;
import org.raphinho.muscariasort.musicos.Guitarrista;

import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        List<Musico> musicos = new ArrayList<>();

        Baixista raphael = new Baixista("Raphael", 20, false);
        Baterista patrick = new Baterista("Patrick", 22, true);
        Guitarrista kaique = new Guitarrista("Kaique", 21, false);

        musicos.add(raphael);
        musicos.add(patrick);
        musicos.add(kaique);

        for (Musico musico : musicos) {
            System.out.println(musico);
        }

        System.out.println("------------");

        // musicos.sort(null);
        musicos.sort(new MusicoComparator());

        for (Musico musico : musicos) {
            System.out.println(musico);
        }
    }
}

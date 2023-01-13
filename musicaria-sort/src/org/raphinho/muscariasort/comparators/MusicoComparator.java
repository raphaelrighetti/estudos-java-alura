package org.raphinho.muscariasort.comparators;

import org.raphinho.muscariasort.modelos.Musico;

import java.util.Comparator;

public class MusicoComparator implements Comparator<Musico> {


    @Override
    public int compare(Musico m1, Musico m2) {
        return Integer.compare(m1.getIdade(), m2.getIdade());
    }
}

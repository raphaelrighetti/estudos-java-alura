package org.raphinho.guardador.modelos;

public class Guardador {

    private Object[] referencias = new Object[10];
    private int posicaoLivre;

    public Object get(int posicao) {
        return referencias[posicao].toString();
    }

    public void add(Object ref) {
        referencias[posicaoLivre] = ref;
        posicaoLivre++;
    }

    public int getLength() {
        return posicaoLivre;
    }
}

package org.raphinho.testewrappers.modelos;

public class Soma {

    public static Double exec(Object n1, Object n2) {
        Double d1 = Double.parseDouble(n1.toString());
        Double d2 = Double.parseDouble(n2.toString());

        return d1 + d2;
    }
}

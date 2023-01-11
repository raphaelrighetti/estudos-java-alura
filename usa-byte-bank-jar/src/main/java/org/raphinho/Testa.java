package org.raphinho;

import org.raphinho.bytebank.models.Cliente;
import org.raphinho.bytebank.models.ContaCorrente;
import org.raphinho.bytebank.models.exceptions.SacaException;

public class Testa {

    public static void main(String[] args) {
        Cliente raphael = new Cliente("123.456.789-01", "Raphael Righetti");

        ContaCorrente cc = new ContaCorrente(123, 321, raphael);

        cc.deposita(200.0);

        System.out.println(cc.getSaldo());

        try {
            cc.saca(100.0);
        } catch (SacaException ex) {
            ex.printStackTrace();
        }

        System.out.println(cc.getSaldo());
    }
}

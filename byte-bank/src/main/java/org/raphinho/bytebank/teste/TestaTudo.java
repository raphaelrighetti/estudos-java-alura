package org.raphinho.bytebank.teste;

import org.raphinho.bytebank.models.Cliente;
import org.raphinho.bytebank.models.ContaCorrente;
import org.raphinho.bytebank.models.ContaPoupanca;
import org.raphinho.bytebank.models.exceptions.SacaException;

public class TestaTudo {

    public static void main(String[] args) {
        Cliente raphael = new Cliente("123.456.789-01", "Raphael Righetti");

        ContaCorrente contaDoRaphael = new ContaCorrente(123, 321, raphael);
        ContaPoupanca contaPoupancaDoRaphael = new ContaPoupanca(321, 123, raphael);

        contaDoRaphael.deposita(500.0);

        try {
            contaDoRaphael.saca(200.0);
            System.out.println("Passou da instrução 1");
            contaDoRaphael.transfere(400.0, contaPoupancaDoRaphael);
        } catch (SacaException ex) {
            ex.printStackTrace();
        }

        System.out.println(contaDoRaphael.getSaldo());

        contaPoupancaDoRaphael.deposita(500.0);
        try {
            contaPoupancaDoRaphael.saca(200.0);
        } catch (SacaException ex) {
            ex.printStackTrace();
        }


        System.out.println(contaPoupancaDoRaphael.getSaldo());
    }
}

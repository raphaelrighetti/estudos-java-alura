package org.raphinho.bytebank.models;

import org.raphinho.bytebank.models.abstracts.Conta;
import org.raphinho.bytebank.models.exceptions.SacaException;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numConta, Cliente titular) {
        super(agencia, numConta, titular);
    }

    @Override
    public void saca(double valor) throws SacaException {
        super.saca(valor + 0.2);
    }
}

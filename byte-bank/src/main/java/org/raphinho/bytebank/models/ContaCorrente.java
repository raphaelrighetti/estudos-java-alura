package org.raphinho.bytebank.models;

import org.raphinho.bytebank.models.abstracts.Conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numConta, Cliente titular) {
        super(agencia, numConta, titular);
    }
}

package org.raphinho.bytebank.models.abstracts;

import org.jetbrains.annotations.NotNull;
import org.raphinho.bytebank.models.Cliente;
import org.raphinho.bytebank.models.exceptions.SacaException;

public abstract class Conta {

    private int agencia;

    private int numConta;

    private Cliente titular;
    private double saldo = 0.0;

    public Conta(int agencia, int numConta, Cliente titular) {
        this.agencia = agencia;
        this.numConta = numConta;
        this.titular = titular;
    }

    public void saca(double valor) throws SacaException {
        if (saldo < valor) {
            throw new SacaException("Valor maior que o saldo.");
        }

        saldo -= valor;
    }

    public void deposita(double valor) {
        saldo += valor;
    }

    public void transfere(double valor, @NotNull Conta outraConta) throws SacaException {
        saca(valor);
        outraConta.deposita(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTitularNome() {
        return titular.getNome();
    }

    public double getSaldo() {
        return saldo;
    }
}

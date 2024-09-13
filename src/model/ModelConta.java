package model;

import Conta.Conta;

public interface ModelConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDeposito);
    String saldo();
    String extrato();
}

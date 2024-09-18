package Conta;

import Model.Conta;

public class ContaCorrente extends Conta{

    public ContaCorrente(String titular, int agencia, int conta) {
        super(titular, agencia, conta);
    }

    @Override
    public void depositar(double valor) {
        // TODO Auto-generated method stub
        super.depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        // TODO Auto-generated method stub
        super.sacar(valor);
    }
    

    @Override
    public void transferir(double valor, Conta contaDestino) {
        // TODO Auto-generated method stub
        super.transferir(valor, contaDestino);
    }
    
    @Override
    public String saldo() {
        // TODO Auto-generated method stub
        return super.saldo();
    }
    
    @Override
    public String extrato() {
        // TODO Auto-generated method stub
        return super.extrato();
    }
}

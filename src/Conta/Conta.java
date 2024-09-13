package Conta;

import model.ModelConta;

public abstract class Conta implements ModelConta {
    protected String titular;
    protected int agencia;
    protected int conta;
    protected double saldo;
    
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getConta() {
        return conta;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Conta(String titular,int agencia, int conta) {
        this.titular = titular;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = 0;
    }

    public void sacar(double valor){
        this.saldo -= valor;
        System.out.println("Saque realizado, R$ " + valor);
    }
    
    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Deposito realizado, R$ " + valor);
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    public String saldo() {
        return "\n=== Saldo: === " + conta + "\nR$ " + saldo;
    }
    
    public String extrato() {
        return "\n=== Extrato: === "
                        + "\n--- Titular = " + titular
                        + "\n--- agencia = " + agencia
                        + " ---\n--- conta = " + conta
                        + " ---\n---  saldo = R$ " + saldo + " ---";
    }
    
}

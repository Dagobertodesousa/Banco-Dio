package Instituicao;

import model.ModelInstituto;
import Cliente.Cliente;
import Conta.Conta;
import LinhaCredito.Cartao;

public abstract class Instituicao implements ModelInstituto{
    private Conta conta;
    private Cliente cliente;
    private Cartao cartao;
    
    public Instituicao(Conta conta, Cliente cliente, Cartao cartao) {
        this.setConta(conta);
        this.setCliente(cliente);
        this.setCartao(cartao);
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    @Override
    public void contaCriada() {
        // TODO Auto-generated method stub
        System.out.println("Aberta conta no banco " + this.getClass().getSimpleName());
    }

    @Override
    public void fixarMultas() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void fixarTaxas() {
        // TODO Auto-generated method stub
        
    }

}

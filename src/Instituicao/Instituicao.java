package Instituicao;

import model.ModelInstituto;
import Cartao.Cartao;
import Cliente.Cliente;
import Conta.Conta;

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

    @Override
    public String toString() {
        return "Instituição: " + getClass().getSimpleName()
                + "\nConta: " + getConta().getConta()
                + "\nAgência: " + getConta().getAgencia()
                + "\nTitular da conta: " + getConta().getTitular()
                + "\nSaldo em conta: " + getConta().getSaldo()
                + "\n -------------------------------------"
                + "\nCliente Titular: " + getCliente().getTitular()
                + "\nIdade do Titular: " + getCliente().getIdade()
                + "\nEndereço do Titular: " + getCliente().getEndereço()
                + "\n -------------------------------------"
                + "\nnúmero do cartão: " + getCartao().getNumeroCartao()
                + "\nDisponível para bédito: " + getCartao().getDisponivelCartao()
                + "\nLimite de crédito: " + getCartao().getLimiteCartao();
    }

}

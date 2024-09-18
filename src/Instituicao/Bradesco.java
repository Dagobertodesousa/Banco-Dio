package Instituicao;

import Model.*;

public class Bradesco extends Instituicao{
    public Bradesco(Cliente cliente, Cartao cartao, Conta conta){
        super(cliente, cartao, conta);
        contaCriada();
    }

    @Override
    public void contaCriada() {
        // TODO Auto-generated method stub
        super.contaCriada();
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

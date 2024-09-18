package Instituicao;

import Model.*;

public class CaixaEconomicaFederal extends Instituicao{
    public CaixaEconomicaFederal(Cliente cliente, Cartao cartao, Conta conta){
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

package Instituicao;

import Cartao.Cartao;
import Cliente.*;
import Conta.*;

public class BdoN extends Instituicao{
    public BdoN(Conta conta, Cliente cliente, Cartao cartao){
        super(conta, cliente, cartao);
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

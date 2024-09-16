package Instituicao;

import LinhaCredito.Cartao;
import Cliente.*;
import Conta.*;

public class Bradesco extends Instituicao{
    public Bradesco(Conta conta, Cliente cliente, Cartao cartao){
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

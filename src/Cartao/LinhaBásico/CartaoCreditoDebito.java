package Cartao.LinhaBásico;

import Model.Cartao;

public class CartaoCreditoDebito extends Cartao{
    public CartaoCreditoDebito(double limiteCartao, double disponivelCartao, final int codigoCartao){
        super(codigoCartao);
        this.setLimiteCartao(limiteCartao);
        this.setDisponivelCartao(disponivelCartao);
    }
    
}

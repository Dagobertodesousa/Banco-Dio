package Cartao.LinhaCorporativa;

import Model.Cartao;

public class CartaoBlack extends Cartao{
    public CartaoBlack(double limiteCartao, double disponivelCartao, final int codigoCartao){
        super(codigoCartao);
        this.setLimiteCartao(limiteCartao);
        this.setDisponivelCartao(disponivelCartao);
    }
    
}

package Cartao.LinhaCorporativa;

import Model.Cartao;

public class CartaoPlus extends Cartao{
    protected double taxa;
    public CartaoPlus(double limiteCartao, double disponivelCartao, final int codigoCartao){
        super(codigoCartao);
        this.setLimiteCartao(limiteCartao);
        this.setDisponivelCartao(disponivelCartao);
        this.taxa = .0998;
    }

    public double getTaxa(){
        return taxa;
    }
}

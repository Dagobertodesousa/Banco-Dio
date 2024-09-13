package LinhaCredito;

import java.util.List;
import java.util.ArrayList;

import model.ModelCartao;

public class Cartao implements ModelCartao{
    protected List<Integer> numeroCartao;
    protected boolean ativoCartao;
    protected double limiteCartao;
    protected double disponivelCartao;
    protected int codigoCartao;

    public Cartao(int codigoCartao) {
        this.numeroCartao = new ArrayList<Integer>(4);
        this.ativoCartao = false;
        this.limiteCartao = 0.0;
        this.disponivelCartao = 0.0;
        this.codigoCartao = codigoCartao;
    }

    public List<Integer> getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int n1, int n2, int n3, int n4) {
        this.numeroCartao.add(n1);
        this.numeroCartao.add(n2);
        this.numeroCartao.add(n3);
        this.numeroCartao.add(n4);
    }

    public boolean isAtivoCartao() {
        return ativoCartao;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public void setLimiteCartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    public double getDisponivelCartao() {
        return disponivelCartao;
    }

    public void setDisponivelCartao(double disponivelCartao) {
        this.disponivelCartao = disponivelCartao;
    }

    public int getCodigoCartao() {
        return codigoCartao;
    }

    public void setCodigoCartao(int codigoCartao) {
        this.codigoCartao = codigoCartao;
    }

    @Override
    public void aumentarLimite(double valorAumentoLimite) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void bloquearCartao() {
        // TODO Auto-generated method stub
        this.ativoCartao = false;
    }

    @Override
    public void contratarEmprestimo(double valorEmprestimo) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void contratarInvestimento(double valorInvestimento) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void desbloquearCartao() {
        // TODO Auto-generated method stub
        this.ativoCartao = true;
        
    }

    @Override
    public void pagarFatura(double valorFatura) {
        // TODO Auto-generated method stub
        if (this.disponivelCartao >= valorFatura){
            this.disponivelCartao -= valorFatura;
            System.out.println("Fatura no valor de R$ " + valorFatura);
        } else {
            System.out.println("Valor da Fatura é superior\nao valor disponível em conta");
        }
        
    }

    @Override
    public void recarregarCelular(double valorRecarga, int numeroTelefone) {
        // TODO Auto-generated method stub
        
    }
    
}

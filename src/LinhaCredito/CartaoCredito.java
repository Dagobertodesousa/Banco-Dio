package LinhaCredito;

public class CartaoCredito extends Cartao{
    public CartaoCredito(double limiteCartao, int codigoCartao){
        super(codigoCartao);
        this.limiteCartao = limiteCartao;
    }

    @Override
    public void aumentarLimite(double valorAumentoLimite) {
        // TODO Auto-generated method stub
        super.aumentarLimite(valorAumentoLimite);
    }

    @Override
    public void bloquearCartao() {
        // TODO Auto-generated method stub
        super.bloquearCartao();
    }

    @Override
    public void contratarEmprestimo(double valorEmprestimo) {
        // TODO Auto-generated method stub
        super.contratarEmprestimo(valorEmprestimo);
    }

    @Override
    public void contratarInvestimento(double valorInvestimento) {
        // TODO Auto-generated method stub
        super.contratarInvestimento(valorInvestimento);
    }

    @Override
    public void desbloquearCartao() {
        // TODO Auto-generated method stub
        super.desbloquearCartao();
    }

    @Override
    public void pagarFatura(double valorFatura) {
        // TODO Auto-generated method stub
        super.pagarFatura(valorFatura);
    }

    @Override
    public void recarregarCelular(double valorRecarga, int numeroTelefone) {
        // TODO Auto-generated method stub
        super.recarregarCelular(valorRecarga, numeroTelefone);
    }

    @Override
    public String toString() {
        return "Cartao de Credito []";
    }
        
}

package model;

public interface ModelCartao {
    void contratarInvestimento(double valorInvestimento);
    void contratarEmprestimo(double valorEmprestimo);
    void aumentarLimite(double valorAumentoLimite);
    void bloquearCartao();
    void desbloquearCartao();
    void recarregarCelular(double valorRecarga);
    void pagarFatura(double valorFatura);

}

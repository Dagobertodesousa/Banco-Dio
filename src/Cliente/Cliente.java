package Cliente;

public abstract class Cliente {
    private String titular;
    private String cpf;
    private String cnpf;
    private int idade;
    private String endereço;

    public Cliente(String titular, int idade, String endereço) {
        this.titular = titular;
        this.cpf = "";
        this.cnpf = "";
        this.idade = idade;
        this.endereço = endereço;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCnpf() {
        return cnpf;
    }
    public void setCnpf(String cnpf) {
        this.cnpf = cnpf;
    }
    @Override
    public String toString() {
        return "Cliente [titular=" + titular + ", idade=" + idade + ", endereço=" + endereço + "]";
    }
}

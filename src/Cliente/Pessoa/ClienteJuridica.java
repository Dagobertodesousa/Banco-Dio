package Cliente.Pessoa;

import Model.Cliente;

public class ClienteJuridica extends Cliente{
    public ClienteJuridica(String titular, String cpf, int idade, String endereço) {
        super(titular, idade, endereço);
        this.setCpf(cpf);
    }
}

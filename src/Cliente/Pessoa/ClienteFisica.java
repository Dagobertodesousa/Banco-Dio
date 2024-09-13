package Cliente.Pessoa;

import Cliente.Cliente;

public class ClienteFisica extends Cliente{
    public ClienteFisica(String titular, String cpf, int idade, String endereço) {
        super(titular, idade, endereço);
        this.setCpf(cpf);
    }
}

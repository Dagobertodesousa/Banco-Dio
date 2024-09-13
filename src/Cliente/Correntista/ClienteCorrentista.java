package Cliente.Correntista;

import Cliente.Cliente;

public class ClienteCorrentista extends Cliente{
    public ClienteCorrentista(String titular, int idade, String endereco){
        super(titular, idade, endereco);
    }

    @Override
    public String toString() {
        return "Cliente Correntista []";
    }
}

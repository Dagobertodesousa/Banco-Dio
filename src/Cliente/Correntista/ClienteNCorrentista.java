package Cliente.Correntista;

import Model.Cliente;

public class ClienteNCorrentista extends Cliente{
    public ClienteNCorrentista(String titular, int idade, String endereco){
        super(titular, idade, endereco);
    }

    @Override
    public String toString() {
        return "Cliente-não-Correntista []";
    }

    
}

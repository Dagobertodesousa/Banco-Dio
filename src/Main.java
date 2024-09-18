import Cartao.LinhaBásico.*;
import Cliente.Correntista.*;
import Cliente.Pessoa.*;
import Instituicao.*;
import Conta.*;
import Model.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Instituicao santander = new Santander(
            (new ClienteFisica("Tao Paepae", 63,"rua da centelha")),
            (new CartaoCreditoDebito(5915.33,4010.20,778)),
            (new ContaCorrente("titular", 203, 1096))
        );

    }
}
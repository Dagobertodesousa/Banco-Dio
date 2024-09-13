import java.util.ArrayList;
import java.util.List;

import Cliente.*;
import Instituicao.*;
import Conta.*;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Conta> poupancas = new ArrayList<>();
        Conta contaCorrente = new ContaCorrente("Conta Corrente", 18, 200);
        Conta contaPoupanca = new ContaPoupanca("Conta Poupança", 118, 20900);
        Conta contaSalario = new ContaPoupanca("Conta Poupança", 118, 20900);

        contaCorrente.depositar(300);
        System.out.println(contaCorrente.extrato());

        contaPoupanca.depositar(420);
        System.out.println(contaPoupanca.extrato());

        contaSalario.depositar(120);
        System.out.println(contaSalario.extrato());

        Cliente cli = new ClienteCorrentista("florinda", 32, "rua orquideas");
        System.out.println(cli.toString());

        poupancas.add(contaPoupanca);
        poupancas.add(contaCorrente);
        poupancas.add(contaSalario);
    }
}
import java.util.ArrayList;
import java.util.List;

import Cliente.Cliente;
import Cliente.Correntista.*;
import Cliente.Pessoa.*;
import Instituicao.*;
import LinhaCredito.*;
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
        
        Cartao cardC = new CartaoCredito(20000, 007);
        cardC.setNumeroCartao(9876, 5432, 1098, 1563);
        System.out.println("Disponível: R$" + cardC.getDisponivelCartao());
        System.out.println("Limite: R$" + cardC.getLimiteCartao());
        System.out.print("Número do Cartão:");
        cardC.getNumeroCartao().forEach(n -> System.out.print(" " + n));
        System.out.println();

        Cliente cli = new ClienteCorrentista("florinda", 32, "rua orquideas");

        Instituicao bradesco = new Bradesco(contaCorrente, cli, cardC);
        Instituicao Itau = new Itau(contaPoupanca, cli, cardC);

        Cartao cardD = new CartaoDebito(1800.0, 073);
        cardD.setNumeroCartao(1234, 5678, 9012, 7536);
        System.out.println("Disponível: R$" + cardD.getDisponivelCartao());
        System.out.println("Limite: R$" + cardD.getLimiteCartao());
        System.out.print("Número do Cartão:");
        cardD.getNumeroCartao().forEach(n -> System.out.print(" "+ n));
        System.out.println();

        Cartao trashCard = new CartaoCreditoDebito(4000.0, 1200.0, 007);
        trashCard.setNumeroCartao(9876, 5432, 1098, 1563);
        System.out.println("Disponível: R$" + trashCard.getDisponivelCartao());
        System.out.println("Limite: R$" + trashCard.getLimiteCartao());
        System.out.print("Número do Cartão:");
        trashCard.getNumeroCartao().forEach(n -> System.out.print(" " + n));
        System.out.println();


        poupancas.add(contaPoupanca);
        poupancas.add(contaCorrente);
        poupancas.add(contaSalario);

        Instituicao Santander = new Santander(contaCorrente, cli, cardD);
        Instituicao bancoBrasil = new BB(contaSalario, cli, cardC);
        Instituicao caixaEconomicaFederal = new CEF(contaCorrente, cli, cardD);

        System.out.println(bradesco.getConta().extrato());
        Itau.getConta().transferir(81.56, Santander.getConta());
        System.out.println(Santander.getConta().extrato());
        System.out.println(bancoBrasil.getConta().extrato());
        System.out.println(caixaEconomicaFederal.getConta().extrato());

        System.out.println(Itau.getConta().getSaldo());
        System.out.println(Santander.getConta().getSaldo());


    }
}
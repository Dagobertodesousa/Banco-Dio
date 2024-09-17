import java.util.ArrayList;
import java.util.List;

import Cartao.*;
import Cartao.LinhaBásico.*;
import Cliente.Cliente;
import Cliente.Correntista.*;
import Cliente.Pessoa.*;
import Instituicao.*;
import Conta.*;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Conta> poupancas = new ArrayList<>();
        Conta contaCorrente = new ContaCorrente("Conta Corrente", 18, 200);
        Conta contaPoupanca = new ContaPoupanca("Conta Poupança", 118, 20900);
        Conta contaSalario = new ContaPoupanca("Conta Poupança", 118, 20900);

        contaCorrente.depositar(300);

        contaPoupanca.depositar(420);

        contaSalario.depositar(120);
        
        Cartao cardC = new CartaoCredito(20000, 007);
        cardC.setNumeroCartao();
        cardC.getNumeroCartao().forEach(n -> System.out.print(" " + n));
        
        Cliente cli = new ClienteCorrentista("florinda", 32, "rua orquideas");
        
        Instituicao bradesco = new Bradesco(contaCorrente, cli, cardC);
        Instituicao Itau = new Itau(contaPoupanca, cli, cardC);
        
        Cartao cardD = new CartaoDebito(1800.0, 073);
        cardD.setNumeroCartao();
        cardD.getNumeroCartao().forEach(n -> System.out.print(" "+ n));
        
        Cartao trashCard = new CartaoCreditoDebito(4000.0, 1200.0, 007);
        trashCard.setNumeroCartao();
        trashCard.getNumeroCartao().forEach(n -> System.out.print(" " + n));
        
        Conta contaDeInvestimento = new ContaInvestimento("Plinio oliveira", 14203, 88965);
        Cliente pessoaQualquer = new ClienteFisica("Jovaldson Antonines", "845.453.022-13", 29, "Rua ciqueira cercada");
        Cartao paraTodos = new CartaoDebito(3581.61, 99);
        
        poupancas.add(contaPoupanca);
        poupancas.add(contaCorrente);
        poupancas.add(contaSalario);
        
        Instituicao Santander = new Santander(contaCorrente, cli, trashCard);
        Instituicao bancoBrasil = new BB(contaSalario, cli, cardC);
        Instituicao caixaEconomicaFederal = new CEF(contaCorrente, cli, trashCard);
        Itau.getConta().transferir(81.56, Santander.getConta());
        Instituicao bancoDoNordeste = new BdoN(contaDeInvestimento, pessoaQualquer, paraTodos);

        System.out.println("Disponível: R$" + cardC.getNumeroCartao());
        System.out.println("Disponível: R$" + cardC.getDisponivelCartao());
        System.out.println("Limite: R$" + cardC.getLimiteCartao());
        System.out.println("Disponível: R$" + cardD.getDisponivelCartao());
        System.out.println("Limite: R$" + cardD.getLimiteCartao());
        System.out.println("Disponível: R$" + trashCard.getDisponivelCartao());
        System.out.println("Limite: R$" + trashCard.getLimiteCartao());
        System.out.println(bradesco.getConta().extrato());
        System.out.println(Santander.getConta().extrato());
        System.out.println(bancoBrasil.getConta().extrato());
        System.out.println(caixaEconomicaFederal.getConta().extrato());
        System.out.println(Itau.getConta().getSaldo());
        System.out.println(Santander.getConta().getSaldo());
        System.out.println(bancoDoNordeste.getConta().extrato());
        System.out.println(caixaEconomicaFederal.toString());

        Itau.getCartao().contratarEmprestimo(10000, 36);
        Itau.getCartao().contratarEmprestimo(10000, 12);
        System.out.println(Itau.getCartao().getDisponivelCartao());

        Santander.getCartao().contratarEmprestimo(4000, 12);
        System.out.println(Santander.getCartao().getDisponivelCartao());
    }
}
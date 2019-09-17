package test.java;

import main.java.ContaCorrente;
import main.java.ContaPoupanca;
import main.java.PF;

public class Teste{
    public static void main(String[] args) {
        PF pf1 = new PF("Fernanda", "123456789", "45956862858", "fernada@fernanda","912345678", "Alameda Rio Negro",500,"Alphaville","Barueri","SP");
        ContaCorrente cc1 = new ContaCorrente();
        ContaPoupanca cp1 = new ContaPoupanca();

        cp1.criarConta(pf1);
        cc1.criarConta(pf1);

        cc1.sacarPF(pf1.getCpf(), 200, cp1);
        System.out.println(cc1.consultarSaldoContaPF(pf1.getCpf()) + cp1.consultarSaldoContaPF(pf1.getCpf()));

        cp1.depositar(1000.00, 30);
        System.out.println(cc1.consultarSaldoContaPF(pf1.getCpf()) + cp1.consultarSaldoContaPF(pf1.getCpf()));
    }
}
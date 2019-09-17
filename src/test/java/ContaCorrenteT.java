package test.java;

import main.java.Conta;
import main.java.ContaCorrente;
import main.java.PF;
import main.java.PJ;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ContaCorrenteT {
    @Test
    public void testCcPf() {
        PF pessoaF = new PF("Jojo", "11222333-4",
                "39015359857", "jojo@jojo.com", "1139393939", "Rua",
                500, "Alpha", "Barueri", "SP");
        ContaCorrente ccPF = new ContaCorrente(pessoaF);
        Assert.assertEquals(true, ccPF.verificacaoConta(pessoaF)); //obtido false
    }

    @Test
    public void testCcPfMascara() {
        PF pessoaF = new PF("Jojo", "11222333-4",
                "390.153.598-57", "jojo@jojo.com", "1139393939", "Rua",
                500, "Alpha", "Barueri", "SP"); //CPF inválido
        ContaCorrente ccPF = new ContaCorrente(pessoaF);
        Assert.assertEquals(false, ccPF.verificacaoConta(pessoaF)); //obtido false
    }

    @Test
    public void testCcPfVazio() {
        PF pessoaF = new PF("Jojo", "11222333-4",
                "", "jojo@jojo.com", "1139393939", "Rua",
                500, "Alpha", "Barueri", "SP"); //CPF vazio
        ContaCorrente ccPF = new ContaCorrente(pessoaF);
        Assert.assertEquals(false, ccPF.verificacaoConta(pessoaF)); //obtido false, cpf vazio ainda cria

    }


    @Test
    public void testCcPj() {
        PJ pessoaJ = new PJ("11505396000145", "BoloTOP", "bolo@top.com",
                "1144445555", "Avenida", 501, "Cohab", "Carapicuiba", "SP");
        ContaCorrente ccPJ = new ContaCorrente(pessoaJ);
        Assert.assertEquals(true, ccPJ.verificacaoConta(pessoaJ));
    }

    @Test
    public void testCcPjMascara() {
        PJ pessoaJ = new PJ("11.505.396/0001-45", "BoloTOP", "bolo@top.com",
                "1144445555", "Avenida", 501, "Cohab", "Carapicuiba", "SP"); //cnpj c/ mascara
        ContaCorrente ccPJ = new ContaCorrente(pessoaJ);
        Assert.assertEquals(true, ccPJ.verificacaoConta(pessoaJ));
    }

    @Test
    public void testCcPjVazio() {
        PJ pessoaJ3 = new PJ("", "BoloTOP", "bolo@top.com",
                "1144445555", "Avenida", 501, "Cohab", "Carapicuiba", "SP"); //cnpj vazio

        ContaCorrente ccPJ3 = new ContaCorrente(pessoaJ3);
        Assert.assertEquals(true, ccPJ3.verificacaoConta(pessoaJ3));

    }

}

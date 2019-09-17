package test.java;

import main.java.ContaCorrente;
import main.java.PF;
import main.java.PJ;
import org.junit.Assert;
import org.junit.Test;

public class ContaCorrenteT {
    @Test
    public void testCcPf() {
        PF pessoaF = new PF("Jojo", "11222333-4",
                "39015359857", "jojo@jojo.com", "1139393939", "Rua",
                500, "Alpha", "Barueri", "SP");
        ContaCorrente ccPF = new ContaCorrente();
        ccPF.criarConta(pessoaF);
        Assert.assertEquals(true, ccPF.verificacaoContaExistente(pessoaF)); //obtido false
    }

    @Test
    public void testCcPfMascara() {
        PF pessoaF = new PF("Jojo", "11222333-4",
                "390.153.598-57", "jojo@jojo.com", "1139393939", "Rua",
                500, "Alpha", "Barueri", "SP"); //CPF inválido
        ContaCorrente ccPF = new ContaCorrente();
        ccPF.criarConta(pessoaF);
        Assert.assertEquals(true, ccPF.verificacaoContaExistente(pessoaF)); //obtido false
    }
}

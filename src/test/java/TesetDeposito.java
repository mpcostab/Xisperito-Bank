package test.java;

import main.java.*;
import org.junit.Assert;
import org.junit.

        Test;

public class TesetDeposito {
    
    public void TesteSacar(){

        PF pessoaF = new PF("Jojo", "11222333-4",
                "39015359857", "jojo@jojo.com", "1139393939", "Rua",
                500, "Alpha", "Barueri", "SP");
        ContaCorrente ccPF = new ContaCorrente();
        ccPF.criarConta(pessoaF);

        Assert.assertEquals(true,ccPF.deposita(2200,21));
    }
/*
    public void TesteCliente(){
        PF pessoaFisica = new PF("João Pedro","9876521","48049049809","calebkdsk","765",
                "Rua municipal dos abreus",876,"Jardim Luciana", "Franco da rcha","svsdf");
        // System.out.println(pessoaFisica.validarContato());
        ContaCorrente ccPF1 = new ContaCorrente();
        ccPF1.criarConta(pessoaFisica);
        Assert.assertEquals(false, ccPF1.verificacaoContaExistente(pessoaFisica)); //obtido false
    }

 */


    }


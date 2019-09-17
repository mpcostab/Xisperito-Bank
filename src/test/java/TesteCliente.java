package test.java;
import main.java.Cliente;
import main.java.ContaCorrente;
import main.java.PF;
import main.java.PJ;
import org.junit.Assert;
import org.junit.Test;

public class TesteCliente {

    @Test
    public void TesteSacar(){

        PF pessoaF = new PF("Jojo", "11222333-4",
                "39015359857", "jojo@jojo.com", "1139393939", "Rua",
                500, "Alpha", "Barueri", "SP");

        ContaCorrente ccPF = new ContaCorrente();
        ccPF.criarConta(pessoaF);

        Assert.assertEquals(false,ccPF.deposita(765,-1));
    }
    }

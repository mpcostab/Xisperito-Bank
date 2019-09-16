package test.java;

import main.java.Endereco;
import org.junit.Assert;
import org.junit.Test;

public class Teste{

    @Test
    public void teste01(){
        Endereco endereco = new Endereco("TEste",12,"TEste2","tese","ree");
        Assert.assertEquals(12,endereco.getNumero());
    }

    @Test
    public void teste02(){
        Endereco endereco = new Endereco("TEste",12,"TEste2","tese","ree");
        Assert.assertEquals("Teste",endereco.getLogradouro());
    }
}
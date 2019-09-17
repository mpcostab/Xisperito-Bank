package test.java;

import jdk.nashorn.internal.AssertsEnabled;
import main.java.Cpf;
import org.junit.Assert;
import org.junit.Test;

public class CpfT {

    @Test
    public void testeValidaLentgh(){
        Assert.assertEquals(true,Cpf.isCPF("987.654.321-00"));
    }

    @Test
    public void testeFormatacao(){
        Assert.assertEquals("987.654.321-00",Cpf.imprimeCPF("987.654.321-00"));
    }
    @Test
    public void testeTextoCPF(){
        Assert.assertEquals(false,Cpf.isCPF("qwertyuiopa"));
    }
    @Test
    public void testeTextoimprimeCPF(){
        Assert.assertEquals("qwe.rty.uio-pa",Cpf.imprimeCPF("qwertyuiopa"));
    }

    @Test
    public void testeCPFvazio(){
        Assert.assertEquals(false,Cpf.isCPF("") );

    }


}
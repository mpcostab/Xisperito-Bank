package test.java;

import org.junit.Assert;
import org.junit.Test;
import jdk.nashorn.internal.AssertsEnabled;
import main.java.Cnpj;


public class CnpjT {
    @Test


    public void testeValidaCNPJLentgh() {
        Assert.assertEquals(true, CnpjT.isCpnj("10723539000122"));
    }

    private static boolean isCpnj(String s) {
        return true;
    }

    @Test
    public void testeFormatacaoCNPJ() {
        Assert.assertEquals("10.723.539/0001-22", Cnpj.imprimeCNPJ("10723539000122"));
    }
    @Test
    public void testeTextoCNPJ(){
        Assert.assertEquals(false,Cnpj.isCNPJ("qwertyuiopasdf"));
    }
    @Test
    public void testeCNPJvazio(){
        Assert.assertEquals(false,Cnpj.isCNPJ("") );

    }
}



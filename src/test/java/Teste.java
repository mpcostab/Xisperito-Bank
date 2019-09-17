
import main.java.*;

public class Teste{
    public static void main(String[] args) {

        PF pf = new PF("324","549991835","49078724889", "98798@4324","11960889945","00",99,"3423","324","");
        ContaCorrente cc = new ContaCorrente();

        System.out.println(cc.criarConta(pf));
    }
}
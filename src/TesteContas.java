
public class TesteContas {
	public static void main(String[] args) {
		PF pf1 = new PF("Rodrigo", "123456","12345678910", "rodiro.prates", "912345678", "Almeda Rio Negro",500,"Alphavile","Barueri","SP");
		PF pf2 = new PF("Rodrigo", "123456","12345678918", "rodiro.prates", "912345678", "Almeda Rio Negro",500,"Alphavile","Barueri","SP");
		
		ContaPoupanca cp = new ContaPoupanca(pf1);
		ContaPoupanca cp2 = new ContaPoupanca(pf2);
		
	}
}

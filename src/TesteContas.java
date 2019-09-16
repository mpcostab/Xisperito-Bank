
public class TesteContas {
	public static void main(String[] args) {
		PF pf1 = new PF("Rodrigo", "123456","12345678910", "rodiro.prates", "912345678", "Almeda Rio Negro",500,"Alphavile","Barueri","SP");
		PF pf2 = new PF("Rodrigo", "123456","12345678918", "rodiro.prates", "912345678", "Almeda Rio Negro",500,"Alphavile","Barueri","SP");
		
		ContaCorrente cc = new ContaCorrente(pf1);
		cc.deposita(100.0);


		PF pf3 = new PF("Rodrigo", "123456","12345678910", "rodiro.prates", "912345678", "Almeda Rio Negro",500,"Alphavile","Barueri","SP");
		Conta contaCorrente3 = new ContaCorrente(pf3);

		System.out.println( cc.getSaldo());
		System.out.println(contaCorrente3.getSaldo());
	}
}


public class TesteContas {
	public static void main(String[] args) {
		PF pf1 = new PF("Rodrigo", "123456","12345678910", "rodiro.prates", "912345678", "Almeda Rio Negro",500,"Alphavile","Barueri","SP");
		System.out.println(pf1.toString());
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10, cp);
		
		System.out.println("CC: "+ cc.getSaldo());
		System.out.println("CP: "+ cp.getSaldo());
	}
}

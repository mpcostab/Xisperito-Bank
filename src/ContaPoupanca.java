import java.util.ArrayList;

public class ContaPoupanca extends Conta{
	private PF pf;
	private static ArrayList<String> cpfExistentes = new ArrayList<>();
	
	public ContaPoupanca(PF pfP){
		this.cpfExistentes.add(pfP.getCpf());	
	}
	
	public boolean verificacaoConta(PF pfP) { 
		for(int cont = 0; cont <cpfExistentes.size(); cont++) {
			if(pfP.getCpf() == cpfExistentes.get(cont)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void deposita(double valor) {
		super.saldo = super.saldo + valor;
		
	}

	@Override
	public boolean transfere(double valor, Conta destino) {
		return false;
	}
}

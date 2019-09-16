
public class ContaPoupanca extends Conta{
	ContaPoupanca(int agencia, int numero){
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.setSaldo(super.getSaldo() + valor);
		
	}

	@Override
	public boolean transfere(double valor, Conta destino) {
		return false;
	}
}

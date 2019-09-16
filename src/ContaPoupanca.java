
public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente){
		super(cliente);
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

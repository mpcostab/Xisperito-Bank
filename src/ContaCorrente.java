//new ContaCorrente()
public class ContaCorrente extends Conta{ //Herda os atributos e herda os m�todos, mas n�o os Construtores!!!!!
	
	public ContaCorrente(int agencia, int numero){
		super(agencia, numero); //Chama o construtor padr�o da classe m�e que � sem os parametros, ou o espec�fico que � com os parametros
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
		}

	@Override
	public void deposita(double valor) {
		super.setSaldo(super.getSaldo() + valor);
		
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
	} else {
		return false;
	  }
	}
}

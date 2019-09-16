import java.util.Random;

public abstract class Conta{ //N�o posso instanciar objetos de classes abstradas
	protected double saldo; //COM PRIVATE O ATRIBUTO N�O PODE SER LIDO NEM MODIFICADO POR NINGU�M A N�O SER PELA PR�PRIA CLASSE.
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; //STATIC DEFINE QUE O ATRIBUTO TOTAL � DA CLASSE E N�O DE CADA OBJETO!
	
	//public Conta() { //Construtor padr�o que as filhas v�o herdar atrav�s do super()
		
	//}
	 //Construtores n�o se herdam mas a filha pode chamar pelo super
	public Conta(Cliente cliente) { //Esse � o construtor espec�fico

		Conta.total++; //pode escrever s� total, mas escrevemos com Conta pra enfatizar que � algo da classe e n�o do objeto.
		System.out.println("O total de contas j� abertas � "+ total);
		Random rand = new Random();
		this.agencia = rand.nextInt(5)+1;
		this.numero = rand.nextInt(999999);
		this.titular = cliente;
		this.saldo = 0;
		System.out.println("Estou criando uma conta "+ this.agencia);
	}

	public abstract void deposita(double valor);
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	public abstract boolean transfere(double valor, Conta destino);
	
	public String getSaldo() {
		return "R$ "+String.format("%.2f", saldo)+ " " + getTitular().toString();
	}
	public int getNumero() {
		return this.numero;
	}
	public int getAgencia() {
		return this.agencia;
	}

	public Cliente getTitular() {
		return this.titular;
	}
	public static int getTotal() {
		//Dentro do contexto est�tico n�o existe this: System.out.println(this.saldo)
		return Conta.total;
	}
}
	
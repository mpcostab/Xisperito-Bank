import java.util.Scanner;

public abstract class Conta{ //N�o posso instanciar objetos de classes abstradas
	
	Scanner leia = new Scanner(System.in);
	
	protected double saldo; //COM PRIVATE O ATRIBUTO N�O PODE SER LIDO NEM MODIFICADO POR NINGU�M A N�O SER PELA PR�PRIA CLASSE.
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; //STATIC DEFINE QUE O ATRIBUTO TOTAL � DA CLASSE E N�O DE CADA OBJETO!
	
	//public Conta() { //Construtor padr�o que as filhas v�o herdar atrav�s do super()
		
	//}
	 //Construtores n�o se herdam mas a filha pode chamar pelo super
	public Conta(int agencia, int numero) { //Esse � o construtor espec�fico
		Conta.total++; //pode escrever s� total, mas escrevemos com Conta pra enfatizar que � algo da classe e n�o do objeto.
		System.out.println("O total de contas j� abertas � "+ total);
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		System.out.println("Estou criando uma conta "+ this.agencia);
	}
	
	public abstract void deposita(double valor);
	
	public boolean saca(Cliente c1, double valor) {
		System.out.print("Pessoa fisica ou Pessoa juridica (pf/pj): ");
		String conta = leia.nextLine();
		switch (conta) {
		case "pf":
			System.out.print("Digite seu cpf: ");
			String novocpf = leia.nextLine();
			if (novocpf == ((PF) c1).getCpf()) {
				if (this.saldo >= valor) {
					this.saldo -= valor;
					return true;
				}
				else {
					System.out.println("Saldo Insuficiente");
					return false;
				}
			}
			else {
				System.out.println("CPF invalido!");
				return false;
			}
		case "pj":
			System.out.print("Digite seu cnpj: ");
			String novocnpj = leia.nextLine();
			if (novocnpj == ((PJ) c1).getCnpj()) {
				if (this.saldo >= valor) {
					this.saldo -= valor;
					return true;
				}
				else {
					return false;
				}
			}
			else {
				System.out.println("CNPJ invalido!");
				return false;
			}
		}
		
		
		
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	public abstract boolean transfere(double valor, Conta destino);
	
	public double getSaldo() {
		return this.saldo;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) { //Quando voc� encapsula, voc� pode fazer valida��es dentro. E quando as pessoas forem usar, elas alteram s� em um lugar: na classe.
		if (numero <= 0) {
			System.out.println("N�mero de conta inv�lido.");
			return;
		}
		this.numero = numero;
	}
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("N�mero de ag�ncia inv�lido");
			return;
		}
		this.agencia = agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return this.titular;
	}
	public static int getTotal() {
		//Dentro do contexto est�tico n�o existe this: System.out.println(this.saldo)
		return Conta.total;
	}
}
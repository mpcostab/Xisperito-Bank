public abstract class Conta{ //N�o posso instanciar objetos de classes abstradas
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; //STATIC DEFINE QUE O ATRIBUTO TOTAL É DA CLASSE E NÃO DE CADA OBJETO!
	
	//public Conta() { //Construtor padrão que as filhas vão herdar através do super()
		
	//}
	 //Construtores não se herdam mas a filha pode chamar pelo super
	public Conta(Cliente cliente) { //Esse é o construtor específico

		Conta.total++; //pode escrever só total, mas escrevemos com Conta pra enfatizar que é algo da classe e não do objeto.
		System.out.println("O total de contas já abertas é "+ total);
		Random rand = new Random();
		this.agencia = rand.nextInt(5)+1;
		this.numero = rand.nextInt(999999);
		this.titular = cliente;
		this.saldo = 0;
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
	
	public String getSaldo() {
		return "R$ "+String.format("%.2f", saldo)+ " " + getTitular().toString();
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
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
		//Dentro do contexto estático não existe this: System.out.println(this.saldo)
		return Conta.total;
	}
}
package main.java;

import main.java.Cliente;
import main.java.Conta;

import java.util.ArrayList;
import java.util.Random;

//new ContaCorrente()
public class ContaCorrente extends Conta { // Herda os atributos e herda os m√©todos, mas n√£o os Construtores!!!!!


	private static ArrayList<String> cpfExistentes = new ArrayList<>();
	private static ArrayList<String> cnpjExistentes = new ArrayList<>();

	private double saldo;
	private PF pf;
	private PJ pj;
	private boolean status = false;

	public PF getPf() {
		return pf;
	}

	public String imprimirSaldo() {
		return String.format("R$ %.2f", this.saldo);
	}

	public String criarConta(PJ pjP) {
		if (!verificacaoContaExistente(pjP) && Cnpj.isCNPJ(pjP.getCnpj())) {
			this.cnpjExistentes.add(pjP.getCnpj());
			this.pj = pjP;
			Random rand = new Random();
			super.setAgencia(100 * (rand.nextInt(5) + 1));
			int ag = rand.nextInt((16 - 12) + 1) + 12;
			super.setAgencia(getAgencia() + ag);
			super.setNumero(rand.nextInt(999999));
			this.saldo = 0;
			return "Conta corrente feita com sucesso!\n+Conta: " + getNumero() + "\nAgencia: " + mostraAgencia();

		} else {
			return "N„o foi possivel criar conta!";
		}
	}

	public String criarConta(PF pfP) {
		if (!verificacaoContaExistente(pfP) && Cpf.isCPF(pfP.getCpf())) {
			this.cpfExistentes.add(pfP.getCpf());
			this.pf = pfP;
			Random rand = new Random();
			super.setAgencia(100 * (rand.nextInt(5) + 1));
			int ag = rand.nextInt((16 - 12) + 1) + 12;
			super.setAgencia(getAgencia() + ag);
			super.setNumero(rand.nextInt(999999));
			this.saldo = 0;
			return "Conta corrente feita com sucesso!\n+Conta: " + getNumero() + "\nAgencia: " + mostraAgencia();
		} else {
			return "Voce possui uma conta corrente!";
		}
	}

	public boolean verificacaoContaExistente(PF pfP) {
		for (int cont = 0; cont < cpfExistentes.size(); cont++) {
			if (pfP.getCpf() == cpfExistentes.get(cont)) {
				return true;
			}
		}
		return false;
	}

	public boolean verificacaoContaExistente(PJ pjP) {
		for (int cont = 0; cont < cnpjExistentes.size(); cont++) {
			if (pjP.getCnpj() == cnpjExistentes.get(cont)) {
				return true;
			}
		}
		return false;
	}

	public boolean sacarPF(String cpf, double valor) {
		String valorTexto = Double.toString(valor);
		if (cpf == this.pf.getCpf() && this.saldo >= valor && valor != 3 && valor > 2
				&& "0".equals(valorTexto.substring(valorTexto.length() - 1, valorTexto.length()))) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}

	}

	public boolean sacarPF(String cpf, double valor, ContaPoupanca cp) {
		String valorTexto = Double.toString(valor);
		if (cpf == this.pf.getCpf() && valor != 3 && valor > 2
				&& "0".equals(valorTexto.substring(valorTexto.length() - 1, valorTexto.length()))) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				return true;
			} else if (cp.verificacaoContaExistente(this.pf)) {
				double devendo = this.saldo - valor;
				this.saldo = 0;
				cp.setSaldo(cp.getSaldo() + devendo);
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public boolean sacarPJ(String cnpj, double valor) {
		String valorTexto = Double.toString(valor);
		if (cnpj == this.pj.getCnpj() && this.saldo >= valor && valor != 3 && valor > 2
				&& "0".equals(valorTexto.substring(valorTexto.length() - 1, valorTexto.length()))) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String consultarSaldoContaPF(String cpf) {
		if (this.pf.getCpf() == cpf) {
			return ("Titular: " + pf.getNome() + "\n" + this.imprimirSaldo() + "\n" + Cpf.imprimeCPF(pf.getCpf()));
		} else {
			return "Esse cpf n„o possui uma conta";
		}
	}

	public String consultarSaldoContaPJ(String cnpj) {
		if (this.pf.getCpf() == cnpj) {
			return ("Titular: " + pj.getRazaoSocial() + "\n" + this.imprimirSaldo() + "\n"
					+ Cnpj.imprimeCNPJ(pj.getCnpj()));
		} else {
			return "Esse cnpj n„o possui uma conta";
		}
	}
	/**
	 * @param valor: valor a ser depositado n„o pode ser maior que 2000,00 menor que 2 nem o valor 3 e
	 *                n„o pode valores quebrados
	 * @param notas: quantidades de notas a serem depositadas n„o pode ser depositado 0 notas nem maior que vinte
	 * @return: retornar· true se deu certo o deposito e false se deu errado o deposito
	 */

	public boolean deposita(double valor,int notas){
		if(notas <= 20 && valor <= 20*100 && valor > 1 && valor != 3 && notas >0 && valor == (int)valor){
			this.saldo =+ valor;
			return true;
		}
		return false;
	}

}

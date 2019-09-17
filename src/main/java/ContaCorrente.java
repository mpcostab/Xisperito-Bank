package main.java;

import main.java.Cliente;
import main.java.Conta;

import java.util.ArrayList;
import java.util.Random;

//new ContaCorrente()
public class ContaCorrente extends Conta { //Herda os atributos e herda os m√©todos, mas n√£o os Construtores!!!!!
	private static ArrayList<String> cpfExistentes = new ArrayList<>();
	private static ArrayList<String> cnpjExistentes = new ArrayList<>();
	private PF pf;
	private PJ pj;

	/**
	 * 
	 * @param pfP
	 */
	public ContaCorrente(PF pfP) {
		if (verificacaoConta(pfP)) {
			this.cpfExistentes.add(pfP.getCpf());
			this.pf = pfP;
			Random rand = new Random();
			super.setAgencia(rand.nextInt(5) + 1);
			super.setNumero(rand.nextInt(999999));
			super.setSaldo(0);
			System.out.println("sucesso!");
		} else {
			System.out.println("Deu RUIM");
		}
	}

	public ContaCorrente(PJ pjP) {
		if (verificacaoConta(pjP)) {
			this.cpfExistentes.add(pjP.getCnpj());
			this.pj = pjP;
			Random rand = new Random();
			super.setAgencia(rand.nextInt(5) + 1);
			super.setNumero(rand.nextInt(999999));
			super.setSaldo(0);
			System.out.println("sucesso!");
		} else {
			System.out.println("DEU RUIM!");
		}
	}

	public boolean verificacaoConta(PF pfP) {
		for (int cont = 0; cont < cpfExistentes.size(); cont++) {
			if (pfP.getCpf() == cpfExistentes.get(cont)) {
				return false;
			}
		}
		return true;
	}

	public boolean verificacaoConta(PJ pjP) {
		for (int cont = 0; cont < cpfExistentes.size(); cont++) {
			if (pjP.getCnpj() == cpfExistentes.get(cont)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean transfere(double valor, Conta destino) {
		if (this.sacar(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean sacar(double valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String consultarSaldo(PF pf) {
		if (this.pf.getCpf() == pf.getCpf()) {
			return ("Titular: " + pf.getNome() + "\n" + this.imprimirSaldo() + "\n" + Cpf.imprimeCPF(pf.getCpf()));
		} else {
			return "Esse cpf n„o possui uma conta";
		}
	}
	
	public String consultarSaldo(PJ pj) {
		if (this.pf.getCpf() == pj.getCnpj()) {
			return ("Titular: " + pj.getRazaoSocial() + "\n" + this.imprimirSaldo() + "\n" + Cnpj.imprimeCNPJ(pj.getCnpj()));
		} else {
			return "Esse cnpj n„o possui uma conta";
		}
	}
}

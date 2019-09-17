package main.java;

import java.util.ArrayList;
import java.util.Random;

public class ContaPoupanca extends Conta{
	private static ArrayList<String> cpfExistentes = new ArrayList<>();
	private PF pf;
	/**
	 * 
	 * @param pfP
	 */
	
	public ContaPoupanca(PF pfP) {
		if (verificacaoContaExistente(pfP)) {
			this.cpfExistentes.add(pfP.getCpf());
			this.pf = pfP;
			Random rand = new Random();
			super.setAgencia(rand.nextInt(5)+1);
			super.setNumero(rand.nextInt(999999));
			super.setSaldo(0);
			System.out.println("Conta poupança feita com sucesso!");
		} else {
			System.out.println("Você já possui uma conta poupança!");
		}
	}

	public boolean verificacaoContaExistente(PF pfP) {
		for (int cont = 0; cont < cpfExistentes.size(); cont++) {
			if (pfP.getCpf() == cpfExistentes.get(cont)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void deposita(double valor) {
		super.setSaldo(super.getSaldo() + valor);

	}

	@Override
	public boolean transfere(double valor, Conta destino) {
		return false;
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
			return "Esse cpf não possui uma conta";
		}
	}
}

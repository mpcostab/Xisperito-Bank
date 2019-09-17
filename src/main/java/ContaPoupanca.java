package main.java;

import java.util.ArrayList;
import java.util.Random;

public class ContaPoupanca extends Conta {
	private static ArrayList<String> cpfExistentes = new ArrayList<>();
	private PF pf;

	private double saldo;

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}	
	
	public String imprimirSaldo() {
		return String.format("R$ %.2f", this.saldo);
	}

	public void criarConta(PF pfP) {
		if (verificacaoContaExistenteCp(pfP)) {
			this.cpfExistentes.add(pfP.getCpf());
			this.pf = pfP;
			Random rand = new Random();
			super.setAgencia(rand.nextInt(5) + 1);
			super.setNumero(rand.nextInt(999999));
			this.saldo = 1000;
			System.out.println("Conta corrente feita com sucesso!");
		} else {
			System.out.println("Voce possui uma conta corrente!");
		}
	}

	public boolean verificacaoContaExistenteCp(PF pfP) {
		for (int cont = 0; cont < cpfExistentes.size(); cont++) {
			if (pfP.getCpf() == cpfExistentes.get(cont) ) {
				return false;
			}
		}
		return true;
	}

	public boolean sacarPF(String cpf,double valor) {
		String valorTexto = Double.toString(valor);
		if(cpf == this.pf.getCpf() && this.saldo >= valor && valor !=3 && valor > 2 && "0".equals(valorTexto.substring(valorTexto.length()-1, valorTexto.length()))) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}

	}

	public boolean depositar(double valor, int notas){
		if(valor > 1 && valor != 3 && 0 < notas && notas <= 20 && valor == (int) valor) {
			this.saldo += valor;
			return true;
		}else{
			return false;
		}
	}

	@Override
	public String consultarSaldoContaPF(String cpf) {
		if (this.pf.getCpf() == cpf) {
			return ("Titular: " + pf.getNome() + "\n" + this.imprimirSaldo() + "\n" + Cpf.imprimeCPF(pf.getCpf()));
		} else {
			return "Esse cpf não possui uma conta";
		}
	}
}
package main.java;

import main.java.Cliente;

import java.util.Random;

public abstract class Conta{ //N�o posso instanciar objetos de classes abstradas
	private double saldo;
	private int agencia;
	private int numero;
	

	public String imprimirSaldo() {
		return "R$"+this.getSaldo();
	}

	
	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public abstract void deposita(double valor);

	public abstract boolean transfere(double valor, Conta destino);
	
	public abstract boolean sacar(double valor);
	
	public abstract String consultarSaldo(PF pf); 
}
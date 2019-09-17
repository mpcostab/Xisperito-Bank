package main.java;

import main.java.Cliente;

import java.util.Random;

public abstract class Conta{ //N�o posso instanciar objetos de classes abstradas
	private int agencia;
	private int numero;

	public String mostraAgencia(){
		String str ="0000"+Integer.toString(getAgencia()/100)+"-"+Integer.toString(getAgencia()%100);
		return str;
	}
	public String mostraContaeAgencia(){
		return getNumero()+"/"+mostraAgencia();
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
	
	
	public abstract String consultarSaldoContaPF(String cpf); 
}
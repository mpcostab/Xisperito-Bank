package main.java;

public class Endereco {

	private String logradouro;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	
	/**
	 * 
	 * @param logradouroP
	 * @param numeroP
	 * @param bairroP
	 * @param cidadeP
	 * @param estadoP
	 */
	
	public Endereco(String logradouroP, int numeroP, String bairroP, String cidadeP, String estadoP) {
		this.logradouro = logradouroP;
		this.numero = numeroP;
		this.bairro = bairroP;
		this.cidade = cidadeP;
		this.estado = estadoP;
	}
	
	public Endereco(String logradouroP, int numeroP, String bairroP, String cidadeP, String estadoP, String complementoP) {
		this.logradouro = logradouroP;
		this.numero = numeroP;
		this.bairro = bairroP;
		this.cidade = cidadeP;
		this.estado = estadoP;
		this.complemento = complementoP;
	}
	
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", complemento=" + complemento
				+ ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + "]";
	}	
}

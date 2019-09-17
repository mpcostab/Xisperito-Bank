package main.java;

public class Cliente {

	private String email;
    private String contato;
    private Endereco endereco;

    /**
     * 
     * @param emailP
     * @param contatoP
     * @param logradouroP
     * @param numeroP
     * @param bairroP
     * @param cidadeP
     * @param estadoP
     */
    public Cliente(String emailP,String contatoP, String logradouroP, int numeroP, String bairroP, String cidadeP, String estadoP,String cnpjOuCpf) {
    	this.endereco = new Endereco(logradouroP,  numeroP,  bairroP, cidadeP, estadoP);
    	this.email = emailP;
    	this.contato = contatoP;
    }

    public String getContato() {
        return contato;
    }
    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "Cliente [email=" + email + ", contato=" + contato + ", enderco=" + endereco.toString() + "]";
	}
}

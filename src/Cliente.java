public class Cliente {


	private String email;
    private String contato;
    private Endereco enderco;
    
    public Cliente(String emailP,String contatoP, String logradouroP, int numeroP, String bairroP, String cidadeP, String estadoP) {
    	this.enderco = new Endereco(logradouroP,  numeroP,  bairroP, cidadeP, estadoP);
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
    
    public Endereco getEnderco() {
		return enderco;
	}

	public void setEnderco(Endereco enderco) {
		this.enderco = enderco;
	}
	
	@Override
	public String toString() {
		return "Cliente [email=" + email + ", contato=" + contato + ", enderco=" + enderco.toString() + "]";
	}
}

public class Cliente {


	private String email;
    private String contato;
    private Endereco endereco;
    
    public Cliente(String emailP,String contatoP, String logradouroP, int numeroP, String bairroP, String cidadeP, String estadoP,String cnpjOuCpf) {
    	if(!Cnpj.isCNPJ(cnpjOuCpf)){

        }
    	else if (!Cpf.isCPF(cnpjOuCpf)) {

        }
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

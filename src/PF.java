public class PF extends Cliente {

	private String nome;
    private String rg;
    private String cpf;
    
    public PF(String nomeP, String rgP, String cpfP,String emailP, String contatoP, String logradouroP, int numeroP, String bairroP, String cidadeP,
			String estadoP) {
		super(emailP, contatoP, logradouroP, numeroP, bairroP, cidadeP, estadoP);
		this.nome = nomeP;
		this.rg = rgP;
		this.cpf = cpfP;
		// TODO Auto-generated constructor stub
	}
    

	public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String getContato() {
        return super.getContato();
    }

    @Override
    public void setContato(String contato) {
        super.setContato(contato);
    }
    
    @Override
   	public String toString() {
   		return "PF [nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + super.toString()+"]";
   	}
}

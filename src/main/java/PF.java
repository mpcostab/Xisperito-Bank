package main.java;

public class PF extends Cliente {

	private String nome;
    private String rg;
    private String cpf;
    
    public PF(String nomeP, String rgP, String cpfP,String emailP, String contatoP, String logradouroP, int numeroP, String bairroP, String cidadeP,
			String estadoP) {

		super(emailP, contatoP, logradouroP, numeroP, bairroP, cidadeP, estadoP,cpfP);
		this.nome = nomeP;

		if (Cpf.isCPF(cpfP)
                && Cliente.validarContato(contatoP)
                && Cliente.validarEmail(emailP)
                && Cliente.validarRg(rgP)) {
			this.cpf = cpfP;
            this.rg = rgP;
		}
		else {
			System.out.println("Nao foi possivel criar a conta");
		}

		// TODO Auto-generated constructor stub
	}
    

	public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() { return this.nome;}

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
}

public class PJ extends Cliente {
    private String cnpj;
    private String razaoSocial;
    
    public PJ(String cnpjP , String razaoSocialP, String emailP, String contatoP, String logradouroP, int numeroP, String bairroP, String cidadeP,String estadoP) {
        super(emailP, contatoP, logradouroP, numeroP, bairroP, cidadeP, estadoP);
		this.cnpj = cnpjP;
		this.razaoSocial = razaoSocialP;

		// TODO Auto-generated constructor stub
	}

	public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public void setContato(String contato) {
        super.setContato(contato);
    }

    @Override
    public String getContato() {
        return super.getContato();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }
    @Override
    public String toString(){
    return "Razão Social: "+razaoSocial+" CNPJ: "+Cnpj.imprimeCNPJ(this.cnpj);
    }
}

package desafio.geral;

public class PessoaJuridica implements Pessoa {
    private String nomeFantasia;
    private String cnpj;
    
    public PessoaJuridica(String nomeFantasia, String cnpj) {
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }
    
    @Override
    public String getNome() {
        return nomeFantasia;
    }
    
    @Override
    public int getIdade() {
        return 0;
    }
    
    @Override
    public String getSexo() {
        return "N/A";
    }

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Descrição da Pessoa juridica:\nNome Fantasia: " + nomeFantasia + ", Cnpj: " + cnpj + ".\n";
	}
	
	
}


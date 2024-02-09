package desafio.geral;

public class Estudante implements Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private String curso;
    
    public Estudante(String nome, int idade, String sexo, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.curso = curso;
    }
    
    @Override
    public String getNome() {
        return nome;
    }
    
    @Override
    public int getIdade() {
        return idade;
    }
    
    @Override
    public String getSexo() {
        return sexo;
    }
    
    public String getCurso() {
        return curso;
    }

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Descrição do Estudante: \nNome: " + nome + ", idade: " + idade + ", sexo: " + sexo + ", curso: " + curso + ".";
	}
	
	 
}
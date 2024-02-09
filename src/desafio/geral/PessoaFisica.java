package desafio.geral;

public class PessoaFisica implements Pessoa {
 private String nome;
 private int idade;
 private String sexo;
 
 public PessoaFisica(String nome, int idade, String sexo) {
     this.nome = nome;
     this.idade = idade;
     this.sexo = sexo;
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

public void setNome(String nome) {
	this.nome = nome;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public void setSexo(String sexo) {
	this.sexo = sexo;
}

@Override
public String toString() {
	return "Descrição da Pessoa Física:\nNome: " + nome + ", Idade: " + idade + ", Sexo: " + sexo + ".\n";
}

 
}

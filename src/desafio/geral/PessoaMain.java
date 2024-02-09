package desafio.geral;

public class PessoaMain {
    public static void main(String[] args) {
    	
        PessoaFisica pessoaFisica = new PessoaFisica("Lana", 26, "Feminino");
        System.out.println(pessoaFisica);

        PessoaJuridica pessoaJuridica = new PessoaJuridica("LS Story", "25387678000185");
        System.out.println(pessoaJuridica);

        Estudante estudante = new Estudante("Gesica", 29, "Feminino", "Engenharia");
        System.out.println(estudante);
    }
}


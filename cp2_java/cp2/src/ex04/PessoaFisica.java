package ex04;

public class PessoaFisica extends Pessoas{
	private String cpf;
	private int idade;
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public PessoaFisica(){
		
	}
	public PessoaFisica(String nome, String sexo, int idade, int id, String cpf) {
		super(nome, sexo, idade, id);
		
		this.cpf=cpf;
	}
	public void atualizarIdade(int novaData) {
		this.idade = novaData;
	}
}
	
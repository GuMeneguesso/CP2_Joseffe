package ex04;

public class PessoaJuridica extends Pessoas{
	private String cnpj;
	private int idade;

	public PessoaJuridica() {
		
	}
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	PessoaJuridica(String nome, String sexo, int idade, int id, String cnpj){
		super(nome, sexo ,idade, id);
		this.cnpj=cnpj;
	}
	public void atualizarIdade(int novaData) {
		this.idade = 0;
	}
}
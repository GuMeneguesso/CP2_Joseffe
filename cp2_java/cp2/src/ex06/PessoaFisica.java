package ex06;

public class PessoaFisica extends Pessoa{
	private String cpf;
	private int idade;
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	private String nome;
	private String sexo;
	private int id;
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public PessoaFisica(){
		
	}
	public PessoaFisica(String nome, String sexo, int idade, int id, String cpf) {
		this.nome= nome;
		this.sexo=sexo;
		this.idade=idade;
		this.id=id;
		this.cpf=cpf;
	}
	public void atualizarIdade(int novaIdade) {
		this.idade = novaIdade;
	}
	public void AtualizarNome(String nome){	
		this.setNome(nome);
		
	}

}

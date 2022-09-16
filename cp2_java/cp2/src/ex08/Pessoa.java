package ex08;

public abstract class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	private int id;
	private String cnpj;
	private String cpf;
	
	
	public Pessoa(){
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Pessoa(String nome, String sexo, int idade, int id){
		this.nome=nome;
		this.sexo=sexo;
		this.idade=idade;
		this.id=id;
	}
	
	public abstract void AtualizarNome(String nome);

}

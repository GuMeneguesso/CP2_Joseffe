package ex08;

public class PessoaJuridica extends Pessoa implements InterfacePessoa{
	private String cnpj, nome;
	private int id;

public void setNome(String nome) {
	this.nome = nome;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public PessoaJuridica() {
	
}
public String getCnpj() {
	return cnpj;
}

public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
}
public PessoaJuridica(String nome, String sexo, int idade, int id, String cnpj){
	super(nome, sexo ,idade, id);
	this.cnpj = cnpj;
}


public void AtualizarNome(String nome) {
	this.setNome(nome);
	
}

@Override
public void atualizarNome(String nome) {
	
}

}
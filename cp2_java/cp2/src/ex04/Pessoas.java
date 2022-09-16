package ex04;

import java.util.Date;

public class Pessoas {
	private String nome;
	private int idade;
	private String sexo;
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Pessoas(){
		
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
	public Pessoas(String nome, String sexo, int idade, int id){
		this.nome=nome;
		this.sexo=sexo;
		this.idade=idade;
		this.id=id;
	}
	public void atualizarIdade(int novaData) {
		this.idade = novaData;
	}
	public void atualizarIdade(int novaData, Date dataAntiga) {
		this.idade = novaData;
	}
}
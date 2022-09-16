package ex03;

import java.util.Date;

public class Contas {
	private String agencia;
	private String numero;
	private double saldo;
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Contas(){
		
	}
	public Contas(String agencia, String numero, double saldo) {
		this.agencia=agencia;
		this.numero=numero;
		this.saldo=saldo;
	}
	protected String exibirMensagem() {
		return "Bem vindo à conta";
	}
	
	public void Depositar(double valor) {
		this.saldo += valor;
	}
	public void Depositar(double valor, String nomePessoa) {
		this.saldo += valor;
	}
	public void Depositar(double valor, String nomePessoa, Date dataDeposito) {
		this.saldo += valor;
	}
}
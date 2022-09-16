package ex03;

public class ContaPoupanca extends Contas{
	private double rentabilidade;
	

	public double getRentablidade() {
		return rentabilidade;
	}

	public void setRentabilidade(double rentabilidade) {
		this.rentabilidade = rentabilidade;
	}
	public ContaPoupanca() {
		
	}
	public ContaPoupanca(double rentabilidade) {
		this.rentabilidade=rentabilidade;
	}
	public ContaPoupanca(String agencia, String numero, double salario, double rentabilidade) {
		super(agencia, numero, salario);
		
		this.rentabilidade=rentabilidade;
	}
	public void Depositar(double valor) {
		super.Depositar(valor);
		
		valor = valor - 0.50;
		this.setSaldo(valor);
		}
	
	

}
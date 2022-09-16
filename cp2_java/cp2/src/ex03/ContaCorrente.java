package ex03;

public class ContaCorrente extends Contas{
	private double chequeEspecial;
	

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	public ContaCorrente() {
		
	}
	
	
	public ContaCorrente(String agencia, String numero, double salario, double chequeEspecial) {
        super(agencia, numero, salario);
       
        this.chequeEspecial = chequeEspecial;
    }
	public void Depositar(double valor) {
		super.Depositar(valor);
		
		valor = valor + 0.50;
		this.setSaldo(valor);
	}
	


}
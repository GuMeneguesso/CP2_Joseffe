package ex09;

public class Retangulo extends Quadrilateros{
	private double base;
	private double altura;
	private int id;
	
	
	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public double calculoPerimetro(double base, double altura) {
		return (base * altura);
		
	}
	public Retangulo(double base, double altura, double ladoA, double ladoB) {
		super(base, altura, ladoA, ladoB);
		
	}



	
	public Retangulo() {
		
	}

	public void calculoArea() {
		
	}

	public void calculoPerimetro() {
		
		
	}
}
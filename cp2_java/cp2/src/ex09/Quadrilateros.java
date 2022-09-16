package ex09;

public abstract class Quadrilateros implements FormaGeometrica{
	private double base;
	private double altura;
	private double ladoA;
	private double ladoB;
	
	public Quadrilateros(double base, double altura, double ladoA, double ladoB) {
		this.base=base;
		this.altura=altura;
		this.ladoA=ladoA;
		this.ladoB=ladoB;
	}
	public Quadrilateros(double d) {
	
	}
	public void Quadrado(double ladoA) {
		this.ladoA = ladoA * ladoA;
	}
	public abstract void calculoPerimetro();
	public abstract void calculoArea();

	
	
}
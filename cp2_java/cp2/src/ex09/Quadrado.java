package ex09;

public class Quadrado extends Quadrilateros{
	
	
	private double ladoA;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	
	public double calculoPerimetro(double ladoA) {
			return ladoA * ladoA;
		
	}

	@Override
	public void calculoArea() {
		
		
	}

	
	public void calculoPerimetro() {
		
		
	}
	public Quadrado(double base, double altura, double ladoA, double ladoB) {
		super(base, altura, ladoA, ladoB);
		
	}
	

	public Quadrado(double ladoA) {
		super (ladoA * ladoA);
	}


	
	
}
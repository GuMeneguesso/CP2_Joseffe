package ex09;

public class Circulo implements FormaGeometrica {
	
	private double raio;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public void calculoPerimetro() {
		// TODO Auto-generated method stub

}

	public double calculoArea(double raio) {
		double area = 3.14 * (this.raio=raio * raio);
		return area;

}

	@Override
	public void calculoArea() {
		
	}	
}
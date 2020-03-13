package geometria_parcial_3;

public abstract class Poligono extends Figura {

	private double base;
	private double altura;
	
	public Poligono(double base, double altura) {
		this.base = base;
		this.altura = altura;
		
	}

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

	@Override
	public String toString() {
		return "Poligono [base=" + base + ", altura=" + altura + "]";
	}
	


}

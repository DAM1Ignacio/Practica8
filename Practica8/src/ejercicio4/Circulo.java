package ejercicio4;

public class Circulo extends FiguraGeometrica {
	private double radio;

	public Circulo(double radio) {
		super(radio * 2, radio * 2);
		setRadio(radio);
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	double calcularArea() {
		double area = Math.PI * (Math.pow(radio, 2));
		return area;
	}

}

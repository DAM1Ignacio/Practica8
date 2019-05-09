package ejercicio4;

public abstract class FiguraGeometrica {

	protected double alto;
	protected double ancho;
	
	
	public FiguraGeometrica(double alto, double ancho) {
		setAlto(alto);
		setAncho(ancho);
	}
	

	abstract double calcularArea();;
	
	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		this.alto = alto;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	
	
}

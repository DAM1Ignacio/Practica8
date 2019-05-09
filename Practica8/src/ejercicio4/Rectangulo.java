package ejercicio4;

public class Rectangulo extends FiguraGeometrica {

	public Rectangulo(double alto, double ancho) {
		super(alto, ancho);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calcularArea() {
		return alto*ancho;
	}

}

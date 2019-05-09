package ejercicio4;

public class Triangulo extends FiguraGeometrica{

	public Triangulo(double alto, double ancho) {
		super(alto, ancho);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calcularArea() {
		return (alto*ancho)/2;
	}
	

}

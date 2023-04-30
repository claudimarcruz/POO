package Interface;

public class Triangulo implements FiguraGeometrica {
	private int base;
	private int altura;
	private int lado1;
	private int lado2;
	private int lado3;
	
	
	public String getNomeFigura() {
		return "Triangulo";
	}
	
	public int getArea() {
		return (base * altura)/2;
	}
	
	public int getPerimetro() {
		return lado1 + lado2 * lado3;
		
	}
	
	
}

package Interface;

public class Quadrado implements FiguraGeometrica{
	private int lado;
	
	public String getNomeFigura() {
		return "Quadrado";
	}
	
	public int getArea() {
		return lado * lado;
	}
	
	public int getPerimetro() {
		return lado *4;
	}
}

package biblioteca_MVC_Claudimar_Cruz;

public class Principal {
public static void main(String[] args) {
	
	View v = new View();
	ViewCategoria c = new ViewCategoria();
	ViewPertence p = new ViewPertence();
	new Controller(v);
	new ControllerPertence(p);
	new ControllerCategoria(c);
	
}
}

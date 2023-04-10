package biblioteca_MVC_Claudimar_Cruz;

public class Principal {
public static void main(String[] args) {
	ModelLivro ml = new ModelLivro();
	ModelCategoria mc = new ModelCategoria();
	ModelPertence mp = new ModelPertence();
	View v = new View();
	new Controller(ml, mc, mp, v);
}
}

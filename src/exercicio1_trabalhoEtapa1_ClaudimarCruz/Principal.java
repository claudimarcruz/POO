package exercicio1_trabalhoEtapa1_ClaudimarCruz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class Principal {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
		List<Prato> listaPratos = new ArrayList<Prato>();
		
		Salgadinho salg = new Salgadinho(1, "salgado1", "recheio1","massa1","tipoA", 5.00f, formato.parse("10/04/2023"),100f);
		listaPratos.add(salg);
		salg = new Salgadinho(2, "salgado2", "recheio2","massa2","tipoF", 7.00f, formato.parse("15/04/2023"),750f);
		listaPratos.add(salg);
		
		Lanche lan = new Lanche(3, "lanche1", "pao1", "recheio1", "molho1", 15.00f, formato.parse("23/03/2023"), 500f);
		listaPratos.add(lan);
		lan = new Lanche(4, "lanche2", "pao2", "recheio2", "molho2", 18.00f, formato.parse("22/03/2023"), 600f);
		listaPratos.add(lan);
		
		Pizza piz = new Pizza(5, "Pizza1", true, "recheio1", 35.00f, formato.parse("01/04/2023"), 300f);
		listaPratos.add(piz);
		piz = new Pizza(6, "Pizza2", false, "recheio2", 32.00f, formato.parse("01/04/2023"), 280f);
		listaPratos.add(piz);
		
			
		Cliente c = new Cliente("Cliente1");
		List<String> pratoPedido = new ArrayList<String>();
		pratoPedido.add("salgado1");
		pratoPedido.add("salgado2");
		
		List<Pedido> pedido = new ArrayList<Pedido>();
		Pedido p1 = new Pedido(500, c.getNome(), 0.0f, pratoPedido);
		//System.out.println(p1.getItensConsumidos());
		pedido.add(p1);
		
	
		for(Pedido pe: pedido) {
			System.out.println(pe.getItensConsumidos()); 
		 }
		
		
		
	}
	
}

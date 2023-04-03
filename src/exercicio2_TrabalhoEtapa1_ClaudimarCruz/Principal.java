package exercicio2_TrabalhoEtapa1_ClaudimarCruz;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) throws ParseException {
		
	List<Empregado> listaEmpregados = new ArrayList<Empregado>();
	Empregado e1 = new Empregado(01, "empregado1", "emp1", "*******", "Vendedor" );
	Empregado e2 = new Empregado(02, "empregado2", "emp2", "*******", "Vendedor" );
	Empregado e3 = new Empregado(03, "empregado3", "emp3", "*******", "Secretario" );
	listaEmpregados.add(e1);
	listaEmpregados.add(e2);
	listaEmpregados.add(e3);
	
	
	Gerente g1 = new Gerente(10, "gerente1", "ger1", "*******", "Financeiro");
	Gerente g2 = new Gerente(11, "gerente2", "ger2", "*******", "Produção");
	Gerente g3 = new Gerente(12, "gerente3", "ger3", "*******", "Vendas");
	
	Cliente_PJ c1 = new Cliente_PJ(20,"000000000","cliente1", "9999-9999", "Rua A");
	Cliente_PF c2 = new Cliente_PF(21,"111111111","cliente2", "8888-8888", "Rua B");
	Cliente_PF c3 = new Cliente_PF(22,"222222222","cliente3", "7777-7777", "Rua C");
	
	
	
	}
	/*
	public static void realizarVenda(List<Pedidos> lp, Empregado e ) {
		//List<Pedidos> lp = new ArrayList<Pedidos>();
		if(e.getSetor() == "Vendedor") {
			for(Pedidos p: lp) {
				p.setIdPedido(2);
				
			}
		}
		
	}*/
}

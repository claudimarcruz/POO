package aula04_pet_shop_Claudimar_Cruz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	static Scanner entrada = new Scanner(System.in);
	static SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");

	public static void main(String[] args)  throws ParseException {
	
		List<Proprietario> clientes = new ArrayList<Proprietario>(); 
		
		Date dt1 = formato.parse("18/02/1995");
		Proprietario p1 = new Proprietario("Fernanda", dt1, "000.000.000-00", "99999-999","Rua de cima");
		clientes.add(p1);
		
		Date dt2 = formato.parse("31/08/1995");
		Proprietario p2 = new Proprietario("Fabio", dt2, "111.111.111-11", "8888-888","Rua de baixo");
		clientes.add(p2);
		
		
		List<Cao> caes = new ArrayList<Cao>(); 
		
		Cao c1 = new Cao(1, "Spike", 4, "Pincher", "Marrom", "Macho", "Pequeno", 0.125f);
		caes.add(c1);
		Cao c2 = new Cao(2, "Lua", 7, "Vira-lata", "Caramelo", "Fêmea", "Médio", 4.224f);
		caes.add(c2);
		
		
		List<Gato> gatos = new ArrayList<Gato>(); 
		
		Gato g1 = new Gato(3, "Blue", 2, "Siamês", "Preto e branco", "Macho", "Pequeno", 1.200f);
		gatos.add(g1);
		Gato g2 = new Gato(4, "Black", 2, "Persa", "Preto", "Macho", "Médio", 1.500f);
		gatos.add(g2);
		
		List<Passaro> passaros = new ArrayList<Passaro>(); 
		
		Passaro pa1 = new Passaro(5, "Caly", 1, "Calopsita", "Amarelo", "Fêmes", 187);
		passaros.add(pa1);
		Passaro pa2 = new Passaro(6, "Tokio", 1, "Tucano", "Verde", "Macho", 257);
		passaros.add(pa2);
		
		List<Pertence> cadastro = new ArrayList<Pertence>();
		
		Pertence pe1 = new Pertence(1, p1.getCPF(), c1.getId());
		cadastro.add(pe1);
		Pertence pe2 = new Pertence(2, p1.getCPF(), g1.getId());
		cadastro.add(pe2);
		Pertence pe3 = new Pertence(3, p1.getCPF(), pa1.getId());
		cadastro.add(pe3);
		Pertence pe4 = new Pertence(4, p2.getCPF(), c2.getId());
		cadastro.add(pe4);
		Pertence pe5 = new Pertence(5, p2.getCPF(), g2.getId());
		cadastro.add(pe5);
		Pertence pe6 = new Pertence(6, p2.getCPF(), pa2.getId());
		cadastro.add(pe6);
		
		
		for(Proprietario p : clientes){
			for(Pertence pe : cadastro) {
				if (p.getCPF() == pe.getCPF_dono()) {
					System.out.println("Proprietario -> Nome: " + p.getNome() + " / CPF: " + p.getCPF());
					for (Cao c : caes) {
						if(c.getId() == pe.getId_animal()) {
							System.out.println("Animal -> Nome: " + c.getNome() + " / Idade: " + c.getIdade() + " / Raça: " + c.getRaca() + " / Cor: " + c.getCor() + " / Sexo: " + c.getSexo());
							System.out.println( );
						}
						
					}
					for (Gato g : gatos) {
						if(g.getId() == pe.getId_animal()) {
							System.out.println("Animal -> Nome: " + g.getNome() + " / Idade: " + g.getIdade() + " / Raça: " + g.getRaca() + " / Cor: " + g.getCor() + " / Sexo: " + g.getSexo());
							System.out.println( );
						}
						
					}
					for (Passaro pa : passaros) {
						if(pa.getId() == pe.getId_animal()) {
							System.out.println("Animal -> Nome: " + pa.getNome() + " / Idade: " + pa.getIdade() + " / Raça: " + pa.getRaca() + " / Cor: " + pa.getCor() + " / Sexo: " + pa.getSexo() + " / Anilha: " + pa.getNum_anilha());
							System.out.println( );
							
						}
						
					}
					
				}
			}
		}
		
	}
}

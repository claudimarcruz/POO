package exercicio_biblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Principal {
	public static void main (String[] args) throws ParseException {
		

		Categoria categoria1 = new Categoria(50, "Ficção científica");
		Categoria categoria2 = new Categoria(51, "Mistério");
		Categoria categoria3 = new Categoria(52, "Terror");
		Categoria categoria4 = new Categoria(53, "Biografia");
		
		List<Categoria> listaCategorias = new ArrayList<Categoria>();
		listaCategorias.add(categoria1);
		listaCategorias.add(categoria2);
		listaCategorias.add(categoria3);
		listaCategorias.add(categoria4);
		
		
		SimpleDateFormat formato = new SimpleDateFormat("yyyy"); 
		
		Date dataLivro1 = formato.parse("1953");
		Livro livro1 = new Livro(10, "As Cavernas de Aço", "Isaac Asimov", dataLivro1);
				
		Date dataLivro2 = formato.parse("1950");
		Livro livro2= new Livro(11, "Eu, Robô", "Isaac Asimov", dataLivro2);
				
		Date dataLivro3 = formato.parse("1983");
		Livro livro3 = new Livro(12, "O cemitério", "Stephen king", dataLivro3);
				
		Date dataLivro4 = formato.parse("1897");
		Livro livro4 = new Livro(13, "Drácula", "Bram Stoker", dataLivro4);
				
		Date dataLivro5 = formato.parse("1963");
		Livro livro5 = new Livro(14, "O colecionador", "John Fowles", dataLivro5);
				
		Date dataLivro6 = formato.parse("2003");
		Livro livro6 = new Livro(15, "O Código da Vinci", "Dan Brown", dataLivro6);
			
		Date dataLivro7 = formato.parse("1970");
		Livro livro7 = new Livro(16, "A Outra Face", "Sydney Sheldon", dataLivro7);
			
		Date dataLivro8 = formato.parse("1947");
		Livro livro8 = new Livro(17, "O Diário de Anne Frank", "Anne Frank", dataLivro8);
	
		Date dataLivro9 = formato.parse("1994");
		Livro livro9 = new Livro(18, "Longo Caminho para a Liberdade", "Nelson Mandela", dataLivro9);
				
		Date dataLivro10 = formato.parse("2017");
		Livro livro10 = new Livro(19, "Silvo Santos - a biografia", "Marcia Batista", dataLivro10);
		
		Date dataLivro11 = formato.parse("1934");
		Livro livro11 = new Livro(20, "O Assassinato No Expresso Oriente", " Agatha Christie", dataLivro11);
		
		
		List<Livro> listaLivros = new ArrayList<Livro>(); 
		
		listaLivros.add(livro1);
		listaLivros.add(livro2);
		listaLivros.add(livro3);
		listaLivros.add(livro4);
		listaLivros.add(livro5);
		listaLivros.add(livro6);
		listaLivros.add(livro7);
		listaLivros.add(livro8);
		listaLivros.add(livro9);
		listaLivros.add(livro10);
		listaLivros.add(livro11);
		
						
		Pertence cadastro1 = new Pertence(1, livro1.getId(), categoria1.get_id_categoria());
		Pertence cadastro2 = new Pertence(2, livro2.getId(), categoria1.get_id_categoria());
		Pertence cadastro3 = new Pertence(3, livro3.getId(), categoria3.get_id_categoria());
		Pertence cadastro4 = new Pertence(4, livro4.getId(), categoria3.get_id_categoria());
		Pertence cadastro5 = new Pertence(5, livro5.getId(), categoria3.get_id_categoria());
		Pertence cadastro6 = new Pertence(6, livro6.getId(), categoria2.get_id_categoria());
		Pertence cadastro7 = new Pertence(7, livro7.getId(), categoria2.get_id_categoria());
		Pertence cadastro8 = new Pertence(8, livro8.getId(), categoria4.get_id_categoria());
		Pertence cadastro9 = new Pertence(9, livro9.getId(), categoria4.get_id_categoria());
		Pertence cadastro10 = new Pertence(10, livro10.getId(), categoria4.get_id_categoria());
		Pertence cadastro11 = new Pertence(11, livro11.getId(), categoria2.get_id_categoria());
		Pertence cadastro12 = new Pertence(12, livro1.getId(), categoria2.get_id_categoria());
		
		
		
		List<Pertence> listaCadastro = new ArrayList<Pertence>();
		listaCadastro.add(cadastro1);
		listaCadastro.add(cadastro2);
		listaCadastro.add(cadastro3);
		listaCadastro.add(cadastro4);
		listaCadastro.add(cadastro5);
		listaCadastro.add(cadastro6);
		listaCadastro.add(cadastro7);
		listaCadastro.add(cadastro8);
		listaCadastro.add(cadastro9);
		listaCadastro.add(cadastro10);
		listaCadastro.add(cadastro11);
		listaCadastro.add(cadastro12);
	
		
		for (Livro livro : listaLivros) {
			for (Pertence cadastro : listaCadastro) {
				for (Categoria categoria : listaCategorias) {		
					if((livro.getId() == cadastro.get_id_do_livro()) && (categoria.get_id_categoria() == cadastro.get_id_da_categoria()) ) {
						System.out.println("Nome do Livro: " + livro.getNome() + " ------- Categoria: " + categoria.get_nome_categoria());
					}
				}
			}
		}
		
		
	
	}
}

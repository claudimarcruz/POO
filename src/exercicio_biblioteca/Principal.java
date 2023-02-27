package exercicio_biblioteca;

import java.text.ParseException;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {
	public static void main (String[] args) throws ParseException {
		
		Categoria categoria1 = new Categoria(50, "Ficção científica");
		Categoria categoria2 = new Categoria(51, "Mistério");
		Categoria categoria3 = new Categoria(52, "Terror");
		Categoria categoria4 = new Categoria(53, "Biografia");
		
		
		ArrayList<Livro> relacaoLivros = new ArrayList<Livro>();
		
		SimpleDateFormat formato = new SimpleDateFormat("yyyy"); 
		
		Date dataLivro1 = formato.parse("1953");
		Livro livro1 = new Livro(10, "As Cavernas de Aço", "Isaac Asimov", dataLivro1, categoria1.get_nome_categoria());
		relacaoLivros.add(livro1);
		
		Date dataLivro2 = formato.parse("1950");
		Livro livro2= new Livro(11, "Eu, Robô", "Isaac Asimov", dataLivro2, categoria1.get_nome_categoria());
		relacaoLivros.add(livro2);
		
		Date dataLivro3 = formato.parse("1983");
		Livro livro3 = new Livro(12, "O cemitério", "Stephen king", dataLivro3, categoria3.get_nome_categoria());
		relacaoLivros.add(livro3);
		
		Date dataLivro4 = formato.parse("1897");
		Livro livro4 = new Livro(13, "Drácula", "Bram Stoker", dataLivro4, categoria3.get_nome_categoria());
		relacaoLivros.add(livro4);
		
		Date dataLivro5 = formato.parse("1963");
		Livro livro5 = new Livro(14, "O colecionador", "John Fowles", dataLivro5, categoria3.get_nome_categoria());
		relacaoLivros.add(livro5);
		
		Date dataLivro6 = formato.parse("2003");
		Livro livro6 = new Livro(15, "O Código da Vinci", "Dan Brown", dataLivro6, categoria2.get_nome_categoria());
		relacaoLivros.add(livro6);
		
		Date dataLivro7 = formato.parse("1970");
		Livro livro7 = new Livro(16, "A Outra Face", "Sydney Sheldon", dataLivro7, categoria2.get_nome_categoria());
		relacaoLivros.add(livro7);
		
		Date dataLivro8 = formato.parse("1947");
		Livro livro8 = new Livro(17, "O Diário de Anne Frank", "Anne Frank", dataLivro8, categoria4.get_nome_categoria());
		relacaoLivros.add(livro8);
		
		Date dataLivro9 = formato.parse("1994");
		Livro livro9 = new Livro(18, "Longo Caminho para a Liberdade", "Nelson Mandela", dataLivro9, categoria4.get_nome_categoria());
		relacaoLivros.add(livro9);
		
		Date dataLivro10 = formato.parse("2017");
		Livro livro10 = new Livro(19, "Silvo Santos - a biografia", "Marcia Batista", dataLivro10, categoria4.get_nome_categoria());
		relacaoLivros.add(livro10);
		
		
		
		for (Livro livro : relacaoLivros) {
			System.out.println("Nome do Livro: " +livro.getNome() + "  -----  " + "Categoria: " + livro.getCategoria());
		}
		
		
		
		/*
		
		
		Pertence cadastro1 = new Pertence(1, livro[9].getId(), categoria1.get_id_categoria());
		Pertence cadastro2 = new Pertence(2, livro2.getId(), categoria1.get_id_categoria());
		Pertence cadastro3 = new Pertence(3, livro3.getId(), categoria3.get_id_categoria());
		Pertence cadastro4 = new Pertence(4, livro4.getId(), categoria3.get_id_categoria());
		Pertence cadastro5 = new Pertence(5, livro5.getId(), categoria3.get_id_categoria());
		Pertence cadastro6 = new Pertence(6, livro6.getId(), categoria2.get_id_categoria());
		Pertence cadastro7 = new Pertence(7, livro7.getId(), categoria2.get_id_categoria());
		Pertence cadastro8 = new Pertence(8, livro8.getId(), categoria4.get_id_categoria());
		Pertence cadastro9 = new Pertence(9, livro9.getId(), categoria4.get_id_categoria());
		Pertence cadastro10 = new Pertence(10, livro10.getId(), categoria4.get_id_categoria());
		
		
		System.out.println("Registro: " + cadastro1.getNumControle() + " / Id do Livro: " + cadastro1.get_id_do_livro() + " / Id da Categoria: " + cadastro1.get_id_da_categoria());
		*/
		
	
	}
}

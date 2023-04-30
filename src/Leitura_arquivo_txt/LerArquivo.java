package Leitura_arquivo_txt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LerArquivo {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new FileReader("D:/dados.txt")); 
		while (in.hasNextLine()) {   
			String line = in.nextLine();
		    System.out.println(line);
		}
	}
}
package trabalho_Etapa3_POO_ClaudimarCruz.PDF;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;


public abstract class GerarPDF {
	
	
	public static boolean gerarPdf(String titulo, String conteudo, String localPdf) {
		
		Document document = new Document();
        try {

            PdfWriter.getInstance(document, new FileOutputStream(localPdf));
            document.open();

            // adicionando um parÃ¡grafo no documento
            document.add(new Paragraph(titulo));
            document.add(new Paragraph(conteudo));
           
  }
        catch(DocumentException de) {
            System.err.println(de.getMessage());
        }
        catch(IOException ioe) {
            System.err.println(ioe.getMessage());
            return false;
        }
        document.close();
        System.out.println("Documento gerado");
		return true;
    }
	

}


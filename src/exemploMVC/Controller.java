package exemploMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
	  Model model;
	  View view;
	  public Controller(Model aModel, View aView){
	    model = aModel;
	    view = aView;
	    view.setBotaoBehavior(new BotaoBehavior());
	  }

	  class BotaoBehavior implements ActionListener{

	    @Override
	    public void actionPerformed(ActionEvent e) {

	      String textoNumero1 = view.getNum1();
	      String textoNumero2 = view.getNum2();

	      double numero1 = Double.parseDouble(textoNumero1);
	      double numero2 = Double.parseDouble(textoNumero2);
	      model.setNumeros(numero1, numero2);
	      model.cacula();
	      double resultado = model.getResultado();

	      String textResultado = String.valueOf(resultado);
	      view.setVisor(textResultado);
	    }

	  }

	}

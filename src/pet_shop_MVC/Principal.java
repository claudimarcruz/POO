package pet_shop_MVC;

import pet_shop_MVC.Controller.ControllerCao;
import pet_shop_MVC.Controller.ControllerExibe;
import pet_shop_MVC.Controller.ControllerGato;
import pet_shop_MVC.Controller.ControllerPassaro;
import pet_shop_MVC.Controller.ControllerProprietario;
import pet_shop_MVC.Controller.ControllerRelacao;
import pet_shop_MVC.View.ViewCao;
import pet_shop_MVC.View.ViewExibe;
import pet_shop_MVC.View.ViewGato;
import pet_shop_MVC.View.ViewPassaro;
import pet_shop_MVC.View.ViewProprietario;
import pet_shop_MVC.View.ViewRelacao;

public class Principal {
	public static void main(String[] args) {
		
		ViewProprietario vp = new ViewProprietario();
		new ControllerProprietario(vp);
		
		ViewCao vc = new ViewCao();
		new ControllerCao(vc);
		
		ViewGato vg = new ViewGato();
		new ControllerGato(vg);
		
		ViewPassaro vpas = new ViewPassaro();
		new ControllerPassaro(vpas);
		
		ViewRelacao vr= new ViewRelacao();
		new ControllerRelacao(vr);
		
		ViewExibe ve = new ViewExibe();
		new ControllerExibe(ve);
	}
}

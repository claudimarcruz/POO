package pet_shop_MVC_BD;

import pet_shop_MVC_BD.Controller.ControllerCao;
import pet_shop_MVC_BD.Controller.ControllerExibe;
import pet_shop_MVC_BD.Controller.ControllerGato;
import pet_shop_MVC_BD.Controller.ControllerPassaro;
import pet_shop_MVC_BD.Controller.ControllerProprietario;
import pet_shop_MVC_BD.Controller.ControllerRelacao;
import pet_shop_MVC_BD.View.ViewCao;
import pet_shop_MVC_BD.View.ViewExibe;
import pet_shop_MVC_BD.View.ViewGato;
import pet_shop_MVC_BD.View.ViewPassaro;
import pet_shop_MVC_BD.View.ViewProprietario;
import pet_shop_MVC_BD.View.ViewRelacao;

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

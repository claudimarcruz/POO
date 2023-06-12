package Trabalho_Etapa2_POO_ClaudimarCruz;

import java.awt.EventQueue;

import Trabalho_Etapa2_POO_ClaudimarCruz.Controller.BordaController;
import Trabalho_Etapa2_POO_ClaudimarCruz.Controller.ClienteController;
import Trabalho_Etapa2_POO_ClaudimarCruz.Controller.FuncionarioController;
import Trabalho_Etapa2_POO_ClaudimarCruz.Controller.LancheController;
import Trabalho_Etapa2_POO_ClaudimarCruz.Controller.MolhoController;
import Trabalho_Etapa2_POO_ClaudimarCruz.Controller.PedidoController;
import Trabalho_Etapa2_POO_ClaudimarCruz.Controller.PizzaController;
import Trabalho_Etapa2_POO_ClaudimarCruz.Controller.RecheioController;
import Trabalho_Etapa2_POO_ClaudimarCruz.Controller.SalgadoController;
import Trabalho_Etapa2_POO_ClaudimarCruz.Controller.TelaInicialController;
import Trabalho_Etapa2_POO_ClaudimarCruz.View.TelaPizza;
import Trabalho_Etapa2_POO_ClaudimarCruz.View.TelaRecheio;
import Trabalho_Etapa2_POO_ClaudimarCruz.View.TelaSalgado;
import Trabalho_Etapa2_POO_ClaudimarCruz.View.TelaBorda;
import Trabalho_Etapa2_POO_ClaudimarCruz.View.TelaCliente;
import Trabalho_Etapa2_POO_ClaudimarCruz.View.TelaFuncionario;
import Trabalho_Etapa2_POO_ClaudimarCruz.View.TelaInicial;
import Trabalho_Etapa2_POO_ClaudimarCruz.View.TelaLanche;
import Trabalho_Etapa2_POO_ClaudimarCruz.View.TelaMolho;
import Trabalho_Etapa2_POO_ClaudimarCruz.View.TelaPedido;


public class Principal {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial ti = new TelaInicial();
					TelaPizza tp = new TelaPizza();
					TelaLanche tl = new TelaLanche();
					TelaSalgado ts = new TelaSalgado();
					TelaFuncionario tf = new TelaFuncionario();
					TelaCliente tc = new TelaCliente();
					TelaPedido tped = new TelaPedido();
					TelaMolho tm = new TelaMolho();
					TelaRecheio tr = new TelaRecheio();
					TelaBorda tb = new TelaBorda(); 
					
					
					new TelaInicialController(ti, tp, tl, ts, tf, tc, tped, tm, tr, tb);
					new PizzaController(tp);
					new LancheController(tl);
					new SalgadoController(ts);
					new FuncionarioController(tf);
					new ClienteController(tc);
					new PedidoController(tped);
					new MolhoController(tm);
					new RecheioController(tr);
					new BordaController(tb);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

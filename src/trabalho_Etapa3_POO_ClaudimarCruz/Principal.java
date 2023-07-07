package trabalho_Etapa3_POO_ClaudimarCruz;

import java.awt.EventQueue;

import trabalho_Etapa3_POO_ClaudimarCruz.Controller.BordaController;
import trabalho_Etapa3_POO_ClaudimarCruz.Controller.ClienteController;
import trabalho_Etapa3_POO_ClaudimarCruz.Controller.FuncionarioController;
import trabalho_Etapa3_POO_ClaudimarCruz.Controller.LancheController;
import trabalho_Etapa3_POO_ClaudimarCruz.Controller.MolhoController;
import trabalho_Etapa3_POO_ClaudimarCruz.Controller.PedidoController;
import trabalho_Etapa3_POO_ClaudimarCruz.Controller.PizzaController;
import trabalho_Etapa3_POO_ClaudimarCruz.Controller.RecheioController;
import trabalho_Etapa3_POO_ClaudimarCruz.Controller.SalgadoController;
import trabalho_Etapa3_POO_ClaudimarCruz.Controller.TelaInicialController;
import trabalho_Etapa3_POO_ClaudimarCruz.View.TelaBorda;
import trabalho_Etapa3_POO_ClaudimarCruz.View.TelaCliente;
import trabalho_Etapa3_POO_ClaudimarCruz.View.TelaFuncionario;
import trabalho_Etapa3_POO_ClaudimarCruz.View.TelaInicial;
import trabalho_Etapa3_POO_ClaudimarCruz.View.TelaLanche;
import trabalho_Etapa3_POO_ClaudimarCruz.View.TelaMolho;
import trabalho_Etapa3_POO_ClaudimarCruz.View.TelaPagamento;
import trabalho_Etapa3_POO_ClaudimarCruz.View.TelaPedido;
import trabalho_Etapa3_POO_ClaudimarCruz.View.TelaPizza;
import trabalho_Etapa3_POO_ClaudimarCruz.View.TelaRecheio;
import trabalho_Etapa3_POO_ClaudimarCruz.View.TelaSalgado;


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
					TelaPagamento tpag = new TelaPagamento();
					TelaMolho tm = new TelaMolho();
					TelaRecheio tr = new TelaRecheio();
					TelaBorda tb = new TelaBorda(); 
					
					new TelaInicialController(ti, tp, tl, ts, tf, tc, tped, tm, tr, tb,tpag);
					new PizzaController(tp);
					new LancheController(tl);
					new SalgadoController(ts);
					new FuncionarioController(tf);
					new ClienteController(tc);
					new PedidoController(tped);
					new MolhoController(tm);
					new RecheioController(tr);
					new BordaController(tb);
					// pagamentoController ??????????
					 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

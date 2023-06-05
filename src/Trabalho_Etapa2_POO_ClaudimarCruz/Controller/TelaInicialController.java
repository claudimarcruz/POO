package Trabalho_Etapa2_POO_ClaudimarCruz.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class TelaInicialController {
	
	TelaInicial tela_inicial;
	TelaPizza tela_pizza;
	TelaLanche tela_lanche;
	TelaSalgado tela_salgado;
	TelaFuncionario tela_func;
	TelaCliente tela_cliente;
	TelaPedido tela_pedido;
	
	TelaMolho tela_molho;
	TelaRecheio tela_recheio;
	TelaBorda tela_borda;
	
	
	
	public TelaInicialController(TelaInicial _telaI, TelaPizza _tp, TelaLanche _tl,
			TelaSalgado _ts, TelaFuncionario _tf, TelaCliente _tc, TelaPedido _tped,
			TelaMolho _tm, TelaRecheio _tr, TelaBorda _tb) {
		
		tela_inicial = _telaI;
		tela_pizza = _tp;
		tela_lanche = _tl;
		tela_salgado = _ts;
		tela_func = _tf;
		tela_cliente = _tc;
		tela_pedido = _tped;
		tela_molho = _tm;
		tela_recheio = _tr;
		tela_borda = _tb;
		
		tela_inicial.adicionarEventoBotaoPizza(botaoPizza);
		tela_inicial.adicionarEventoBotaoLanche(botaoLanche);
		tela_inicial.adicionarEventoBotaoSalgado(botaoSalgado);
		tela_inicial.adicionarEventoBotaoFunc(botaoFunc);
		tela_inicial.adicionarEventoBotaoCliente(botaoCliente);
		tela_inicial.adicionarEventoBotaoPedido(botaoPedido);
		
		tela_pizza.adicionarEventoBotaoMolho(botaoMolho);
		tela_pizza.adicionarEventoBotaoRecheio(botaoRecheio);
		tela_pizza.adicionarEventoBotaoBorda(botaoBorda);
		
		
	}
	
	ActionListener botaoPizza = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			tela_pizza.setVisible(true);
			
		}
	};
	
	ActionListener botaoLanche = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			tela_lanche.setVisible(true);
			
		}
	};
	
	ActionListener botaoSalgado = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			tela_salgado.setVisible(true);
			
		}
	};
	
	ActionListener botaoFunc = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			tela_func.setVisible(true);
			
		}
	};
	
	ActionListener botaoCliente = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			tela_cliente.setVisible(true);
			
		}
	};
	
	ActionListener botaoPedido = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			tela_pedido.setVisible(true);
			
		}
	};
	
	ActionListener botaoMolho = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			tela_molho.setVisible(true);
			
		}
	};
	
	ActionListener botaoRecheio = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			tela_recheio.setVisible(true);
			
		}
	};
	
	ActionListener botaoBorda = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			tela_borda.setVisible(true);
			
		}
	};

}

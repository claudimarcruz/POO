package aula05_loja_informatica_Claudimar_Cruz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Principal {
	Float valor_desconto = 0.0f;
	
	public static Float valorTotal(Integer quantidade, Float valor_produto) {
		return quantidade * valor_produto ;
	}
	
	public static Float valorFinal(Float valorTotal, Float valorDesconto) {
		return valorTotal * valorDesconto ;
	}
	
	
	
	public static void main(String[] args)  throws ParseException {
		
		//clientes*************
		SimpleDateFormat formato =  new SimpleDateFormat("dd/MM/yyyy");
		List<Cadastro_clientes> clientes = new ArrayList<Cadastro_clientes>();
		
		List<String> tel_cliente1= new ArrayList<String>();
		tel_cliente1.add("0000-0000");
		tel_cliente1.add("1111-1111");
		Cadastro_clientes c1 = new Cadastro_clientes(1, "Cliente1", "000.000.000-00","cliente1@gmail", "Rua 1", formato.parse("10/05/1992"), tel_cliente1);
		//c1.setTelefone()
		clientes.add(c1);
		
		List<String> tel_cliente2= new ArrayList<String>();
		tel_cliente2.add("2222-2222");
		tel_cliente2.add("3333-3333");
		Cadastro_clientes c2 = new Cadastro_clientes(2, "Cliente2", "111.111.111-11","cliente2@gmail", "Rua 2", formato.parse("25/09/1997"), tel_cliente2);
		clientes.add(c2);
		
		List<String> tel_cliente3= new ArrayList<String>();
		tel_cliente3.add("4444-4444");
		tel_cliente3.add("5555-5555");
		Cadastro_clientes c3 = new Cadastro_clientes(3, "Cliente3", "222.222.222-22","cliente3@gmail", "Rua 3", formato.parse("17/02/2005"), tel_cliente3);
		clientes.add(c3);
		
		List<String> tel_cliente4= new ArrayList<String>();
		tel_cliente4.add("6666-6666");
		tel_cliente4.add("7777-777");
		Cadastro_clientes c4 = new Cadastro_clientes(4, "Cliente4", "333.333.333-33","cliente4@gmail", "Rua 4", formato.parse("01/11/2003"), tel_cliente4);
		clientes.add(c4);
		
		List<String> tel_cliente5= new ArrayList<String>();
		tel_cliente5.add("8888-8888");
		tel_cliente5.add("9999-9999");
		Cadastro_clientes c5 = new Cadastro_clientes(5, "Cliente5", "444.444.444-44","cliente5@gmail", "Rua 5", formato.parse("25/12/1999"), tel_cliente5);
		clientes.add(c5);
		
		//fornecedor*************
		List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
		
		Date data1 = formato.parse("19/06/1995");
		List<String> tel_fornecedor1 = new ArrayList<String>();
		tel_fornecedor1.add("0101-0101");
		tel_fornecedor1.add("0202-0202");
		
		Fornecedor f1 = new Fornecedor(1001, "Tech_new", "00.000.000/0000-00", "technew@gmail.com","Rua 6", data1, tel_fornecedor1);
		fornecedores.add(f1);
		
		Date data2 = formato.parse("26/07/2007");
		List<String> tel_fornecedor2 = new ArrayList<String>();
		tel_fornecedor2.add("0303-0303");
		tel_fornecedor2.add("0404-0404");
		Fornecedor f2 = new Fornecedor(1002, "Global", "00.000.000/0000-11", "global@gmail.com","Rua 7", data2, tel_fornecedor2);
		fornecedores.add(f2);
		
		/*
		
		for(Cadastro_clientes cliente : clientes) {
			System.out.println("id: " + cliente.getId());
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("CPF: " + cliente.getCpf());
			System.out.println("E_mail: " + cliente.getE_mail());
			System.out.println("Endereco: " + cliente.getEndereco());
			System.out.println("Data Nascimento: " + cliente.getData_nascimento());
			System.out.println("Telefone: " + cliente.getTelefone());
			System.out.println();
			
		}
		
		*/
		//produtos**************************
		
		List<Cadastro_produtos> produtos = new ArrayList<Cadastro_produtos>();
		Cadastro_produtos p1 = new Cadastro_produtos(501, "Mouse", 125.00f, f1.getId());
		produtos.add(p1);
		Cadastro_produtos p2 = new Cadastro_produtos(502, "Teclado Gamer", 300.00f, f2.getId());
		produtos.add(p2);
		Cadastro_produtos p3 = new Cadastro_produtos(503, "Fone de ouvido", 59.00f, f1.getId());
		produtos.add(p3);
		Cadastro_produtos p4 = new Cadastro_produtos(504, "Monitor", 890.00f, f1.getId());
		produtos.add(p4);
		Cadastro_produtos p5 = new Cadastro_produtos(505, "Cabo HDMI", 35.00f, f2.getId());
		produtos.add(p5);
		
		

		//funcionarios******************************************
	
		Date data3 = formato.parse("22/09/1974");
		Date dataAdmissao1 = formato.parse("22/02/1999");
		List<String> tel_funcionario1 = new ArrayList<String>();
		tel_funcionario1.add("0505-0505");
		tel_funcionario1.add("0606-0606");
		Funcionario fun1 = new Funcionario("Funcionario1", "555.555.555-55", "funcionario1@gamil.com", "Rua 8", data3, tel_funcionario1, dataAdmissao1, "Gerente de vendas");
		
		Date data4 = formato.parse("21/07/1972");
		Date dataAdmissao2 = formato.parse("22/02/2008");
		List<String> tel_funcionario2 = new ArrayList<String>();
		tel_funcionario2.add("0707-0707");
		tel_funcionario2.add("0808-0808");
		Funcionario fun2 = new Funcionario("Funcionario2", "666.666.666-66", "funcionario2@gamil.com", "Rua 9", data4, tel_funcionario2, dataAdmissao2, "Caixa");
		
		
		//vendedores***********************************************
		
		Date data5 = formato.parse("29/07/1982");
		Date dataAdmissao3 = formato.parse("02/07/1999");
		List<String> tel_vendedor1 = new ArrayList<String>();
		tel_vendedor1.add("0909-0909");
		tel_vendedor1.add("0100-0100");
		Vendedor vend1 = new Vendedor(201,"Vendedor1", "777.777.777-77", "vendedor1@gamil.com", "Rua 10", data5, tel_vendedor1, dataAdmissao3, "Vendedor");
		
		
		Date data6 = formato.parse("22/09/1981");
		Date dataAdmissao4 = formato.parse("22/02/2009");
		List<String> tel_vendedor2 = new ArrayList<String>();
		tel_vendedor2.add("0110-0110");
		tel_vendedor2.add("0120-0120");
		Vendedor vend2 = new Vendedor(202,"Vendedor2", "888.888.888-88", "vendedor2@gamil.com", "Rua 11", data6, tel_vendedor2, dataAdmissao4, "Vendedor");
		
		//venda1*************************************
		List<Venda> vendas = new ArrayList<Venda>();
		Float vendaTotal_1 = valorTotal(2, p1.getPrecoUnitario());
		
		Venda ve = new Venda(c1.getNome(),p1.getNome(),f1.getNome(),vend1.getNome(),vendaTotal_1,  valorFinal(vendaTotal_1, 0.90f)); //sobrecarga no método valorFinal
		vendas.add(ve);
		// temos polimorfismo no getNome() do vendedor na Venda criada acima, na classe vendedor não temos um getNome(), ele é buscado na da qual ela se estende
		
		//venda2*************************************
		Float vendaTotal_2 = valorTotal(1,  p2.getPrecoUnitario());
		ve = new Venda(c2.getNome(),p2.getNome(),f2.getNome(),vend2.getNome(),vendaTotal_2,  valorFinal(vendaTotal_2, 0.90f));
		vendas.add(ve);
		
		//venda3*************************************
		Float vendaTotal_3 = valorTotal(1,  p3.getPrecoUnitario());
		ve = new Venda(vend1.getNome(),p2.getNome(),f2.getNome(),vend2.getNome(),vendaTotal_3,  valorFinal(vendaTotal_3, 0.80f));
		vendas.add(ve);
		
		//venda3*************************************
		Float vendaTotal_4 = valorTotal(3,  p5.getPrecoUnitario());
		ve = new Venda(c5.getNome(),p5.getNome(),f2.getNome(),vend1.getNome(),vendaTotal_4,  valorFinal(vendaTotal_4, 0.90f));
		vendas.add(ve);
						
				
		
		System.out.println("Vendas:");
		for(Venda v: vendas) {
			System.out.println("Cliente: " + v.getNome_cliente());
			System.out.println("Produto: " + v.getNome_produto());
			System.out.println("Fornecedor: " + v.getNome_fornecedor());
			System.out.println("Vendedor: " + v.getNome_vendedor());
			System.out.println("Valor total: " + String.format("R$ %.2f",v.getValor_total()));
			System.out.println("Valor Final: " + String.format("R$ %.2f",v.getValor_final()));
			System.out.println("****************************");
		}
		
		
		/*
		Venda v0 = new Venda();
		vendas.add(v0);
		for(Cadastro_clientes c : clientes) {
			for(Venda v : vendas) {
				Float valor_final = 0.0f;
				if(c.getNome() == v.getNome_cliente()) {
					valor_final  = valorFinal(vendaTotal_1, 0.80f);
				}
			}
		}
		*/
		
	}
}

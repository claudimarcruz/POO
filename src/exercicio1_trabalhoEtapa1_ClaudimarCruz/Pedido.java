package exercicio1_trabalhoEtapa1_ClaudimarCruz;

import java.util.List;

public class Pedido {
	private Integer numeroPedido;
	private String nomeCliente;
	private Float taxaDeServico;
	private List<String> itensConsumidos;
	
	public Pedido() {
		super();
	}

	public Pedido(Integer numeroPedido, String nomeCliente, Float taxaDeServico, List<String> itensConsumidos) {
		super();
		this.numeroPedido = numeroPedido;
		this.nomeCliente = nomeCliente;
		this.taxaDeServico = taxaDeServico;
		this.itensConsumidos = itensConsumidos;
	}

	public Integer getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(Integer numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Float getTaxaDeServico() {
		return taxaDeServico;
	}

	public void setTaxaDeServico(Float taxaDeServico) {
		this.taxaDeServico = taxaDeServico;
	}

	public List<String> getItensConsumidos() {
		return itensConsumidos;
	}

	public void setItensConsumidos(List<String> itensConsumidos) {
		this.itensConsumidos = itensConsumidos;
	}
	
	public Float calcularTotal(Float taxaServico, Float valorConsumacao){
		
		return taxaServico + valorConsumacao;
	}
	
	public void mostrarFatura() {
		
	}
	
	public void gerarNotaFiscal() {
		
	}
}

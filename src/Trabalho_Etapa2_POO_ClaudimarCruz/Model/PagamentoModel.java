package Trabalho_Etapa2_POO_ClaudimarCruz.Model;

public class PagamentoModel {
	private PedidoModel pedido;
	private String tipo;
	private Double valorPagoDinheiro;
	
	public PagamentoModel() {
		super();
	}

	public PagamentoModel(PedidoModel pedido, String tipo, Double valorPagoDinheiro) {
		super();
		this.pedido = pedido;
		this.tipo = tipo;
		this.valorPagoDinheiro = valorPagoDinheiro;
	}

	public PedidoModel getPedido() {
		return pedido;
	}

	public void setPedido(PedidoModel pedido) {
		this.pedido = pedido;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getValorPagoDinheiro() {
		return valorPagoDinheiro;
	}

	public void setValorPagoDinheiro(Double valorPagoDinheiro) {
		this.valorPagoDinheiro = valorPagoDinheiro;
	}
	
	
	
}



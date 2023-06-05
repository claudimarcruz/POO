package Trabalho_Etapa2_POO_ClaudimarCruz.Model;

public class PedidoModel {
	private Integer idPedido;
	private String nomeCliente;
	private String nomeFuncionario;
	private Double taxaDeServico;
	private String itensConsumidos;
	private Integer quantidades;
	private Double valorTotal;
	
	public PedidoModel() {
		super();
	}

	public PedidoModel(Integer idPedido, String nomeCliente, String nomeFuncionario, Double taxaDeServico,
			String itensConsumidos, Integer quantidades, Double valorTotal) {
		super();
		this.idPedido = idPedido;
		this.nomeCliente = nomeCliente;
		this.nomeFuncionario = nomeFuncionario;
		this.taxaDeServico = taxaDeServico;
		this.itensConsumidos = itensConsumidos;
		this.quantidades = quantidades;
		this.valorTotal = valorTotal;
	}

	public Integer getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public Double getTaxaDeServico() {
		return taxaDeServico;
	}

	public void setTaxaDeServico(Double taxaDeServico) {
		this.taxaDeServico = taxaDeServico;
	}

	public String getItensConsumidos() {
		return itensConsumidos;
	}

	public void setItensConsumidos(String itensConsumidos) {
		this.itensConsumidos = itensConsumidos;
	}

	public Integer getQuantidades() {
		return quantidades;
	}

	public void setQuantidades(Integer quantidades) {
		this.quantidades = quantidades;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	
	
}
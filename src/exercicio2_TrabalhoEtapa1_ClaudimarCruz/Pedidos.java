package exercicio2_TrabalhoEtapa1_ClaudimarCruz;

import java.util.Date;
import java.util.List;

public class Pedidos {
	private Integer idPedido;
	private Integer quantidade;
	private String produtosPedidos;
	private Date dataEmissao;
	private Date horaEmissao;
	private Date dataFinalizacao;
	private Date horaFinalizacao;
	private Float preco;
	private Integer idCliente;
	
	public Pedidos() {
		super();
	}


	public Pedidos(Integer idPedido, Integer quantidade, String produtosPedidos, Date dataEmissao, Date horaEmissao,
			Date dataFinalizacao, Date horaFinalizacao, Float preco, Integer idCliente) {
		super();
		this.idPedido = idPedido;
		this.quantidade = quantidade;
		this.produtosPedidos = produtosPedidos;
		this.dataEmissao = dataEmissao;
		this.horaEmissao = horaEmissao;
		this.dataFinalizacao = dataFinalizacao;
		this.horaFinalizacao = horaFinalizacao;
		this.preco = preco;
		this.idCliente = idCliente;
	}


	public Integer getIdPedido() {
		return idPedido;
	}


	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}


	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	public String getProdutosPedidos() {
		return produtosPedidos;
	}


	public void setProdutosPedidos(String produtosPedidos) {
		this.produtosPedidos = produtosPedidos;
	}


	public Date getDataEmissao() {
		return dataEmissao;
	}


	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}


	public Date getHoraEmissao() {
		return horaEmissao;
	}


	public void setHoraEmissao(Date horaEmissao) {
		this.horaEmissao = horaEmissao;
	}


	public Date getDataFinalizacao() {
		return dataFinalizacao;
	}


	public void setDataFinalizacao(Date dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}


	public Date getHoraFinalizacao() {
		return horaFinalizacao;
	}


	public void setHoraFinalizacao(Date horaFinalizacao) {
		this.horaFinalizacao = horaFinalizacao;
	}


	public Float getPreco() {
		return preco;
	}


	public void setPreco(Float preco) {
		this.preco = preco;
	}


	public Integer getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	
	
	
}

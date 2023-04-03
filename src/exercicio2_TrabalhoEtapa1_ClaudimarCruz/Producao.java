package exercicio2_TrabalhoEtapa1_ClaudimarCruz;

public class Producao {
	private Integer numeroPedido;
	private String tipoMaterial;
	private String funcResponsavel;
	
	public Producao() {
		super();
	}

	public Producao(Integer numeroPedido, String tipoMaterial, String funcResponsavel) {
		super();
		this.numeroPedido = numeroPedido;
		this.tipoMaterial = tipoMaterial;
		this.funcResponsavel = funcResponsavel;
	}

	public Integer getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(Integer numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public String getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	public String getFuncResponsavel() {
		return funcResponsavel;
	}

	public void setFuncResponsavel(String funcResponsavel) {
		this.funcResponsavel = funcResponsavel;
	}
	
	
}

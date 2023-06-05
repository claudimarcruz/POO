package Interface_banco; //modelo

public class Conta {
	private int numConta;
	private String nomeDono;
	private double saldo;
	
	public Conta(){
		super();
	}

	public Conta(int numConta, String nomeDono, double saldo) {
		super();
		this.numConta = numConta;
		this.nomeDono = nomeDono;
		this.saldo = saldo;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}

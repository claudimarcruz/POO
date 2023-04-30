package Interface_banco;

public class Banco_A implements Banco{

	private Conta contaBanco_A;
	
	public Banco_A() {
		this.contaBanco_A = new Conta();
		this.contaBanco_A.setNomeDono("Banco A");
		this.contaBanco_A.setNumConta(0);
		this.contaBanco_A.setSaldo(0d);
	}
	@Override
	public void manutencaoConta(Conta conta) {
		boolean temSaldo = conta.getSaldo() >= 5.00;
		if(temSaldo) {
			double novoSaldo = conta.getSaldo() - 5.00;
			conta.setSaldo(novoSaldo);
			System.out.println("Operação realizada");
		}else {
			System.out.println("Saldo insuficiente");
		}
		
	}
	
	@Override
	public boolean saque(Conta conta, double valor) {
		if (conta.getSaldo() - valor >= -500) {
			double novoSaldo = conta.getSaldo() - valor;
			conta.setSaldo(novoSaldo);
			System.out.println("Saque realizado");
			return true;
		}else {
			System.out.println("Saldo insuficiente");
			return false;
		}
		
	}
	
	@Override
	public boolean deposito(Conta conta, double valor) {
		double novoSaldo = conta.getSaldo() + valor;
		conta.setSaldo(novoSaldo);
		System.out.println("Deposito realizado");
		return true;
	}
	
	@Override
	public void extrato(Conta conta) {
		System.out.println("Extrato Banco A");
		System.out.println("Nome: " + conta.getNomeDono());
		System.out.println("Numero: " + conta.getNumConta());
		System.out.println("Saldo: " + conta.getSaldo());
	}
	
	public boolean transferencia(Conta origem, Conta destino, double valor) {
		boolean podeTransferir = saque(origem, valor);
		
		if(podeTransferir) {
			deposito(destino, valor);
			System.out.println("Operação realizada");
			return true;
		}else {
			System.out.println("Erro na transferência");
			return false;
		}
	}
}

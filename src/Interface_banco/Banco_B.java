package Interface_banco;

public class Banco_B implements Banco{
	
private Conta contaBanco_B;
	
	public Banco_B() {
		this.contaBanco_B = new Conta();
		this.contaBanco_B.setNomeDono("Banco B");
		this.contaBanco_B.setNumConta(0);
		this.contaBanco_B.setSaldo(0d);
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
		double novoSaldo = conta.getSaldo() - valor;
		if (novoSaldo >= -500) {
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
		System.out.println("Extrato Banco B");
		System.out.println("Nome: " + conta.getNomeDono());
		System.out.println("Numero: " + conta.getNumConta());
		System.out.println("Saldo: " + conta.getSaldo());
	}
	
	public boolean transferencia(Conta origem, Conta destino, double valor) {
		
		if(valor <= 500) {
			boolean podeTransferir = saque(origem, valor);
			
			if(podeTransferir) {
				deposito(destino, valor);
				System.out.println("Operação realizada");
				return true;
			}else {
				System.out.println("Erro na transferência");
				return false;
			}
		}else {
			System.out.println("Transferêcia não efetuada");
			return false;
		}
		
		
		
	}
}
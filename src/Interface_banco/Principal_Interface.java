package Interface_banco;

public class Principal_Interface {
	public static void main(String[] args) {
		
		// banco A
		Banco_A bancoA = new Banco_A();
		Conta c1 = new Conta();
		Conta f = new Conta();

		// cliente 1
		c1.setNomeDono("Cliente 1");
		c1.setNumConta(1);
		c1.setSaldo(2000);
		
		bancoA.deposito(c1, 200);
		bancoA.saque(c1, 600);
		bancoA.transferencia(c1, f, 600);
		System.out.println(" ");
		bancoA.extrato(c1);
		System.out.println(" **************************** ");
		
		// banco B
		Banco_B bancoB = new Banco_B();
		Conta c2 = new Conta();
		
		// cliente 2
		c2.setNomeDono("Cliente 2");
		c2.setNumConta(1);
		c2.setSaldo(2000);
		
		bancoB.deposito(c2, 0);
		bancoB.saque(c2, 2501);
		//bancoB.transferencia(c2, f, 1500);
		System.out.println(" ");
		bancoB.extrato(c2);
	}
}

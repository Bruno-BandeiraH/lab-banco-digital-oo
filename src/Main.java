
public class Main {

	public static void main(String[] args) {
		
		Cliente bruno = new Cliente("Bruno");
	        Cliente henrique = new Cliente("Henrique");
	
	        Conta contaCorrente = new ContaCorrente(bruno);
	        contaCorrente.depositar(350.0);
	
	        Conta poupanca = new ContaPoupanca(henrique);
	
	        contaCorrente.transferir(100.0, poupanca);
	
	        contaCorrente.imprimirSaldo();
	        poupanca.imprimirSaldo();
	        System.out.println(bruno.getNome());
	}

}

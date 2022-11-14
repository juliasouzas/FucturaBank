package entidades;

public class ContaCorrente extends Contas {

	public ContaCorrente() {
		
	}

	public ContaCorrente(double numeroConta, String nomeTitular, double saldo) {
		super(numeroConta, nomeTitular, saldo);
	}
	

	@Override
	public void dadosConta() {
		
		System.out.println("                  Conta Corrente                               ");
		System.out.println("                  Nome do titular: " + getNomeTitular()         );
		System.out.println("                  Número da conta: " + getNumeroConta()         );
		System.out.println("                  Saldo da conta: R$ " + getSaldo()             );
		
	}

	@Override
	public void mostrarSaldo() {
		System.out.println("O saldo atual da Conta Corrente é de: R$ " + getSaldo());
	}

	@Override
	public void deposito(double quantia) {
		this.saldo = this.getSaldo() + quantia;
	}

	public void saque(double quantia) {
		if(getSaldo() >= quantia) {
			this.saldo = this.saldo - quantia;
			System.out.println("Saque realizado com sucesso!");
		} else {
			System.out.println("Saque não realizado, não há saldo suficiente na conta!");
		}
	}	
		
	public void aplicacao(double quantia, ContaPoupanca destino) {
			if (getSaldo() >= quantia) {
			this.saldo = this.getSaldo() - quantia;
			destino.deposito(quantia);
			System.out.println("Depósito realizado com sucesso!");
			} else {
				System.out.println("Saldo insuficiente!");
			}
		
	}
	
}	
	


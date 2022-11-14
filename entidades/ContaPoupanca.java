package entidades;

public class ContaPoupanca extends Contas {

	
	public ContaPoupanca(){
		
	}
	
	
	public ContaPoupanca(double numeroConta, String nomeTitular, double saldo) {
		super(numeroConta, nomeTitular, saldo);
		
	}


	@Override
	public void dadosConta() {
		
		System.out.println("                  Conta Poupança                               ");
		System.out.println("                  Nome do titular: " + getNomeTitular()         );
		System.out.println("                  Número da conta: " + getNumeroConta()         );
		System.out.println("                  Saldo da conta: R$ " + getSaldo()             );
		
	}


	@Override
	public void mostrarSaldo() {
		System.out.println("O saldo atual da Conta Poupança é de: R$ " + getSaldo());
		
	}


	@Override
	public void deposito(double quantia) {
		this.saldo = this.getSaldo() + quantia;
	}


	public void resgate(double quantia, ContaCorrente destino) {
		if (getSaldo() >= quantia) {
		this.saldo = this.getSaldo() - quantia;
		destino.deposito(quantia);
		System.out.println("Resgate realizado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
			
		}
	}
	
	
	
	
}

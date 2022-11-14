package entidades;

public abstract class Contas {

	private double numeroConta;
	private String nomeTitular;
	protected double saldo;
	
	public Contas() {
		
	}

	public Contas(double numeroConta, String nomeTitular, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}

	public double getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(double numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public abstract void dadosConta();
	
	public abstract void mostrarSaldo();
	
	public abstract void deposito(double quantia);
	
	
}

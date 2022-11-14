package aplicacao;

import java.util.Scanner;

import entidades.ContaCorrente;
import entidades.ContaPoupanca;
import entidades.Contas;

public class ProgramaBanco {

	public static void main(String[] args) {
		
		
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		Scanner sc = new Scanner(System.in);
		
		String nomeTitular; 
		int opcao, numeroConta;
		double depositoInicial = 0;
	
		do {
			System.out.println("*********************************************************");
			System.out.println("|           Bem-vindo(a) a FucturaBank!                 |");
			System.out.println("|           Selecione a opção desejada:                 |");
			System.out.println("|                                                       |");
			System.out.println("|           1 - Criar Conta                             |");
			System.out.println("|           2 - Acessar Dados da Conta                  |");
			System.out.println("|           3 - Acessar Saldo da Conta                  |");
			System.out.println("|           4 - Depositar Quantia                       |");
			System.out.println("|           5 - Sacar Quantia                           |");
			System.out.println("|           6 - Aplicar em Conta Poupança               |");
			System.out.println("|           7 - Resgatar da Conta Poupança              |");
			System.out.println("|           0 - Sair                                    |");
			System.out.println("|                                                       |");
			System.out.println("*********************************************************");
			
			
			opcao = sc.nextInt();
			
			
			
			switch (opcao) {
			case 1: System.out.println("Digite o nome do titular da conta: ");
			
			sc.nextLine();
			
			nomeTitular = sc.nextLine();
			
			
			System.out.println("Digite um número para conta: ");
			numeroConta = sc.nextInt();
			
			cc = new ContaCorrente(numeroConta, nomeTitular, 0.0);
			cp = new ContaPoupanca(numeroConta, nomeTitular, 0.0);
			
			if(depositoInicial <= 0) {
				System.out.println("Conta cadastra com sucesso!");
				System.out.println("Seu saldo é de R$: " + depositoInicial);
				System.out.println("Deseja realizar um depósito? 1- SIM / 2 - NÃO");
				int resposta = sc.nextInt();
				
				if(resposta == 1) {
					System.out.println("Digite o valor do depósito: ");
					cc.deposito(sc.nextDouble());
					cc.mostrarSaldo();
				} else {
					cc.dadosConta();
				}
				
			}
				break;
				
			
			case 2: 
				
				cc.dadosConta();
				System.out.println();
				cp.dadosConta();
				System.out.println();
				
				break;
				
			case 3: 
				
				cc.mostrarSaldo();
				cp.mostrarSaldo();
				
				break;
				
			case 4: 
				System.out.println("Digite a quantia desejada para realizar o depósito: ");
				cc.deposito(sc.nextDouble());
				System.out.println("Depósito realizado com sucesso!");
				cc.mostrarSaldo();
				
				break;
				
			case 5:
				if(cc.getSaldo() > 0) {
					cc.mostrarSaldo();
					System.out.println("Digite o valor do saque: ");
					cc.saque(sc.nextDouble());
					cc.mostrarSaldo();
				} else {
					System.out.println("Operação inválida, não há saldo suficiente!");
				}
				break;
				
			case 6: 
				if(cc.getSaldo() > 0) {
					cc.mostrarSaldo();
					System.out.println("Digite um valor para tranferir para Conta Poupança: ");
					cc.aplicacao(sc.nextDouble(), cp);
				} else {
					System.out.println("Operação inválida, não há saldo suficiente!");
				}
				
				break;
				
			case 7: 
				if(cc.getSaldo() > 0) {
					cp.mostrarSaldo();
					System.out.println("Digite o valor para transferir para Conta Corrente: ");
					cp.resgate(sc.nextDouble(), cc);
					
				} else {
					System.out.println("Operação inválida, não há conta cadastrada!");
				}
				
				break;
				
			default:
				if(opcao != 0) {
					System.out.println("Opção inválida!"); 
					System.out.println("Selecione outra opção ou digite '0' para encerrar o atendimento!");
				}
				
				break;
			}
			
			
		} while (opcao != 0); 
			
			System.out.println("Operação encerrada!");
		
		
		
		
	}

}

package desafio04;

import java.util.ArrayList;
import java.util.Scanner;

public class GestaoFuncionario {
	private ArrayList<Funcionario> funcionarios;
	private Scanner scanner;
	
	public GestaoFuncionario() {
		funcionarios = new ArrayList<>();
		scanner = new Scanner(System.in);
	}
	
	public void iniciar() {
		int opcao;
		
		do {
			System.out.println("\nMenu");
			System.out.println("1 -> Adicionar Gerente");
			System.out.println("2 -> Adicionar Desenvolvedor");
			System.out.println("3 -> Visualizar detalhes dos funcionários");
			System.out.println("4 -> Calcular salario");
			System.out.println("5 -> Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			case 1:
				adicionarGerente();
				break;
			case 2:
				adicionarDesenvolvedor();
				break;
			case 3:
				visualizarDetalhes();
				break;
			case 4:
				calcularSalario();
				break;
			case 5:
				System.out.println("Obrigado por usar o super sistema de gestão");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente");
				break;
			}
			
		}while(opcao != 5);
	}
	private void adicionarDesenvolvedor() {
		System.out.print("Digie o nome de um desenvolvedor: ");
		String nome = scanner.next();
		System.out.print("Digite o salario base do desenvolvedor: ");
		double salarioBase = scanner.nextDouble();
		System.out.print("Digite a hora extra do desenvolvedor: ");
		int horaExtra = scanner.nextInt();
		System.out.print("Digite o valor da hora extra do desenvolvedor: ");
		double valorHoraExtra = scanner.nextDouble();
		scanner.nextLine();
		
		Desenvolvedor dev = new Desenvolvedor(nome, salarioBase, horaExtra, valorHoraExtra);
		funcionarios.add(dev);
		System.out.println("desenvolvedor adicionado com sucesso!");
	}

	private void adicionarGerente() {
		System.out.print("Digie o nome de um gerente: ");
		String nome = scanner.next();
		System.out.print("Digite o salario base do gerente: ");
		double salarioBase = scanner.nextDouble();
		System.out.print("Digite o bonus do gerente: ");
		double bonus = scanner.nextDouble();
		scanner.nextLine();
		
		Gerente gerente = new Gerente(nome, salarioBase, bonus);
		funcionarios.add(gerente);
		System.out.println("gerente adicionado com sucesso!");
		
	}
	
	private void visualizarDetalhes() {
		if (funcionarios.isEmpty()) {
			System.out.println("Nenhum funcionario cadastrado!");
			return;
		}
		for(Funcionario funcionario : funcionarios) {
			funcionario.ExibirDetalhes();
		}
		
	}
	
	private void calcularSalario() {
		if (funcionarios.isEmpty()) {
			System.out.println("Nenhum funcionario cadastrado!");
			return;
		}
		for(Funcionario funcionario : funcionarios) {
			System.out.println("O salario do funionario " + funcionario.getNome() + ": " + funcionario.CalcularSalario());
		}
	}
}

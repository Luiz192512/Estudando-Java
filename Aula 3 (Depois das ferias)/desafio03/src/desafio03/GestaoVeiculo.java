package desafio03;

import java.util.ArrayList;
import java.util.Scanner;

public class GestaoVeiculo {
	private ArrayList<Veiculo> veiculos;
	private Scanner scanner;
	
	public GestaoVeiculo() {
		super();
		veiculos = new ArrayList<>();
		scanner = new Scanner(System.in);
	}
	public void iniciar() {
		int opcao;
		
		do {
			System.out.println("\nMenu");
			System.out.println("1 - Adicionar carro");
			System.out.println("2 - Asicionar moto");
			System.out.println("3 - Visualizar detalhes do veículo");
			System.out.println("4 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();
			
			switch (opcao) {
			case 1:
				adicionarCarro();
				break;
			case 2:
				adicionarMoto();
				break;
			case 3:
				visualizarDetalhesVeiculos();
				break;
			case 4:
				System.out.println("Muito obrigado por usar o sistema");
				break;
			default:
				System.out.println("Opção inválida! tente novamente");
				break;
			}
		}
		while(opcao != 4);
	}
		private void adicionarCarro() {
			System.out.print("Digite o nome do carro: ");
			String nome = scanner.next();
			System.out.print("Digite a marca do carro: ");
			String marca = scanner.next();
			System.out.print("Digite a modelo do carro: ");
			String modelo = scanner.next();
			System.out.print("Digite a cor do carro: ");
			String cor = scanner.next();
			System.out.print("Digite a quantidade de portas do carro: ");
			int porta = scanner.nextInt();
			System.out.print("Digite o ano do carro: ");
			int ano = scanner.nextInt();
			System.out.print("Digite a quilometragem do carro: ");
			int km = scanner.nextInt();
			
			Carro novoCarro = new Carro(nome, marca, modelo, cor, porta, ano, km);
			veiculos.add(novoCarro);
			
			System.out.println("Carro adicionado com sucesso!");
	}
		private void adicionarMoto() {
			System.out.print("Digite o nome da moto: ");
			String nome = scanner.next();
			System.out.print("Digite a marca da moto: ");
			String marca = scanner.next();
			System.out.print("Digite a modelo da moto: ");
			String modelo = scanner.next();
			System.out.print("Digite a cor da moto: ");
			String cor = scanner.next();
			System.out.print("Digite a cilindrada da moto: ");
			int cilindrada = scanner.nextInt();
			System.out.print("Digite o ano da moto: ");
			int ano = scanner.nextInt();
			System.out.print("Digite a quilometragem da moto: ");
			int km = scanner.nextInt();
			
			Moto novoMoto = new Moto(nome, marca, modelo, cor, cilindrada, ano, km);
			veiculos.add(novoMoto);
			
			System.out.println("Moto adicionado com sucesso!");
		}
		private void visualizarDetalhesVeiculos() {
			if(veiculos.isEmpty()) {
				System.out.println("Nenhum veículo disponével!");
				return;
			}
			for(Veiculo veiculo: veiculos) {
				System.out.println("---------------------");
				veiculo.exibirDetalhes();
				System.out.println("---------------------");
			}
		}
	
}

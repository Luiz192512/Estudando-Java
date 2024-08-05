package gerenciadorDeTarfeas;

import java.text.SimpleDateFormat;
import java.util.Scanner;


public class Main {
	public static final Scanner scanner = new Scanner(System.in);
	public static final SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
 
	public static void main(String[] args) {
		
		System.out.println("SEU GERENCIADOR DE TAREFAS!");
		System.out.println("--------------------------------");
		System.out.println("1- Cadastrarar tarefa");
		System.out.println("2- Acessar tarefa");
		System.out.println("3- Vizualisar todas as tarefas");
		System.out.println("4- adicionar item");
		System.out.println("5- Sair");
		 
		int opcao = scanner.nextInt();
		while (opcao != 5 ) {
			switch(opcao) {
			  case 1:
			    //Tarefa.cadastrar();
			    break;
			  case 2:
			   System.out.println("Digite o número de prioridade da tarefa que deseja acessar:");
			  scanner.next();
			  
			    break;
			  case 3:
				  //Tarefas.exibir();
				  break;
			  case 4:
				  System.out.println("Digite o número de prioridade da tarefa que deseja ter um item adicionado:");
				  scanner.next();
				  break;
			  case 5 :
				  System.out.println("Obrigado pela Preferencia");
			  default:
			    System.out.println("ERRO(digite outra opção)");
			}
		}
	}
}
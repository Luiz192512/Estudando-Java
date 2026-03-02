package aula2;

public class Condicional {
	public static void main(String[] args) {
		/*
		int num1 = 2;
		int num2 = 18;
		
		if(num1 > num2) {
			System.out.println("sim");
		}else {
			System.out.println("não");
		}
		*/
		
		int tempo = 18;
		if(tempo < 12) {
			System.out.println("Bom dia");
		}else if (tempo <= 18) {
			System.out.println("boa tarde");
		}else {
			System.out.println("Boa noite");
		}
	}
}

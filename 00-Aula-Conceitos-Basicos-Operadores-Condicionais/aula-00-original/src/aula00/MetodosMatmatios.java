package aula2;


public class MetodosMatmatios {
	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 17;
		
		int maiorNumero = Math.max(num1, num2);
		int menorNumero = Math.min(num1, num2);
		double raiz = Math.sqrt(144);
		
		System.out.println("O maior numero é: " + maiorNumero);
		System.out.println("O menor numero é: " + menorNumero);
		System.out.println("A raiz é: " + raiz);
	}
}

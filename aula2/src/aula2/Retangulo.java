package aula2;
import java.util.Scanner;  // Import the Scanner class

public class Retangulo {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); 
		
		System.out.print("Insira a Base:");
		float base = myObj.nextInt();
		System.out.print("Insira a Altura:");
		float altura = myObj.nextInt();
		float area;
		
		boolean a = true;
		
		area = base * altura;
		
		
		
		System.out.println("A base é: " + base);
		System.out.println("A altura é: " + altura);
		System.out.println("A área do retangulo é: " + area);
		
		System.out.println(!a);
	}
}

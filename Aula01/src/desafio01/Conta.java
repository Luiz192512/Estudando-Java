package desafio01;

import java.util.Random;

public class Conta {
	private String nome;
	private Double saldo;
	private int conta;
	private int saques;
	
	public Conta(String nome, Double saldoInicial) {
		this.nome = nome;
		this.saldo = saldoInicial;
		Random numero = new Random();
		this.conta = 1 + numero.nextInt(999);//Criando o numer da conta
		this.saques = 0;
	}
	
	public void extrato() {
		System.out.println("Nome: "+ nome);
		System.out.println("Número da conta: "+ conta);
		System.out.println("Saldo: R$ "+ saldo);
		System.out.println("Saques realizados hoje; "+ saques);
	}
	
	public void sacar(double valor) {
		if(valor <= 0) {
			System.out.println("O valor do saque deve ser um número inteiro positivo");
		}
		if(valor > saldo) {
			System.out.println("Saldo insuficiente para realizar o saque");
		}
		int valorInicial = (int) valor;
		
		saldo -= valor;
		
		saques++;
		
		int notas100 = valorInicial / 100;
		valorInicial %= 100;
		
		int notas50 = valorInicial / 50;
		valorInicial %= 50;
		
		int notas20 = valorInicial / 20;
		valorInicial %= 20;
		
		int notas10 = valorInicial / 10;
		valorInicial %= 10;
		
		int notas5 = valorInicial / 5;
		valorInicial %= 5;
		
		int notas2 = valorInicial / 2;
		valorInicial %= 2;
		System.out.println("Valor do saque: R$ "+ valor);
		System.out.println("Notas de R$ 100: " + notas100);
		System.out.println("Notas de R$ 50: " + notas50);
		System.out.println("Notas de R$ 20: " + notas20);
		System.out.println("Notas de R$ 10: " + notas10);
		System.out.println("Notas de R$ 5: " + notas5);
		System.out.println("Notas de R$ 2: " + notas2);
		


		
	}
	
	public void depositar(double valor) {
		if(valor <= 0) {
			System.out.println("O valor do depósito deve ser um número inteiro positivo");
		}
		int valorInicial = (int) valor;
		
		saldo += valor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public int getSaques() {
		return saques;
	}
	public void setSaques(int saques) {
		this.saques = saques;
	}
	
	
}

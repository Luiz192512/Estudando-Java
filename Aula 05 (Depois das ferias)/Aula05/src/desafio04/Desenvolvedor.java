package desafio04;

public class Desenvolvedor extends Funcionario {
	private int horasExtras;
	private double valorHoraExtra;
	
	public Desenvolvedor(String nome, double salarioBase, int horasExtras, double valorHoraExtra) {
		super(nome, salarioBase);
		this.horasExtras = horasExtras;
		this.valorHoraExtra = valorHoraExtra;
	}

	@Override
	public double CalcularSalario() {
		return getSalarioBase() + (horasExtras * valorHoraExtra);
	}

	@Override
	public void ExibirDetalhes() {
		super.ExibirDetalhes();
		System.out.println("Horas Extras: "+ horasExtras);
		System.out.println("Valor da hora extra: "+ valorHoraExtra);
		System.out.println("Salario Total: "+ CalcularSalario());
	}
	
	
}

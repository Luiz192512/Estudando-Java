package desafio04;

public class Gerente extends Funcionario{
	
	private double bonus;

	public Gerente(String nome, double salarioBase, double bonus) {
		super(nome, salarioBase);
		this.bonus = bonus;
	}

	@Override
	public double CalcularSalario() {
		return getSalarioBase()+bonus;
	}

	@Override
	public void ExibirDetalhes() {
		super.ExibirDetalhes();
		System.out.println("Bônus: "+ bonus);
		System.out.println("Salario Total: "+ CalcularSalario());
		System.out.println("-----------------");
	}
	
	
}

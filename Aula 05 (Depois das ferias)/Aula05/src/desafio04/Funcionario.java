package desafio04;

/*Classes abstratas são declaradas com o proposito de representar
 * uma especie de esqueleto */

public abstract class Funcionario {
	private String nome;
	private double salarioBase;
	
	public abstract double CalcularSalario();
	
	public void ExibirDetalhes() {
		System.out.println("Nome: "+ nome);
		System.out.println("Salário: "+ salarioBase);

	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	
	public Funcionario (String nome, double salarioBase) {
		this.nome = nome;
		this.salarioBase = salarioBase;
	}
	
}

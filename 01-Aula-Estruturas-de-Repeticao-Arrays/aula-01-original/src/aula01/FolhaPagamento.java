package aula3;

public class FolhaPagamento {

	double valorHora;
	double horasTrabalhadas;
	
	public FolhaPagamento(double valorHora, double horasTrabalhadas) {
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
		
	public double calcularSalarioBruto() {
		return this.valorHora * this.horasTrabalhadas;
	}
	
	public double calcularFolha(double salarioBruto, double ir, double inss, double sindicato, double fgts) {
		double descontos = ir + inss + sindicato;
		return salarioBruto + fgts - descontos ;
	}
}

package aula2;

public class Funcionario {
    private double valorHora;
    private int horasTrabalhadas;

    public Funcionario(double valorHora, int horasTrabalhadas) {
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularSalarioBruto() {
        return valorHora * horasTrabalhadas;
    }

    public double calcularDescontoIR() {
        double salarioBruto = calcularSalarioBruto();
        if (salarioBruto <= 900) {
            return 0;
        } else if (salarioBruto <= 1500) {
            return salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            return salarioBruto * 0.1;
        } else {
            return salarioBruto * 0.2;
        }
    }

    public double calcularDescontoSindicato() {
        return calcularSalarioBruto() * 0.03;
    }

    public double calcularFGTS() {
        return calcularSalarioBruto() * 0.11;
    }

    public double calcularSalarioLiquido() {
        double totalDescontos = calcularDescontoIR() + calcularDescontoSindicato();
        return calcularSalarioBruto() - totalDescontos;
    }
}

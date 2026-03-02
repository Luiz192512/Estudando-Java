package aula2;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da hora: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Informe a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;

        double ir = calcularIR(salarioBruto);
        double inss = salarioBruto * 0.1;
        double fgts = salarioBruto * 0.11;

        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: R$ " + String.format("%.2f", salarioBruto));
        System.out.println("(-) IR: R$ " + String.format("%.2f", ir));
        System.out.println("(-) INSS: R$ " + String.format("%.2f", inss));
        System.out.println("FGTS (11%): R$ " + String.format("%.2f", fgts));
        System.out.println("Total de descontos: R$ " + String.format("%.2f", totalDescontos));
        System.out.println("Salário Líquido: R$ " + String.format("%.2f", salarioLiquido));
    }

    private static double calcularIR(double salarioBruto) {
        if (salarioBruto <= 900) {
            return 0;
        } else if (salarioBruto <= 1500) {
            return salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            return salarioBruto * 0.10;
        } else {
            return salarioBruto * 0.20;
        }
    }
}
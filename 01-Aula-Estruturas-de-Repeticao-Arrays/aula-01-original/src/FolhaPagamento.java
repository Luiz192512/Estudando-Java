package aula2;

import java.util.Scanner;

public class FolhaPagamento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da sua hora: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        Funcionario funcionario = new Funcionario(valorHora, horasTrabalhadas);

        double salarioBruto = funcionario.calcularSalarioBruto();
        double descontoIR = funcionario.calcularDescontoIR();
        double descontoSindicato = funcionario.calcularDescontoSindicato();
        double fgts = funcionario.calcularFGTS();
        double totalDescontos = descontoIR + descontoSindicato;
        double salarioLiquido = funcionario.calcularSalarioLiquido();

        System.out.println("Salário Bruto: R$ " + String.format("%.2f", salarioBruto));
        System.out.println("(-) IR (): R$ " + String.format("%.2f", descontoIR));
        System.out.println("(-) INSS (3%): R$ " + String.format("%.2f", descontoSindicato));
        System.out.println("FGTS (11%): R$ " + String.format("%.2f", fgts));
        System.out.println("Total de descontos: R$ " + String.format("%.2f", totalDescontos));
        System.out.println("Salário Líquido: R$ " + String.format("%.2f", salarioLiquido));
    }
}

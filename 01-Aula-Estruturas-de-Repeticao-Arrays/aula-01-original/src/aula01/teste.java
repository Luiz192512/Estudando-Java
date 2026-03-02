package aula3;

import java.text.DecimalFormat;

public class teste {

	public static void main(String[] args) {
		FolhaPagamento folhaLuiz = new FolhaPagamento(5, 220);
		Imposto imposto = new Imposto ();
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		double salarioBruto = folhaLuiz.calcularSalarioBruto();
		double ir = imposto.calcularIR(salarioBruto);
		double inss = imposto.calcularINSS(salarioBruto);
		double sindical = imposto.calcularSindical(salarioBruto);
		double fgts = imposto.calcularFGTS(salarioBruto);
		
		double salarioLiquido = folhaLuiz.calcularFolha(salarioBruto, ir, inss, sindical, fgts);
		
		System.out.println("Slaário Bruto:\s" + formatador.format(salarioBruto));
		System.out.println("(-) IR (5%):\s" + formatador.format(ir));
		System.out.println("(-) INSS (10%):\s" + formatador.format(inss));
		System.out.println("FGTS (11%):\s" + formatador.format(fgts));
		System.out.println("Total de descontos:\s" + formatador.format((ir + inss + sindical)));
		System.out.println("Salario Liquido:\s" + formatador.format(salarioLiquido));
		
		
		
		
	}

}

package aula3;

public class Imposto {
	final double aliquotaIR [] = {0, 0.05, 0.1, 0.2};
	final double aliquotaINSS = 0.1;
	final double aliquotaSindical = 0.03;
	final double aliquotaFGTS = 0.11;
	
	public double calcularIR(double salarioBruto) {
		if (salarioBruto >= 2500) {
			return salarioBruto * aliquotaIR[3];
		}
		else if (salarioBruto >= 1500) {
			return salarioBruto * aliquotaIR[2];
		}
		else if (salarioBruto >= 900) {
			return salarioBruto * aliquotaIR[1];
		}
		else {
			return salarioBruto;
		}
	}
	
	public double calcularINSS(double salarioBruto) {
		return salarioBruto * aliquotaINSS;
	}
	
	public double calcularSindical(double salarioBruto) {
		return salarioBruto * aliquotaSindical;
	}
	
	public double calcularFGTS(double salarioBruto) {
		return salarioBruto * aliquotaFGTS;
	}
	
	public static void main(String[] args) {
		

	}

}

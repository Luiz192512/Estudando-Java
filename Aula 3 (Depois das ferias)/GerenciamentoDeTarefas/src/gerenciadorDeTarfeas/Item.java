package gerenciadorDeTarfeas;

import java.util.Date;

public class Item {
	private double percentual;
	private String descricao;
	private Date dataExecucao;

	public Item(double percentual, String descricao, Date dataExecucao) {
		this.percentual = percentual;
		this.descricao = descricao;
		this.dataExecucao = dataExecucao;
	}
	
	public Item(double percentual, String descricao) {
		this.percentual = percentual;
		this.descricao = descricao;
		this.dataExecucao = null;
	}
	
	public double getPercentual() {
		return percentual;
	}
	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataExecucao() {
		return dataExecucao;
	}
	public void setDataExecucao(Date dataExecucao) {
		this.dataExecucao = dataExecucao;
	}

	public static Item cadastrar() throws Exception {
		try {
			double percentual;
			String descricao;
			String dataExecucaoString;
			
			System.out.println("|--------------------------|");
			System.out.println("|---- CADASTRANDO ITEM ----|");
			System.out.println("|--------------------------|");
			System.out.print("| Percentual......: ");
			percentual = Main.scanner.nextDouble();
			System.out.print("| Descrição.......: ");
			descricao = Main.scanner.next();
			System.out.print("| Data de execução: ");
			dataExecucaoString = Main.scanner.next();
			System.out.println("|--------------------------|");
			
			if (dataExecucaoString == null || dataExecucaoString.trim().isEmpty()) {
				return new Item(percentual, descricao);
			}
			
			return new Item(percentual, descricao, Main.formatoData.parse(dataExecucaoString));
		} catch(Exception e) {
			throw new Exception("Erro ao cadastrar item: " + e.getMessage());
		}
	}
}

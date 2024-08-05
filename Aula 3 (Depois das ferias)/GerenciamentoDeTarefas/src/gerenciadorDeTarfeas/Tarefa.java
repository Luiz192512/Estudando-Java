package gerenciadorDeTarfeas;

import java.util.ArrayList;
import java.util.Date;

public class Tarefa {
	private String nome;
	private int numeroPrioridade;
	private String descricao;
	private Date dataLimiteExecucao;
	private int percentualConclusao;
	private StatusTarefa status;
	private ArrayList<Item> itens;
	
	public Tarefa(String nome, int prioridade, String descricao, Date limiteExecucao, int percentualConclusao,  StatusTarefa statusTarefa) {
		this.nome = nome;
		this.numeroPrioridade = prioridade;
		this.descricao = descricao;
		this.dataLimiteExecucao = limiteExecucao;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroPrioridade() {
		return numeroPrioridade;
	}

	public void setNumeroPrioridade(int numeroPrioridade) {
		this.numeroPrioridade = numeroPrioridade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataLimiteExecucao() {
		return dataLimiteExecucao;
	}

	public void setDataLimiteExecucao(Date dataLimiteExecucao) {
		this.dataLimiteExecucao = dataLimiteExecucao;
	}

	public int getPercentualConclusao() {
		return percentualConclusao;
	}

	public void setPercentualConclusao(int percentualConclusao) {
		this.percentualConclusao = percentualConclusao;
	}

	public StatusTarefa getStatus() {
		return status;
	}

	public void setStatus(StatusTarefa status) {
		this.status = status;
	}
	
	public static Tarefa cadastrar() throws Exception {
		try {
			String nome;
			int numeroPrioridade;
			String descricao;
			String dataLimiteExecucaoString;
			int percentualConclusao;
			String statusString;
			
			System.out.println("|--------------------------|");
			System.out.println("|----CADASTRANDO TAREFA----|");
			System.out.println("|--------------------------|");
			System.out.print("| Percentual......: ");
			nome = Main.scanner.next();
			System.out.print("| Percentual......: ");
			numeroPrioridade = Main.scanner.nextInt();
			System.out.print("| Percentual......: ");
			descricao = Main.scanner.next();
			System.out.print("| Percentual......: ");
			dataLimiteExecucaoString = Main.scanner.next();
			System.out.print("| Percentual......: ");
			percentualConclusao = Main.scanner.nextInt();
			System.out.print("| Percentual......: ");
			statusString = Main.scanner.next();
			System.out.println("|--------------------------|");
			
			return new Tarefa(nome, numeroPrioridade, descricao, Main.formatoData.parse(dataLimiteExecucaoString), percentualConclusao, StatusTarefa.valueOf(statusString));
		} catch(Exception e) {
			throw new Exception("Erro ao cadastrar tarefa");
		}
	}


	public ArrayList<Item> getItens() {
		return itens;
	}


	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}
}
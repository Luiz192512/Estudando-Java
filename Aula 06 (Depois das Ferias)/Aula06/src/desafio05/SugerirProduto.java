package desafio05;

import java.util.ArrayList;
import java.util.List;

public class SugerirProduto {
	private int id;
	private List<Produto> listaDeProdutos;
	private String criterios;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Produto> getListaDeProdutos() {
		return listaDeProdutos;
	}
	public void setListaDeProdutos(List<Produto> listaDeProdutos) {
		this.listaDeProdutos = listaDeProdutos;
	}
	public String getCriterios() {
		return criterios;
	}
	public void setCriterios(String criterios) {
		this.criterios = criterios;
	}
	public List<Produto> sugerir() {
	return new ArrayList<>();
	}
}

package desafio05;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private double preco;
	private String categoria;
	private double avaliacao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}
	public void cadastrar() {
	}
	public List<Produto> listar() {
	return new ArrayList<>();
	}
	public List<Produto> filtrar(String categoria) {
	return new ArrayList<>();
	}
	public void avaliar(double avaliacao) {
	this.avaliacao = avaliacao;
	}
}

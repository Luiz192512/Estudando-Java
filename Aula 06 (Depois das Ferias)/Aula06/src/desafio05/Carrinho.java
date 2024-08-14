package desafio05;

import java.util.Date;
import java.util.List;

public class Carrinho {
	private int id;
	private Usuario cliente;
	private List<Produto> listaDeProdutos;
	private double total;
	private Date data;
	private Endereco enderecoDeEntrega;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Usuario getCliente() {
		return cliente;
	}
	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}
	public List<Produto> getListaDeProdutos() {
		return listaDeProdutos;
	}
	public void setListaDeProdutos(List<Produto> listaDeProdutos) {
		this.listaDeProdutos = listaDeProdutos;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Endereco getEnderecoDeEntrega() {
		return enderecoDeEntrega;
	}
	public void setEnderecoDeEntrega(Endereco enderecoDeEntrega) {
		this.enderecoDeEntrega = enderecoDeEntrega;
	}
	public void adicionarProduto(Produto p) {
	listaDeProdutos.add(p);
	calcularTotal();
	}
	public void removerProduto(Produto p) {
	listaDeProdutos.remove(p);
	calcularTotal();
	}
	public void calcularTotal() {
	total = 0;
	for (Produto p : listaDeProdutos) {
	total += p.getPreco();
	}
	}
}

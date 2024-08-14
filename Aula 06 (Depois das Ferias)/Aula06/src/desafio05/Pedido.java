package desafio05;

import java.util.Date;
import java.util.List;

public class Pedido {
	private int id;
	private Usuario usuario;
	private List<Produto> listaDeProdutos;
	private String status;
	private Date data;
	private Endereco enderecoDeEntrega;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Produto> getListaDeProdutos() {
		return listaDeProdutos;
	}
	public void setListaDeProdutos(List<Produto> listaDeProdutos) {
		this.listaDeProdutos = listaDeProdutos;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public void criar() {
	}
	public void cancelar() {
	}
	public void confirmarPagamento() {
	}
	public void gerarNotaFiscal() {
	}
	public String gerarCodigoRastreamento() {
	return "Código aleatorio";
	}
}

package desafio05;

public class Pagamento {
	private int id;
	private Pedido pedido;
	private String metodoPagamento;
	private double valor;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public String getMetodoPagamento() {
		return metodoPagamento;
	}
	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void escolherMetodo(String metodo) {
	this.metodoPagamento = metodo;
	}
	public void processar() {
	}
	public void confirmar() {
	this.status = "Confirmado";
	}

}

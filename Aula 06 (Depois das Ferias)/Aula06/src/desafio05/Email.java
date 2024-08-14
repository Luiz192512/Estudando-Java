package desafio05;

public class Email {
	private int id;
	private String Destinatario;
	private String Assunto;
	private String Corpo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDestinatario() {
		return Destinatario;
	}
	public void setDestinatario(String destinatario) {
		Destinatario = destinatario;
	}
	public String getAssunto() {
		return Assunto;
	}
	public void setAssunto(String assunto) {
		Assunto = assunto;
	}
	public String getCorpo() {
		return Corpo;
	}
	public void setCorpo(String corpo) {
		Corpo = corpo;
	}
	
	public void enviar() {
		
	}
}

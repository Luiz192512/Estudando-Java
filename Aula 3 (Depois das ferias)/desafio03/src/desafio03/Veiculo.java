package desafio03;

public class Veiculo {
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getKm() {
		return km;
	}
	public void setQuilometragem(int km) {
		this.km = km;
	}
	public void exibirDetalhes() {
		System.out.println("Nome: " + nome);
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: "+ modelo);
		System.out.println("Cor: "+ cor);
		System.out.println("Ano: "+ ano);
		System.out.println("Km: "+km);
		
	}
	public Veiculo(String nome, String marca, String modelo, String cor, int ano, int km) {
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.km = km;
	}
	private int ano;
	private String cor;
	private String marca;
	private String nome;
	private String modelo;
	private int km;
	
	
	
}

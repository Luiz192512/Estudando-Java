package desafio03;

public class Carro extends Veiculo{
	private int porta;

	public Carro(String nome, String marca, String modelo, String cor, int porta, int ano, int km) {
		super(nome, marca, modelo, cor, ano, km);
		this.porta = porta;
	}
	
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Portas: "+ porta);
	}



	public int getPorta() {
		return porta;
	}

	public void setPorta(int porta) {
		this.porta = porta;
	}



}

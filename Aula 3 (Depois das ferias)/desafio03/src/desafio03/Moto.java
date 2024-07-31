package desafio03;

public class Moto extends Veiculo{
	private int cilindradas;

	public Moto(String nome, String marca, String modelo, String cor, int cilindradas, int ano, int quilometragem) {
		super(nome, marca, modelo, cor, ano, quilometragem);
		this.cilindradas = cilindradas;
	}
	

	@Override
	public void exibirDetalhes() {
		// TODO Auto-generated method stub
		super.exibirDetalhes();
		System.out.println("Cilindradas: " + cilindradas);
	}


	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}


	

}

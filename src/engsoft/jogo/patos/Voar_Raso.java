package engsoft.jogo.patos;

public class Voar_Raso implements Padrao_Voaveis {
	
	private double velocidade;
	
	public Voar_Raso() {
		velocidade = 100;
	}

	@Override
	public String voar() {
		return "Voando perto do chão. Velocidade: "
				+ getVelocidade();
	}

	@Override
	public double getVelocidade() {
		return velocidade;
	}

}

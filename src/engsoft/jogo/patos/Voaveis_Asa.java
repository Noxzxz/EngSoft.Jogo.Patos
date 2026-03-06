package engsoft.jogo.patos;

public class Voaveis_Asa implements Padrao_Voaveis {

	private double velocidade;

	public Voaveis_Asa() {
		velocidade = 10;
	}

	public String voar() {
		return "Voando como um pássaro que voa. Velocidade: "
				+ getVelocidade();
	}

	public double getVelocidade() {
		return velocidade;
	}

}

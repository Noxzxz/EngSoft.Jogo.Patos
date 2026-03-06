package engsoft.jogo.patos;
// 1.2 Herança
//Herança, Sub classe devido ao extends. Pato bravo herda de pato e implmenta o metodo grasnar de padrão grasnar que {interface}
//1.4 Classe Concreta
//classe concreta, pode ser instaciada e implementa um metodo abstrato
public class Pato_Bravo extends Pato implements  Padrao_Grasnar{


	public Pato_Bravo()	
	{
		setComportamento(new Voaveis_Asa());		
	}

    // 1.3 Polimorfismo
    //Polimorfismo, sobrescrevendo o mostrar
    // 2.1.2 Verificação de assinatura de método
    //O compilador verifica se o método sobrescrito possui a mesma assinatura do método abstrato da superclasse.
    public String mostrar() {
		return "Eu sou o Pato Bravo.";
	}

	public String grasnar() {
		return "Que-Que. Grrrrrrrrr.";
	}

}

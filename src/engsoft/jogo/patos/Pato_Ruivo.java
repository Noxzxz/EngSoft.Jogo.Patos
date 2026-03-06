package engsoft.jogo.patos;
// 2.1.3 Obrigatoriedade de implementar métodos da interface
//Obrigatoriedade de Implementar Metodos,   implementação de grasnar por meio do implements padrao_grasnar
public class Pato_Ruivo extends Pato implements Padrao_Grasnar{

    // 3.1 Construtor
    //Construtor, metodo especial para a criação do objeto Pato_ruivo
	public Pato_Ruivo()
	{
		setComportamento(new Voaveis_Asa());		
	}
	
	public String mostrar() {
		return "Eu sou o Pato Ruivo." ;
	}

	public String grasnar() {
		// TODO Auto-generated method stub
		return 	"Que-Que.";
	
	}

}

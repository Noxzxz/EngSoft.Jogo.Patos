package engsoft.jogo.patos;
// 1.1 Classe abstrata
//conceito de classes - classe abstrata, não pode ser instanciada diretamente
public abstract class Pato {
    // 1.7 Composição
	//Composição, modificador de acesso, composição ocorre quando uma classe tem um objeto de outra classe com atributo
    // 1.9 Programação voltada a interface
    //Programação voltada a Interface, utilizando o tipo de interface padrão voaveis em vez de criar uma classe concreta, permitindo trocar a implementação sem alterar a classe pato inteira
    //3.2 Duas variaveis de Instancia
    protected Padrao_Voaveis comportamento_pato;
    protected Padrao_Pulaveis comportamento_pulaveis;

    // 1.5 Método abstrato
    //método abstrato sem implementação, o que define a classe como abstrata,
    // define um tipo de comportamento que cada pato deve ter
    abstract String mostrar();
	
	public String nadar()
	{
		return "Pato Nadando.";		
	}	
	
	public void setComportamento(Padrao_Voaveis padrao )
	{
		comportamento_pato = padrao;		
	}

    public void setComportamento(Padrao_Pulaveis padrao ){
        comportamento_pulaveis = padrao;
    }

    // 1.8 Delegação
    //Delegação, ocorre quando uma classe delega a execução de uma tarefa para
    // outro objeto
	public String comportamento_pato()
	{		
		return comportamento_pato.voar();		
	}

    public String comportamento_pulaveis(){ return comportamento_pulaveis.Pular();}
}

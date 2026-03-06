package engsoft.jogo.patos;

public class Main {

	public static void main(String[] args) {
        // 2.1.1 Checagem de tipos
        // 3.3 Uso do operador new
        // uso do operador new para instanciar na memoria o objeto
        // 3.1.3 O que faz o new?
        // Cria um objeto na memória.
        // 3.1.4 O que acontece na memória?
        // O objeto é alocado na Heap. A variável recebe uma referência para esse endereço.
        Pato pt = new Pato_Ruivo();


        // 3.1.5 Diferença
        // a) Pato pt
        // Apenas declaração de variável de referência. Nenhum objeto foi criado ainda.

        // b) Pato pt = new Pato_Ruivo()
        // Declara a variável e cria o objeto na memória. Agora pt aponta para um objeto válido.


        // 2.2.1 Polimorfismo dinâmic
        //polimorfismo dinamico, permite que um metodo sobesrcrito seja chamado em tempo de execução, chamando diretamento o objeto e não no tipo referenciado
		System.out.println(pt.mostrar());
		System.out.println(pt.nadar());

		System.out.println(pt.comportamento_pato());

        // 2.2.2 Troca de comportamento via setter (Strategy)
        //Troca de comportamento via Setter(Strategy Pattern), alteração de um objeto em tempo de execução sem a necessidade de mudar diretamente a classe original
		pt.setComportamento(new Voar_Foguete());
		
		System.out.println(pt.comportamento_pato());
		
		pt.setComportamento(new Voar_Raso());
		
		System.out.println(pt.comportamento_pato());


        //Parte B - comportamento Pulo
        Pato pa = new Pato_Atleta();
        System.out.println(pa.mostrar());
        System.out.println(pa.comportamento_pulaveis());



        Pato pl = new Pato_Louco();
        System.out.println(pl.mostrar());
        System.out.println(pl.comportamento_pulaveis());

        //Pato Atleta trocando de comportamento em tempo real
        System.out.println(pa.mostrar()+" Pato atleta ficando louco");
        pa.setComportamento(new Pulo_desordenado());
        System.out.println(pa.comportamento_pulaveis());

        //Expansão X modificação
        //Expansão seria a adição de novas funcionalidades na classe sem alterar o codigo ja existente, como foi feito para o pulo desordenado e pulo alto, não houve nenhuma alteração no codigo original Patos
        //Modificação seria a alteração do codigo ja existente para a conformidade da adição de uma nova função
		
		
	}

}

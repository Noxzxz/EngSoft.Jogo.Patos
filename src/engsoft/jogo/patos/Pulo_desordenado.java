package engsoft.jogo.patos;

public class Pulo_desordenado implements Padrão_Pulaveis{

    private int altura;

    public Pulo_desordenado(){
        altura = 100;
    }

    public String Pular(){
        return "Pulo_desordenado. Altura: " + getAltura();
    }

    public int getAltura() {
        return altura;
    }
}

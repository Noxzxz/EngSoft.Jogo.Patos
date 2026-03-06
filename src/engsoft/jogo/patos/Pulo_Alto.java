package engsoft.jogo.patos;

public class Pulo_Alto implements Padrão_Pulaveis{

    private int altura;

    public Pulo_Alto(){
        altura = 300;
    }

    public String Pular(){
        return "Pulo_Alto. Altura: " + getAltura();
    }

    public int getAltura() {
        return altura;
    }
}
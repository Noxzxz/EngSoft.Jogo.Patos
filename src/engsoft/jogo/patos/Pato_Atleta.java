package engsoft.jogo.patos;

public class Pato_Atleta extends Pato{

    public Pato_Atleta(){ setComportamento(new Pulo_Alto()); }

    public String mostrar() {
        return "Eu sou o Pato Atleta.";
    }

}
package engsoft.jogo.patos;

public class Pato_Louco extends Pato{

        public Pato_Louco(){ setComportamento(new Pulo_desordenado()); }

    public String mostrar() {
        return "Eu sou o Pato Louco.";
    }

}

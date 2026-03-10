package engsoft.jogo.patos;

public class Coelho{

    protected Padrao_Pulaveis comportamento_pulaveis;

    public String mostrar(){return "Eu sou um coelho.";}

    public Coelho(){setComportamento(new Pulo_Alto());}

    public void setComportamento(Padrao_Pulaveis padrao ){
        comportamento_pulaveis = padrao;
    }

    public String comportamento_pulaveis(){
        String pular = comportamento_pulaveis.Pular();
        return pular;}

}

import java.util.ArrayList;

public class EquipeJogavel implements Equipe {

    public final ArrayList<Personagem> aliados;

    public EquipeJogavel() {
        aliados = new ArrayList<>();
    }
    
    @Override
    public void Adicionar(Personagem aliado){
        aliados.add(aliado);
    }

    @Override
    public void Retirar(Personagem aliado){
        int indexPersonagemRemover = -1;

        for (int i = 0; i < aliados.size(); i++) {
            if(aliados.get(i).toString() == aliado.toString()){
                indexPersonagemRemover = i;
            }
        }

        if(indexPersonagemRemover != -1){
            aliados.remove(indexPersonagemRemover);
        }
    }
}

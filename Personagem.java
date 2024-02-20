public abstract class Personagem implements MembroEquipe {

    public Equipe equipe;

    @Override
    public void EntrarEquipe(Equipe equipe){
        this.equipe = equipe;
        System.out.println(this + " se juntou à equipe!");
    }
    
    @Override
    public void SairEquipe(){
        this.equipe = null;
        System.out.println(this + " saiu da equipe!");
    }

    @Override
    public abstract String toString();
}

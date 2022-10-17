public class Guerreiro extends Estatus implements Batalha {
    private int pontovida;
    private String nome;
    private int ataque;
    private int defesa;
    private int posicao;
    @Override
    public int getDefesa() {
        return this.defesa;
    }
    @Override
    public void setDefesa(int defesa) {
        this.defesa = defesa;
        
    }
    @Override
    public int getAtaque() {
        return this.ataque;

    }
    @Override
    public void setAtaque(int ataque) {
    this.ataque = ataque;

        
    }
    @Override
    public int getPontovida() {
        return this.pontovida;
    }
    @Override
    public void setPontovida(int pontovida) {
         this.pontovida = 180;
        
    }
    @Override
    public String getNome() {
        return this.nome;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
        
    }
    
    @Override
    public void posicao(int pos){
        this.posicao = pos;
    }

    @Override
    public int atacar(int defesa){
        return this.getAtaque() - defesa;
    }
    
    @Override
    public int defender(int defesa) {
        return this.getDefesa();
    }
}
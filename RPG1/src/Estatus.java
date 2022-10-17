public abstract class Estatus {
    private int defesa;
    private int ataque;
    private String nome;
    private int pontovida;

    public abstract int getDefesa();

    public abstract void setDefesa(int defesa);

    public abstract int getAtaque();

    public abstract void setAtaque(int ataque);

    public abstract int getPontovida();

    public abstract void setPontovida(int pontovida);

    public abstract String getNome();

    public abstract void setNome(String nome);

    public abstract void posicao(int pos);

    public Estatus() {
        this.defesa = 0;
        this.pontovida = 0;
        this.nome = "";
    }

}

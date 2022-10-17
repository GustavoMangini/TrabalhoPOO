public class Dragao {
    private int ataque = 30;
    private int defesa = 30;
    private int pontovida = 300;

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getpontovida() {
        return pontovida;
    }

    public void setpontovida(int vida) {
        this.pontovida = pontovida;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = 30;
    }

    public int atacar(int defense) {
        return getAtaque() - defense;
    }

    public int defender(int damage) {
        return getDefesa();

    }


}
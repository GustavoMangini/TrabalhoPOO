import java.util.Scanner;

public class Selecao {
    private int maiorOpcao;
    Scanner scanner = new Scanner(System.in);
    
    public String setPersonName(){
        System.out.println("Digite o nome do personagem");
        String name = scanner.next();
        return name;
    }

    public int select(int maiorOpcao){
        this.setmaiorOpcao(maiorOpcao);
        int entrada=scanner.nextInt();
        while(entrada<0 || entrada>this.maiorOpcao){
            System.out.println("Valor invalido");
            entrada=scanner.nextInt();
        }
        return entrada;
    }
    
    public int getmaiorOpcao() {
        return maiorOpcao;
    }

    public void setmaiorOpcao(int MaiorOpcao) {
        maiorOpcao = MaiorOpcao;
    }

    
}

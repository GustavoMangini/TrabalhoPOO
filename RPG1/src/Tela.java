import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Tela {
    private List<Estatus> personagens;
    Jogar selecionar = new Jogar();

    public List<Estatus> getPersonagens() {
        return personagens;
    }
    public void exit() {
        exit();
    }
    public void setPersonagens(List<Estatus> personagens) {
        this.personagens = personagens;
    }

    public Estatus getPersonagem(int PersonNumber) {
        return this.personagens.get(PersonNumber);
    }

    public void telaInicio(String a) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Bem vindo ao Heroes of OOP!");
        System.out.println("Gostaria de iniciar uma nova aventura?");
        System.out.println(" (1) - Sim  |  (2) - Não");
        int resposta = leitor.nextInt();
        if (resposta == 1) {
            Tela tela2 = new Tela();
            tela2.escolherPersonagem(a);
        } else {
            System.out.println("Medroso!!!");
        }

    }

    public void escolherPersonagem(String a) {
        Scanner leitor1 = new Scanner(System.in);
        System.out.println("Com quantos personagem você quer jogar?");
        int personagem2 = leitor1.nextInt();
        List<Estatus> personagens = new LinkedList<>();
        for (int i = 0; i < personagem2; i++) {
            Scanner leitor2 = new Scanner(System.in);
            System.out.println("\nVamos escolher seu personagem");
            System.out.println("(1) - Mago");
            System.out.println("(2) - Arqueiro");
            System.out.println("(3) - Guerreiro");
            int personagem = leitor2.nextInt();

            if (personagem == 1) {
                personagens.add(new Mago());
                Estatus personagemMago = personagens.get(i);
                Scanner leitor3 = new Scanner(System.in);
                System.out.println("Escolha sua arma!");
                System.out.println("(1) - Varinha \n (2) - Cajado");

                int arma = leitor2.nextInt();
                Scanner leitor6 = new Scanner(System.in);
                System.out.println("\nDigite o nome do personagem:");
                a = leitor6.nextLine();

                if (arma == 1) {
                    Mago mago = (Mago) personagens.get(i);
                    personagemMago.setAtaque(36);
                    personagemMago.setDefesa(19);
                    personagemMago.setNome("cascas");
                    personagemMago.setPontovida(200);

                } else {
                    
                    Mago mago = (Mago) personagens.get(i);
                    personagemMago.setAtaque(36);
                    personagemMago.setDefesa(19);
                    personagemMago.setNome("cascas");
                    personagemMago.setPontovida(200);

                }
            } else if (personagem == 2) {
                personagens.add(new Mago());
                Estatus personagemMago = personagens.get(i);
                Scanner leitor3 = new Scanner(System.in);
                System.out.println("Escolha sua arma!");
                System.out.println("(1) - Arco Longo \n (2) - Balestra");

                int arma = leitor2.nextInt();
                Scanner leitor6 = new Scanner(System.in);
                System.out.println("\nDigite o nome do personagem:");
                a = leitor6.nextLine();

                if (arma == 1) {
                    Mago mago = (Mago) personagens.get(i);
                    personagemMago.setAtaque(36);
                    personagemMago.setDefesa(19);
                    personagemMago.setNome("cascas");
                    personagemMago.setPontovida(200);

                } else {
                    
                    Mago mago = (Mago) personagens.get(i);
                    personagemMago.setAtaque(36);
                    personagemMago.setDefesa(19);
                    personagemMago.setNome("cascas");
                    personagemMago.setPontovida(200);

                }

            } else if (personagem == 3) {
                personagens.add(new Guerreiro());
                Estatus personagemGuerreiro = personagens.get(i);
                Scanner leitor3 = new Scanner(System.in);
                System.out.println("Escolha sua arma!");
                System.out.println("(1) - Espada \n (2) - Machado");

                int arma = leitor2.nextInt();
                Scanner leitor6 = new Scanner(System.in);
                System.out.println("\nDigite o nome do personagem:");
                a = leitor6.nextLine();

                if (arma == 1) {
                    Guerreiro guerreiro = (Guerreiro) personagens.get(i);
                    personagemGuerreiro.setAtaque(36);
                    personagemGuerreiro.setDefesa(19);
                    personagemGuerreiro.setNome("cascas");
                    personagemGuerreiro.setPontovida(200);

                } else {
                    
                    Guerreiro guerreiro = (Guerreiro) personagens.get(i);
                    personagemGuerreiro.setAtaque(36);
                    personagemGuerreiro.setDefesa(19);
                    personagemGuerreiro.setNome("cascas");
                    personagemGuerreiro.setPontovida(200);

            }
            
        }
        }
        
        
        this.setPersonagens(personagens);
        this.batalha(personagens);
    }

    public void batalha(List<Estatus> personagens) {
        Dragao dragon = new Dragao();
        Random random = new Random();
        while (dragon.getpontovida() > 0) {
            if (personagens.size() == 0) {
                System.out.println("Todos os personagens forão derrotados");
                exit();
            }
            for (int i = 0; i < personagens.size(); i++) {
                Estatus personagemAtual = getPersonagem(i);
                if (personagemAtual.getPontovida() >= 0) {
                    personagemAtual.posicao(0);
                    System.out.println("\n===============================================");
                    System.out.println("\n" + personagemAtual.getNome()  );
                    System.out.println("\n" + personagemAtual.getPontovida() + " Pontos de vida.");
                    System.out.println(personagemAtual.getAtaque() + " de Ataque");
                    System.out.println(personagemAtual.getDefesa() + " Defesa");
                    System.out.println("\nVocê dejesa \n(1) - Atacar");
                    System.out.println("(2) - Defender(Redução de 10% de dano.)");
                    Scanner scanner = new Scanner(System.in);
                    int _selection = scanner.nextInt();
                    if (_selection == 1)
                        dragon.setpontovida(personagemAtual.getAtaque());
                    if (_selection == 2)
                        personagemAtual.posicao(1);
                    System.out.println("\nO dragão tem " + dragon.getpontovida() + " pontos de vida!");
                } else {
                    personagens.remove(i);
                }
            }
        }

    }

   
}
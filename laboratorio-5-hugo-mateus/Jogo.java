import java.util.List;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Jogo {
    private Masmorra masmorra;
    private List<Jogador> jogadores;
    private List<Item> itens;
    private BauDeTesouros bauDeTesouros;
    private Classe classe;
    private List<Monstro> monstros;
    private Raça raça;
    private JogadorView jogadorView;
    private JogadorController jogadorController;
    private MasmorraView masmorraView;
    private MasmorraController masmorraController;

    /**
     * Constructs a Jogo object.
     */
    public Jogo() {
        this.masmorra = null;
        this.jogadores = new ArrayList<>();
        this.itens = new ArrayList<>();
        this.bauDeTesouros = null;
        this.classe = null;
        this.monstros = new ArrayList<>();
        this.raça = null;

        this.jogadorView = new JogadorView();
        this.masmorraView = new MasmorraView();
    }

    // Getters and Setters
    public Masmorra getMasmorra() {
        return masmorra;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public List<Item> getItens() {
        return itens;
    }

    public BauDeTesouros getBauDeTesouros() {
        return bauDeTesouros;
    }

    public List<Monstro> getMonstros() {
        return monstros;
    }

    public Classe getClasse() {
        return classe;
    }

    public Raça getRaça() {
        return raça;
    }

    public void setMasmorra(Masmorra masmorra) {
        this.masmorra = masmorra;
        this.masmorraController = new MasmorraController(masmorra, masmorraView);
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
        if (!jogadores.isEmpty()) {
            this.jogadorController = new JogadorController(jogadores.get(0), jogadorView);  // Assuming controlling the first player initially
        }
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void setBauDeTesouros(BauDeTesouros bauDeTesouros) {
        this.bauDeTesouros = bauDeTesouros;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public void setMonstros(List<Monstro> monstros) {
        this.monstros = monstros;
    }

    public void setRaça(Raça raça) {
        this.raça = raça;
    }

    @Override
    public String toString() {
        return "O jogo tem jogadores " + jogadores + ". Monstros " + monstros +
            " e baús de tesouros " + bauDeTesouros;
    }

    public void loopDeJogo() {
        Scanner scanner = new Scanner(System.in);

        // Each player chooses 1 item out of 5
        System.out.println("Bem-vindo ao Jogo! Os jogadores se encontram" +
                        " numa masmorra cheia de segredos, tesouros e monstros!\nPrimeiramente" +
                        ", cada jogador pode escolher equipar 5 itens iniciais:\n");
        for (Jogador jogador1 : jogadores) {
            System.out.println(jogador1.getNome() + " quais desses itens (por nome) você quer equipar?");
            bauDeTesouros.listarCincoItens();
            String escolha1 = scanner.nextLine();
            bauDeTesouros.acessarItem(escolha1, jogador1);
        }

        while (true) {
            for (Jogador jogador : jogadores) {
                System.out.println("\n" + jogador.getNome() + ", o que você quer fazer?");
                System.out.println("1- Listar itens do inventário\n2- Vender itens do inventário (aumenta nível)\n" +
                "3- Abrir a porta (Tesouro? Monstro? o que te aguarda?)\n" +
                "4- Sair do jogo\n5- Ver informações do jogador\n6- Ver informações da masmorra");  // New options

                int escolha = scanner.nextInt();
                scanner.nextLine();  // Consume newline
                switch (escolha) {
                    case 1:
                        System.out.println(jogador.getInventário().toString()); // List player inventory items
                        break;
                    case 2:
                        jogador.venderItens(jogador.getInventário().getItens());
                        System.out.println("Seu nível atual é: " + jogador.getNivel());
                        break;
                    case 3:
                        Random aleatorio = new Random();
                        int qualPorta = aleatorio.nextInt(2);
                        if (qualPorta == 1) {
                            System.out.println("Você abre a porta de madeira, após o ranger da porta pútrida ecoar" +
                            " ao longo dos obscuros corredores da masmorra, você vê, através da baixa penumbra criada" +
                            " por sua tocha, um baú, provavelmente um tesouro o aguarda, ou não...");
                            masmorra.abrirPortaItem(bauDeTesouros, jogador);
                        } else {
                            int qualMonstro = aleatorio.nextInt(masmorra.getMonstros().size());
                            Monstro monstroEnfrentado = masmorra.getMonstros().get(qualMonstro);
                            System.out.println("Após passar por cima de uma porta de madeira caída no chão, você adentra " +
                                            "uma sala obscura, onde apenas a luz da sua tocha mostra-se insuficiente para clarear todo o " +
                                            "local, você ouve leves sons de passos na escuridão. Seu pé subitamente pisa " +
                                            "num crânio humano, o som dos ossos quebrando ecoa, e você vê um esqueleto humano coberto por teias" +
                                            " e sangue seco. Os sons de passo param subitamente e um estrondo ocorre no solo. Você olha para trás" +
                                            "e uma criatura abissal: " + monstroEnfrentado.getNome() + " te encarando, você percebe que pode" +
                                            "ser o próximo esqueleto que será preso. A luta começa.");
                            masmorra.abrirPortaMonstro(monstroEnfrentado, jogador, bauDeTesouros);
                        }
                        break;
                    case 4:
                        scanner.close();
                        return;
                    case 5:  // View player information
                        jogadorController.setJogador(jogador);  // Update controller to the current player
                        jogadorController.updateView();
                        break;
                    case 6:  // View dungeon information
                        masmorraController.updateView();
                        break;
                    default:
                        System.out.println("Escolha entre as opções do jogo.");
                }
            }
        }
    }
}

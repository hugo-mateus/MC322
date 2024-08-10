import java.util.List;

public class JogadorView {
    public void displayJogadorDetails(String nome, int nivel, RaçaEnum raça, ClasseEnum classe, List<Item> inventário) {
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Raça: " + raça);
        System.out.println("Classe: " + classe);
        System.out.println("Inventário: ");
        for (Item item : inventário) {
            System.out.println(" - " + item.getNome() + " (Poder: " + item.getBonusPoder() + ")");
        }
    }
}

import java.util.List;

public class MasmorraView {
    public void displayMasmorraDetails(List<Monstro> monstros, List<Item> tesouros) {
        System.out.println("Monstros na Masmorra:");
        for (Monstro monstro : monstros) {
            System.out.println(" - " + monstro.getNome());
        }
        //System.out.println("Tesouros no Baú:");
        //for (Item item : tesouros) {
        //    System.out.println(" - " + item.getNome() + " (Poder: " + item.getBonusPoder() + ")");
        //}
    }
}


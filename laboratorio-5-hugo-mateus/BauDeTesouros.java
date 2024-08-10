import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class BauDeTesouros extends Inventário {
    
    private Inventário bau;
    private static BauDeTesouros instancia;

    // Construtor privado para evitar instanciação
    private BauDeTesouros(Inventário bau) {
        super(0, null);
        this.bau = bau;
    }

    // Método público estático para obter a única instância
    public static BauDeTesouros getInstance(Inventário bau) {
        if (instancia == null) {
            instancia = new BauDeTesouros(bau);
        }
        return instancia;
    }

    /**
     * Pega n itens aleatórios, os retira e devolve 
     */
    public List<Item> pegarItensAleatórios(int quantidade, Jogador jogador) {
        Random aleatorio = new Random();
        List<Item> itensAleatórios = new ArrayList<>();
        int tamanho = bau.getItens().size();   //pega tamanho da lista e armazena em tamanho

        //por quantidade vezes, pega um num aleatorio pra index, tira esse item e coloca em itensAleatórios
        for (int i = 0; i < quantidade; i++) {
            int index = aleatorio.nextInt(tamanho - i);
            Item item = bau.getItens().remove(index); //
            itensAleatórios.add(item);
            jogador.getInventário().adicionarItem(item); //adiciona no inventário
        }

        return itensAleatórios; //retorna a lista cm os elementos retirados
    }

    /**
     * Acessa um item pelo seu nome e o retira da lista
     */
    public Item acessarItem(String nome, Jogador jogador) {
        for (Item item : bau.getItens()) {
            if (item.getNome().equals(nome)) { 
                boolean conseguiuAdicionado = jogador.getInventário().adicionarItem(item);
                if (conseguiuAdicionado) {
                    bau.itens.remove(item); //tira do baú em caso de sucesso
                    return item;
                } else {
                    return null; //retorna null se não conseguir no inventário.adicionarItem(_) 
                }
            }
        }
        return null; //null se não achar o nome do item no inventário
    }
    

    /**
     * Pega dois itens aleatórios e os lista
     */
    public void listarItens(){
        if (bau == null || bau.getItens() == null || bau.getItens().isEmpty()) {
            System.out.println("O baú está vazio.");
            return;
        }

        Random aleatorio = new Random();
        int tamanho = bau.getItens().size();

        // Garantir que o tamanho do baú seja pelo menos 2 para listar 2 itens
        if (tamanho < 2) {
            System.out.println(bau.getItens().get(0).getNome());
            return;
        }

        //gera 2 números aleatorios (de limite do tamanho da lista)
        int index1 = aleatorio.nextInt(tamanho);
        int index2 = aleatorio.nextInt(tamanho);

        //para ter certeza que os indexes gerados são diferentes
        while (index1 == index2) {
            index2 = aleatorio.nextInt(tamanho);
        }

        //imprimindo
        System.out.println("1- " + bau.getItens().get(index1).getNome()+
        " bônus poder: " + bau.getItens().get(index1).getBonusPoder());
        if (bau.getItens().get(index1).getItemGrande()){
            System.out.println(" (Grande)");
        }
        System.out.println("\n2- " + bau.getItens().get(index2).getNome()+
        " bônus poder: " + bau.getItens().get(index2).getBonusPoder());
        if (bau.getItens().get(index2).getItemGrande()){
            System.out.println(" (Grande)");
        }
    }

    
    /**
     * Pega cinco itens aleatórios e os lista
     */
    public void listarCincoItens(){
        if (bau == null || bau.getItens() == null || bau.getItens().isEmpty()) {
            System.out.println("O baú está vazio.");
            return;
        }

        Random aleatorio = new Random();
        int tamanho = bau.getItens().size();

        // Garantir que o tamanho do baú seja pelo menos 5 para listar 5 itens
        if (tamanho < 5) {
            System.out.println(bau.getItens().get(0).getNome());
            return;
        }

        //gera 5 números aleatorios (de limite do tamanho da lista)
        int index1 = aleatorio.nextInt(tamanho);
        int index2 = aleatorio.nextInt(tamanho);
        int index3 = aleatorio.nextInt(tamanho);
        int index4 = aleatorio.nextInt(tamanho);
        int index5 = aleatorio.nextInt(tamanho);

        //para ter certeza que os indexes gerados são diferentes
        while (index1 == index2) {
            index2 = aleatorio.nextInt(tamanho);
        }
        while(index1 == index3 || index2==index3){
            index3 = aleatorio.nextInt(tamanho);
        }
        while(index1 == index4 || index2==index4 || index3==index4){
            index4 = aleatorio.nextInt(tamanho);
        }
        while(index1 == index5 || index2==index5 || index3==index5 || index4 == index5){
            index5 = aleatorio.nextInt(tamanho);
        }

        //imprimindo
        System.out.println("1- " + bau.getItens().get(index1).getNome()+
        " -poder: " + bau.getItens().get(index1).getBonusPoder());
        if (bau.getItens().get(index1).getItemGrande()){
            System.out.println(" (Grande)");
        }
        System.out.println("\n2- " + bau.getItens().get(index2).getNome()+
        " -poder: " + bau.getItens().get(index2).getBonusPoder());
        if (bau.getItens().get(index2).getItemGrande()){
            System.out.println(" (Grande)");
        }
        System.out.println("\n3- " + bau.getItens().get(index3).getNome()+
        " -poder: " + bau.getItens().get(index3).getBonusPoder());
        if (bau.getItens().get(index3).getItemGrande()){
            System.out.println(" (Grande)");
        }
        System.out.println("\n4- " + bau.getItens().get(index4).getNome()+
        " -poder: " + bau.getItens().get(index4).getBonusPoder());
        if (bau.getItens().get(index4).getItemGrande()){
            System.out.println(" (Grande)");
        }
        System.out.println("\n5- " + bau.getItens().get(index5).getNome()+
        " -poder: " + bau.getItens().get(index5).getBonusPoder());
        if (bau.getItens().get(index5).getItemGrande()){
            System.out.println(" (Grande)");
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Item> itensinciais = new ArrayList<>();

        //Inicia as classes
        Item item = new Item("espada",3 , 50000, "cortante", false, null );
        Item item2 = new Item("pá", 1, 10, "trauma", true, null);
        Classe classe = new Classe("descrição padrão", item, null, null);
        Raça raça = new Raça("descrição padrão", "Humano", 3);
        itensinciais.add(item);
        Inventário inventário = new Inventário(10, itensinciais);
        Jogador jogador = new Jogador("Hugo", 3, raça, classe, inventário);
        Monstro monstro = new Monstro("Centauro", 4, itensinciais, 5);
        //Ladrão ladrão = new Ladrão(item);

        //testa inventário
        System.out.println(inventário.acessarItem("espada")); //printa item do inventário encontrado por nome
        inventário.removerItem("espada"); //remove item por nome
        System.out.println(inventário.toString()); //imprime inventário
        inventário.adicionarItem(item2); // adiciona item ao inventário
        System.out.println(inventário.toString());
        
        //Equipe itens do inventário ao Jogador
        jogador.setInventário(inventário);
        inventário.adicionarItem(item2);

        //Imprime o poder do Jogador
        System.out.println(jogador.poderDoJogador());
        
        //Imprime as classes instanciadas
        System.out.println(item.toString());
        System.out.println(jogador.toString());
        System.out.println(monstro.toString()); 
        System.out.println(inventário.toString());
        System.out.println(raça.toString());
        System.out.println(classe.toString());
    }
}
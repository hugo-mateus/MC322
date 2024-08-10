public class Main {
    public static void main(String[] args) {

        //Inicia as classes
        Jogador jogador = new Jogador("Raimon", 2, "humano", "bardo", "capacete", "armadura leve", "poção", "espada", "nada");
        Item item = new Item("Poção", 5, 500, "Venenoso");
        Monstro monstro = new Monstro("Centauro", 8, 325600, 2);

        //testa getter
        int bonusPoder = item.getbonusPoder();
        System.out.println("Bonus Poder: " + bonusPoder);

        //testa setter
        //Muda a raça do jogador
        jogador.setRaca("elfo");

        //Imprime as classes instanciadas
        System.out.println(item.toString());
        System.out.println(jogador.toString());
        System.out.println(monstro.toString()); 
    }
}
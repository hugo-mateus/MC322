import java.util.ArrayList;
import java.util.List;

public class Jogador {
    
    private String nome;
    private int nivel;
    private RaçaEnum raça;
    private ClasseEnum classe;
    private Inventário inventário;
    private Item itemCorpo;
    private Item itemCabeca;
    private Item itemMãoDireita;
    private Item itemMãoEsquerda;
    private Item itemPé;

    /**
     * Constructs an Jogador object.
     * 
     * @param nome               nome do jogaor
     * @param nivel              nivel do jogador
     * @param raca               raca do jogador
     * @param inventario         inventário do jogador
     * @param itemCabeca         item na cabeça do jogaor
     * @param itemCorpo          item no corpo  do jogador
     *  @param itemMaoDireita     item na mão direita do jogador
     * @param itemMaoEsquerda    item na mão esquerda do jogaor
     * @param itemPe             item no pé do jogador
     */
    public Jogador(String nome, int nivel, RaçaEnum raça, ClasseEnum classe) {
        this.nome = nome;
        this.nivel = nivel;
        this.raça = raça;
        this.classe = classe;
        this.inventário = new Inventário(1,  new ArrayList<Item>());
        this.itemCabeca = null;
        this.itemCorpo = null;
        this.itemMãoDireita = null;
        this.itemMãoEsquerda = null;
        this.itemPé = null;
    }


    /**
     * Returns the name of the player
     * 
     * @return the player's name
     */
    public String getNome() {
        return nome;
    }

        /**
     * Returns the level of the player
     * 
     * @return the players's level
     */
    public int getNivel() {
        return nivel;
    }

        /**
     * Returns the race of the players
     * 
     * @return the players's race
     */
    public RaçaEnum getRaça() {
        return raça;
    }

        /**
     * Returns the class of the player
     * 
     * @return the player's class
     */
    public ClasseEnum getClasse() {
        return classe;
    }

        /**
     * Returns the player's inventary
     * 
     * @return the player's inventary
     */
    public Inventário getInventário() {
        return inventário;
    }

            /**
     * Returns the item in the player's head 
     * 
     * @return item in the player's head
     */
    public Item getItemCabeca() {
        return itemCabeca;
    }

            /**
     * Returns the item in the body of the player
     * 
     * @return the player's body item
     */
    public Item getItemCorpo() {
        return itemCorpo;
    }

            /**
      * Returns the item in the right hand of the player
     * 
     * @return the player's right hands item
     */
    public Item getItemMãoDireita() {
        return itemMãoDireita;
    }

            /**
     *  * Returns the item in the left hand of the player
     * 
     * @return the player's left hands item
     */
    public Item getItemMãoEsquerda() {
        return itemMãoEsquerda;
    }

            /**
     * Returns the item in the foot of the player
     * 
     * @return the player's foot item
     */
    public Item getItemPé() {
        return itemPé;
    }

        /**
     * Sets the name of the player
     */
    public void setNome(String n) {
        this.nome = n;
    }

        /**
     * Sets the level of the player
     */
    public void setNivel(int n) {
        this.nivel = n;
    }

        /**
     * Sets the race of the players
     */
    public void setRaça(RaçaEnum r) {
        this.raça= r;
    }

        /**
     * Sets the class of the player
     */
    public void setClasse(ClasseEnum c) {
        this.classe = c;
    }

        /**
     * Sets the inventary of the player
     */
    public void setInventário(Inventário i) {
        this.inventário = i;
    }

            /**
     * Sets the item in the player's head 
     */
    public void setItemCabeca(Item Ic) {
        this.itemCabeca = Ic;
    }

            /**
     * Sets the item in the body of the player
     */
    public void setItemCorpo(Item ICor) {
        this.itemCorpo = ICor;
    }

            /**
      * Sets the item in the right hand of the player
     */
    public void setItemMãoDireita(Item ImD) {
        this.itemMãoDireita = ImD;
    }

            /**
     *  * Sets the item in the left hand of the player
     */
    public void setItemMãoEsquerda(Item ImE) {
        this.itemMãoEsquerda = ImE;
    }

            /**
     * Sets the item in the foot of the player
     */
    public void setItemPé(Item Ip) {
        this.itemPé = Ip;
    }

    /**
     * prints the class and its atributes
     */
    public String toString() {
        return "O jogador " + nome+ " tem nível "+ nivel;
    }

    public int poderDoJogador(){
        int poder = nivel;

        for (Item item : inventário.getItens()) {
            poder = poder + item.getBonusPoder();
        }
        return poder;
    }

    /**
     * Vende os itens na lista, analisa se com o dinheiro o jogador
     * consegue subir de nível, e o aumento caso positivo
     */
    public boolean venderItens(List<Item> itensParaVender){
        boolean subiu = false;
        int dinheiro = 0;
        int nivelJogador = getNivel();
        List<Item> itensCopia = new ArrayList<>(itensParaVender); //copia da lista de itens
        
        for (Item item : itensCopia) {
            dinheiro += item.getValor(); 
            inventário.removerItem(item.getNome()); //remove do inventário o item
        }
        while(dinheiro >= 1000){
            //aumenta nível se tiver dinheiro
            dinheiro -= 1000;
            subiu = true;
            nivelJogador++; 
        }
        setNivel(nivelJogador); //muda nível do jogador

        if(subiu){
            System.out.println("Parabéns você subiu de nível!");
        }
        return subiu;
    }
    
}




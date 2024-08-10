public class Guerreiro extends Classe{

    private Item itemCorpo;
    private Item itemCabeca;

    /**
     * Constructs an Ladrão object.
     * @param itemCabeca         item na cabeça do jogaor
     * @param itemCorpo          item no corpo  do jogador
     */
    public Guerreiro(Item itemCorpo, Item itemCabeca) {
        super("Descrição padrão", null, null, null);
        this.itemCabeca = itemCabeca;
        this.itemCorpo = itemCorpo;
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
     * prints the class and its atributes
     */
    public String toString() {
        return "O guerreiro usa " + itemCabeca+ " e " +itemCorpo;
    }
    
}
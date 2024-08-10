public class Ladrão extends Classe{

    private Item itemCorpo;

    /**
     * Constructs an Ladrão object.
     * @param itemCorpo          item no corpo  do jogador
     */
    public Ladrão(Item itemCorpo) {
        super("Descrição padrão", null, null, null);
        this.itemCorpo = itemCorpo;
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
     * Sets the item in the body of the player
     */
    public void setItemCorpo(Item ICor) {
        this.itemCorpo = ICor;
    }

    /**
     * prints the class and its atributes
     */
    public String toString() {
        return "O Ladrão usa " +itemCorpo+ " no corpo.";
    }

}

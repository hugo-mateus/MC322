public class Mago extends Classe{

    private Item itemCabeca;

    /**
     * Constructs an Mago object.
     * @param itemCabeca         item na cabeça do jogaor
     */
    public Mago(Item itemCabeca) {
        super("Descrição padrão", null, null, null);
        this.itemCabeca = itemCabeca;
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
     * Sets the item in the player's head 
     */
    public void setItemCabeca(Item Ic) {
        this.itemCabeca = Ic;
    }

    /**
     * prints the class and its atributes
     */
    public String toString() {
        return "O Mago usa " +itemCabeca+ " na cabeça.";
    }
    
}


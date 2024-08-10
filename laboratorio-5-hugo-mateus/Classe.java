

public class Classe {

    private String descrição;
    private Item itemMãoDireita;
    private Item itemMãoEsquerda;
    private Item itemPé;

    /**
     * Constructs an Classe object.
     * @param descrição         descrição da classe
     * @param itemMaoDireita     item na mão direita do jogador
     * @param itemMaoEsquerda    item na mão esquerda do jogaor
     * @param itemPe             item no pé do jogaor
     */
    public Classe(String descrição, Item itemMaoDireita, Item itemMaoEsquerda, Item itemPe) {
        this.descrição = descrição;
        this.itemMãoDireita = itemMaoDireita;
        this.itemMãoEsquerda = itemMaoEsquerda;
        this.itemPé = itemPe;
    }

/**
     * Returns the description of the class
     * 
     * @return the classe's description
     */
    public String getDescrição() {
        return descrição;
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
     * Sets the description of the race
     */
    public void setDescrição(String d) {
        this.descrição = d;
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
        String mãoDireitaNome = itemMãoDireita != null ? itemMãoDireita.getNome() : "nada";
        String mãoEsquerdaNome = itemMãoEsquerda != null ? itemMãoEsquerda.getNome() : "nada";
        
        return descrição + " usa: " + mãoDireitaNome + " na mão direita, e " + mãoEsquerdaNome + " na mão esquerda.";
    }

    public boolean possuiMaoVazia(){
        if(getItemMãoDireita() == null || getItemMãoEsquerda() == null){
            return true;
        }
        return false;
    }

    
}
public class Jogador {
    private String Nome;
    private int nivel;
    private String raca;
    private String classe;
    private String itemCabeca;
    private String itemCorpo;
    private String itemMaoDireita;
    private String itemMaoEsquerda;
    private String itemPe;

    /**
     * Constructs an Jogador object.
     * 
     * @param nome               nome do jogaor
     * @param nivel              nivel do jogador
     * @param raca               raca do jogador
     * @param classe             classe do jogaor
     * @param itemCabeca         item na cabeça do jogaor
     * @param itemCorpo          item no corpo  do jogador
     * @param itemMaoDireita     item na mão direita do jogador
     * @param itemMaoEsquerda    item na mão esquerda do jogaor
     * @param itemPe             item no pé do jogaor
     */
    public Jogador(String Nome, int nivel, String raca, String classe, String itemCabeca, String itemCorpo, String itemMaoDireita, String itemMaoEsquerda, String itemPe) {
        this.Nome = Nome;
        this.nivel = nivel;
        this.raca = raca;
        this.classe = classe;
        this.itemCabeca = itemCabeca;
        this.itemCorpo = itemCorpo;
        this.itemMaoDireita = itemMaoDireita;
        this.itemMaoEsquerda = itemMaoEsquerda;
        this.itemPe = itemPe;
    }


    /**
     * Returns the name of the player
     * 
     * @return the player's name
     */
    public String getNome() {
        return Nome;
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
    public String getRaca() {
        return raca;
    }

        /**
     * Returns the class of the player
     * 
     * @return the player's class
     */
    public String getClasse() {
        return classe;
    }

            /**
     * Returns the item in the player's head 
     * 
     * @return item in the player's head
     */
    public String getItemCabeca() {
        return itemCabeca;
    }

            /**
     * Returns the item in the body of the player
     * 
     * @return the player's body item
     */
    public String getItemCorpo() {
        return itemCorpo;
    }

            /**
      * Returns the item in the right hand of the player
     * 
     * @return the player's right hands item
     */
    public String getItemMaoDireita() {
        return itemMaoDireita;
    }

            /**
     *  * Returns the item in the left hand of the player
     * 
     * @return the player's left hands item
     */
    public String getItemMaoEsquerda() {
        return itemMaoEsquerda;
    }

            /**
     * Returns the item in the foot of the player
     * 
     * @return the player's foot item
     */
    public String getItemPe() {
        return itemPe;
    }

        /**
     * Sets the name of the player
     */
    public void setNome(String n) {
        this.Nome = n;
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
    public void setRaca(String r) {
        this.raca= r;
    }

        /**
     * Sets the class of the player
     */
    public void setClasse(String c) {
        this.classe = c;
    }

            /**
     * Sets the item in the player's head 
     */
    public void setItemCabeca(String Ic) {
        this.itemCabeca = Ic;
    }

            /**
     * Sets the item in the body of the player
     */
    public void setItemCorpo(String ICor) {
        this.itemCorpo = ICor;
    }

            /**
      * Sets the item in the right hand of the player
     */
    public void setItemMaoDireita(String ImD) {
        this.itemMaoDireita = ImD;
    }

            /**
     *  * Sets the item in the left hand of the player
     */
    public void setItemMaoEsquerda(String ImE) {
        this.itemMaoEsquerda = ImE;
    }

            /**
     * Sets the item in the foot of the player
     */
    public void setItemPe(String Ip) {
        this.itemPe = Ip;
    }


    /**
     * prints the class and its atributes
     */
    public String toString() {
        return "O jogador " + raca+ " " + classe+ ", " + Nome + ", de nível "
        + nivel + " usa: " +itemCabeca+ ", " + itemPe+ ", "+itemCorpo+ ", "
        +itemMaoDireita+ " na mão direita, e " +itemMaoEsquerda+ " na mão esquerda.";
    }

    
}
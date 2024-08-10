public class Item {
    private String nome;
    private int bonusPoder;
    private int valor;
    private String tipo;

    /**
     * Constructs an Item object.
     * 
     * @param nome          nome do item
     * @param bonusPoder    poder bônus
     * @param valor         valor do otem
     * @param tipo          tipo do item
     */
    public Item(String nome, int bonusPoder, int valor, String tipo) {
        this.nome = nome;
        this.bonusPoder = bonusPoder;
        this.valor = valor;
        this.tipo = tipo;
    }


    /**
     * Returns the name of the item
     * 
     * @return the item name
     */
    public String getNome() {
        return nome;
    }

        /**
     * Returns the bonus power of the item
     * 
     * @return the item's bonus power
     */
    public int getbonusPoder() {
        return bonusPoder;
    }

        /**
     * Returns the value of the item
     * 
     * @return the item's value
     */
    public int getvalor() {
        return valor;
    }

        /**
     * Returns the type of the item
     * 
     * @return the item's type
     */
    public String gettipo() {
        return tipo;
    }

        /**
     * Sets the name of the item
     */
    public void setNome(String n) {
        this.nome = n;
    }

        /**
     * Sets the bonus power of the item
     */
    public void setBonusPoder(int bonus) {
        this.bonusPoder = bonus;
    }

        /**
     * Sets the value of the item
     */
    public void setValor(int v) {
        this.valor = v;
    }

        /**
     * Sets the name of the item
     */
    public void setTipo(String t) {
        this.tipo = t;
    }

    /**
     * prints the class and its atributes
     */
    public String toString() {
        return "O item " + nome + " tem poder bônus " + bonusPoder+
        ", valor " + valor + " e tipo " + tipo + "!" ;
    }

    
}
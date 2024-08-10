import java.util.List;

public class Item {
    
    private String nome;
    private int bonusPoder;
    private int valor;
    private String tipo;
    private boolean itemGrande;
    private List<Classe> classesCompatíveis;

    /**
     * Constructs an Item object.
     * 
     * @param nome                  nome do item
     * @param bonusPoder            poder bônus
     * @param valor                 valor do otem
     * @param tipo                  tipo do item
     * @param itemGrande            se o jogador carrega um item grande
     * @param classesCompativeis    tipo do item
     */
    public Item(String nome, int bonusPoder, int valor, String tipo, boolean itemGrande, List<Classe> classesCompativeis) {
        this.nome = nome;
        this.bonusPoder = bonusPoder;
        this.valor = valor;
        this.tipo = tipo;
        this.itemGrande = itemGrande;
        this.classesCompatíveis = classesCompativeis;
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
     * Returns wheter there is one big item or not
     * 
     * @return true if player carries  one big item and false oterwise
     */
    public boolean getItemGrande() {
        return itemGrande;
    }

        /**
     * Returns the compatible classes
     * 
     * @return the compatible classes
     */
    public List<Classe> getClassesCompatíveis() {
        return classesCompatíveis;
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
     * Sets the boolean for big items
     */
    public void setItemGrande(boolean i) {
        this.itemGrande = i;
    }

        /**
     * Sets the compatible classes
     */
    public void setClassesCompatíveis(List<Classe> c) {
        this.classesCompatíveis = c;
    }

    /**
     * prints the class and its atributes
     */
    public String toString() {
        return "O item " + nome + " tem poder bônus " + bonusPoder+
        ", valor " + valor + " e tipo " + tipo + "!" ;
    }

    
}


import java.util.List;

public class Item {
    
    private String nome;
    private int bonusPoder;
    private int valor;
    private TipoItem tipo;
    private boolean itemGrande;
    private List<ClasseEnum> classesCompatíveis;
    private List<RaçaEnum> raçasCompatíveis;

    /**
     * Constructs an Item object.
     * 
     * @param nome                  nome do item
     * @param bonusPoder            poder bônus
     * @param valor                 valor do otem
     * @param tipo                  tipo do item
     * @param itemGrande            se o jogador carrega um item grande
     * @param classesCompativeis    classes que podem usar o item
     * @param raçasCompativeis      raças que podem usar o item
     */
    public Item(String nome, int bonusPoder, int valor,TipoItem tipo , boolean itemGrande,
    List<ClasseEnum> classesCompatíveis, List<RaçaEnum> raçasCompatíveis)  {
        this.nome = nome;
        this.bonusPoder = bonusPoder;
        this.valor = valor;
        this.tipo = tipo;
        this.itemGrande = itemGrande;
        this.classesCompatíveis = classesCompatíveis;
        this.raçasCompatíveis = raçasCompatíveis;
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
    public int getBonusPoder() {
        return bonusPoder;
    }

        /**
     * Returns the value of the item
     * 
     * @return the item's value
     */
    public int getValor() {
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
    public List<ClasseEnum> getClassesCompatíveis() {
        return classesCompatíveis;
    }

        /**
     * Returns the compatible races
     * 
     * @return the compatible races
     */
    public List<RaçaEnum> getRaçasCompatíveis() {
        return raçasCompatíveis;
    }

        /**
     * Returns the type of the item
     * 
     * @return the item's type
     */
    public TipoItem getTipo() {
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
    public void setTipo(TipoItem t) {
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
    public void setClassesCompatíveis(List<ClasseEnum> c) {
        this.classesCompatíveis = c;
    }

        /**
     * Sets the compatible classes
     */
    public void setRaçasCompatíveis(List<RaçaEnum> r) {
        this.raçasCompatíveis = r;
    }


    /**
     * prints the class and its atributes
     */
    public String toString() {
        return "O item " + nome + " de poder bônus " + bonusPoder+
        ", valor " + valor + " e tipo " + tipo ;
    }
    
}


import java.util.List;

public class Monstro {
    
    private String Nome;
    private int poder;
    private List<Item> tesouros;
    private int níveisPerdidos;

    /**
     * Constructs an Monstro object.
     * 
     * @param nome                    nome do monstro
     * @param poder                   poder do monstro
     * @param tesouros                tesouros do monstro
     * @param niveisPerdidos          niveis perdidos no monstro
     */
    public Monstro(String Nome, int poder, List<Item> tesouros, int niveisPerdidos) {
        this.Nome = Nome;
        this.poder = poder;
        this.tesouros = tesouros;
        this.níveisPerdidos = niveisPerdidos;
    }


    /**
     * Returns the name of the monster
     * 
     * @return the monster's name
     */
    public String getNome() {
        return Nome;
    }

        /**
     * Returns the power of the item
     * 
     * @return the monsters's power
     */
    public int getPoder() {
        return poder;
    }

        /**
     * Returns monster's tresures
     * 
     * @return the monsters's tresures
     */
    public List<Item> getTesouros() {
        return tesouros;
    }

        /**
     * Returns the levels lost on the monster
     * 
     * @return the monster's lost levels
     */
    public int getNíveisPerdidos() {
        return níveisPerdidos;
    }

        /**
     * Sets the name of the monster
     */
    public void setNome(String n) {
        this.Nome = n;
    }

        /**
     * Sets the  power of the monster
     */
    public void setPoder(int p) {
        this.poder = p;
    }

        /**
     * Sets the ammount of treasures of the monster
     */
    public void setTesouros(List<Item> t) {
        this.tesouros = t;
    }

        /**
     * Sets the name of the item
     */
    public void setNíveisPerdidos(int niveis) {
        this.níveisPerdidos = niveis;
    }

    /**
     * prints the class and its atributes
     */
    public String toString() {
        //inicializa lista
        String lista = "";

        //junta todos os itens na lista tesouros em uma string
        for (Item item : tesouros) {
            lista += ", " + item.getNome(); 
        }
        
        // retira a primeira virgula na frente de lista
        if (!lista.isEmpty()) {
            lista = lista.substring(2); 
        }

        if (lista == ""){
            lista = "nenhum";
        }
        
        return "O monstro " + Nome + " tem poder " +  poder+
        " níveis perdidos " + níveisPerdidos+ " e os seguintes itens: " + lista+ ".";
    }

    
}
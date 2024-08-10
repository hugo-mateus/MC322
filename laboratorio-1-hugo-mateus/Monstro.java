public class Monstro {
    private String Nome;
    private int poder;
    private int quantidadeDeTesouros;
    private int niveisPerdidos;

    /**
     * Constructs an Monstro object.
     * 
     * @param nome                    nome do monstro
     * @param poder                   poder do monstro
     * @param quantidadeDeTesouros    tesouros do monstro
     * @param niveisPerdidos          niveis perdidos no monstro
     */
    public Monstro(String Nome, int poder, int quantidadeDeTesouros, int niveisPerdidos) {
        this.Nome = Nome;
        this.poder = poder;
        this.quantidadeDeTesouros = quantidadeDeTesouros;
        this.niveisPerdidos = niveisPerdidos;
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
     * Returns the ammount of tresures
     * 
     * @return the monsters's ammount of tresures
     */
    public int getQuantidadeDeTesouros() {
        return quantidadeDeTesouros;
    }

        /**
     * Returns the levels lost on the monster
     * 
     * @return the monster's lost levels
     */
    public int getNiveisPerdidos() {
        return niveisPerdidos;
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
    public void setQuantidadeDeTesouros(int q) {
        this.quantidadeDeTesouros = q;
    }

        /**
     * Sets the name of the item
     */
    public void setNiveisPerdidos(int niveis) {
        this.niveisPerdidos = niveis;
    }

    /**
     * prints the class and its atributes
     */
    public String toString() {
        return "O monstro " + Nome + " tem poder  " + poder+ ", " 
        + quantidadeDeTesouros + " tesouros, e níveis perdidos " + niveisPerdidos;
    }

    
}
public class Jogador {
    
    private String nome;
    private int nivel;
    private Raça raça;
    private Classe classe;
    private Inventário inventário;

    /**
     * Constructs an Jogador object.
     * 
     * @param nome               nome do jogaor
     * @param nivel              nivel do jogador
     * @param raca               raca do jogador
     * @param inventario         inventário do jogador
     */
    public Jogador(String nome, int nivel, Raça raca, Classe classe, Inventário inventario) {
        this.nome = nome;
        this.nivel = nivel;
        this.raça = raca;
        this.classe = classe;
        this.inventário = inventario;
    }


    /**
     * Returns the name of the player
     * 
     * @return the player's name
     */
    public String getNome() {
        return nome;
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
    public Raça getRaça() {
        return raça;
    }

        /**
     * Returns the class of the player
     * 
     * @return the player's class
     */
    public Classe getClasse() {
        return classe;
    }

        /**
     * Returns the player's inventary
     * 
     * @return the player's inventary
     */
    public Inventário getInventário() {
        return inventário;
    }

        /**
     * Sets the name of the player
     */
    public void setNome(String n) {
        this.nome = n;
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
    public void setRaça(Raça r) {
        this.raça= r;
    }

        /**
     * Sets the class of the player
     */
    public void setClasse(Classe c) {
        this.classe = c;
    }

        /**
     * Sets the inventary of the player
     */
    public void setInventário(Inventário i) {
        this.inventário = i;
    }

    /**
     * prints the class and its atributes
     */
    public String toString() {
        return "O jogador " + nome+ " tem nível "+ nivel;
    }

    public int poderDoJogador(){
        int poder = nivel;

        for (Item item : inventário.getInventário()) {
            poder = poder + item.getbonusPoder();
        }
        return poder;
    }
    
}
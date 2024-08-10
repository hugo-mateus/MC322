public class Raça {
    
    private String descrição;
    private String nomeDaRaça;
    private int mínimoPraFugir;
    /**
     * Constructs an Raça object.
     * 
     * @param descrição         descrição da raça
     * @param nomeDaRaça        nome da raça
     * @param mínimoPraFugir    raca do jogador
     */
    public Raça(String descrição, String nomeDaRaça, int mínimoPraFugir) {
        this.descrição = descrição;
        this.nomeDaRaça = nomeDaRaça;
        this.mínimoPraFugir = mínimoPraFugir;
    }


    /**
     * Returns the description of the race
     * 
     * @return the race's description
     */
    public String getDescrição() {
        return descrição;
    }

        /**
     * Returns the name of the race
     * 
     * @return the race's name
     */
    public String getNomeDaRaca() {
        return nomeDaRaça;
    }


        /**
     * Returns the minimum number for running away
     * 
     * @return the race's minimum number for running away
     */
    public int getMínimoPraFugir() {
        return mínimoPraFugir;
    }

        /**
     * Sets the description of the race
     */
    public void setDescrição(String d) {
        this.descrição = d;
    }

        /**
     * Sets the name of the race
     */
    public void setNomeDaRaça(String n) {
        this.nomeDaRaça = n;
    }

        /**
     * Sets the minimum number for running away
     */
    public void setMinimoPraFugir(int m) {
        this.mínimoPraFugir= m;
    }

    /**
     * prints the class and its atributes
     */
    public String toString() {
        return "A classe " + nomeDaRaça+ " " + descrição+
        " tem número mínimo para fugir de " + mínimoPraFugir;
    }


}
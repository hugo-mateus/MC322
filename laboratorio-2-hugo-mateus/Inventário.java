import java.util.List;
import java.util.Iterator;

public class Inventário {
    
    private int limiteInventário;
    private List<Item> inventário;

    /**
     * Constructs an Inventário object.
     * 
     * @param limiteInventario   quantidade de itens que cabem no inventário
     * @param inventario         lista de Itens no invetário
     */

    public Inventário(int limiteInventario, List<Item> inventario) {
        this.limiteInventário = limiteInventario;
        this.inventário = inventario;
    }

    /**
     * Returns the limit of the inventary
     * 
     * @return inventary's limit
     */
    public int getLimiteInventário() {
        return limiteInventário;
    }

        /**
     * Returns the inventary
     * 
     * @return the inventary
     */
    public List<Item> getInventário() {
        return inventário;
    }

        /**
     * Sets the inventary limit
     */
    public void setLimiteInventário(int l) {
        this.limiteInventário = l;
    }

        /**
     * Sets the bonus power of the item
     */
    public void setInventário (List<Item> i) {
        this.inventário = i;
    }



    /**
     * prints the class and its atributes
     */
    public String toString() {
        //inicializa lista
        String lista = "";
    
        //junta todos os itens na lista inventario em uma string
        for (Item item : inventário) {
            lista += ", " + item.getNome(); 
        }
        
        // retira a primeira virgula na frente de lista
        if (!lista.isEmpty()) {
            lista = lista.substring(2); 
        }

        if (lista == ""){
            lista = "nenhum";
        }

        return "O inventário de limite " + limiteInventário +
                " contém os seguintes itens: " + lista;
    }

    /**
     * Adiciona um item na lista e retorna True em caso de sucesso
     */
    public boolean adicionarItem (Item item_a_adicionar) {
        //checa se jogador já tem um item grande
        for (Item item : inventário) {
            if (item.getItemGrande()) { //checa se tem algum item grande no inventário
                return false;
            }
        }
        //adiciona o item
        inventário.add(item_a_adicionar);
        return true;
    }


    /**
     * Acessa e retorna o item procurado por nome
     */
    public Item acessarItem(String nome) {
        for (Item item : inventário) {
            if (item.getNome().equals(nome)) {
                //retorna o item se ele era o procurado
                return item; 
            }
        }
        //retorna null se o nome do item não foi achado no inventário
        return null; 
    }
    
    /**
     * Remove um item procurado por sua String nome
     */
    public void removerItem(String nome) {
        Iterator<Item> iterator = inventário.iterator();
        while (iterator.hasNext()) { //percorre iterator até achar o cujo nome é igual ao dado
            Item item = iterator.next();
            if (item.getNome().equals(nome)) {
                iterator.remove(); //remove item
            }
        }
    }

    /**
     * Método para imprimir todos os itens no inventárrio.
     */
    public void listarInventário(){
        for (int i = 0; i < inventário.size(); i++) {
            System.out.print(inventário.get(i));
        
            //adiciona vírgula entre os itens listados
            if (i < inventário.size() - 1) {
                System.out.print(", "); 
            }
        }
        
        //printa uma linha nova
        System.out.println();
    }


}



import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class Inventário {
    
    protected int limiteDeItens;
    protected List<Item> itens;

    /**
     * Constructs an Inventário object.
     * 
     * @param limiteInventario   quantidade de itens que cabem no inventário
     * @param inventario         lista de Itens no invetário
     */

    public Inventário(int limiteDeItens, List<Item> itens) {
        this.limiteDeItens = limiteDeItens;
        this.itens = (itens != null) ? itens : new ArrayList<>();
    }

    /**
     * Returns the limit of the inventary
     * 
     * @return inventary's limit
     */
    public int getLimiteDeItens() {
        return limiteDeItens;
    }

        /**
     * Returns the inventary
     * 
     * @return the inventary
     */
    public List<Item> getItens() {
        return itens;
    }

        /**
     * Sets the inventary limit
     */
    public void setLimiteDeItens(int l) {
        this.limiteDeItens = l;
    }

        /**
     * Sets the bonus power of the item
     */
    public void setItens (List<Item> i) {
        this.itens = i;
    }



    /**
     * prints the class and its atributes
     */
    public String toString() {
        String lista = ""; //inicializa lista
        
        //junta todos os itens na lista inventario em uma string
        for (Item item : itens) {
            lista += ", " + item.getNome()+ " de bônus "+ item.getBonusPoder()+ " e valor " + item.getValor(); 
        }
        // retira a primeira virgula na frente de lista
        if (!lista.isEmpty()) {
            lista = lista.substring(2); 
        }
        if (lista == ""){
            lista = "nenhum";
        }

        return "O inventário de limite " + limiteDeItens +
                " contém os seguintes itens: " + lista;
    }

    /**
     * Adiciona um item na lista e retorna True em caso de sucesso
     */
    public boolean adicionarItem (Item item_a_adicionar) {
        //checa se jogador já tem um item grande
        if (itens == null) {
            itens = new ArrayList<>();
            itens.add(item_a_adicionar);
            return true;
        }
        for (Item item : itens) {
            if (item.getItemGrande()== true) { 
                System.out.println("Não é possível adicionar 2 itens grandes no inventário.");//checa se tem algum item grande no inventário
                return false;
            }
        }
        //adiciona o item
        itens.add(item_a_adicionar);
        return true;
    }


    /**
     * Acessa e retorna o item procurado por nome
     */
    public Item acessarItem(String nome) {
        for (Item item : itens) {
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
        Iterator<Item> iterator = itens.iterator();
        while (iterator.hasNext()) { //percorre iterator até achar o cujo nome é igual ao dado
            Item item = iterator.next();
            if (item.getNome().equals(nome)) {
                iterator.remove(); //remove item
            }
        }
    }

    /**
     * Remove todos os itens do inventário
     */
    public void removerItem(List<String> nomes) {    
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            iterator.remove();
        }
    }
    
    /**
     * Método para imprimir todos os itens no inventárrio.
     */
    public void listarItens(){
        for (int i = 0; i < itens.size(); i++) {
            System.out.print(itens.get(i));
        
            //adiciona vírgula entre os itens listados
            if (i < itens.size() - 1) {
                System.out.print(", "); 
            }
        }
        
        //printa uma linha nova
        System.out.println();
    }


}



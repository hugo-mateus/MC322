import java.util.List;
import java.util.Scanner;


public class Masmorra {
    private List<Monstro> monstros;
    private BauDeTesouros tesouros;

/**
     * Constructs an Masmorra object.
     * 
     * @param monstros   lista de monstros na masmorra
     * @param tesouros   tesouros nos baús na masmorra
     */


    public Masmorra(List<Monstro> monstros, BauDeTesouros tesouros ) {
        this.monstros = monstros;
        this.tesouros = tesouros;
    }

    /**
     * Returns the list of the monsters
     * 
     * @return monster's list
     */
    public List<Monstro> getMonstros() {
        return monstros;
    }

    /**
     * Returns the tresures in the chest
     * 
     * @return chests's tresures
     */
    public BauDeTesouros getTesouros() {
        return tesouros;
    }
    
    /**
     * Sets the monsters list
     */
    public void setMonstros(List<Monstro> m) {
        this.monstros = m;
    }

    /**
     * Sets the tresures in the chest
     */
    public void setTesouros(BauDeTesouros t) {
        this.tesouros = t;
    }

    /**
     * prints the class and its atributes
     */
    public String toString() {
        //inicializa lista
        String listaMonstros = "";

        //junta todos os itens na lista em uma string
        for (Monstro monstro : monstros) {
            listaMonstros += ", " + monstro.getNome(); 
        }
        
        // retira a primeira virgula na frente de lista
        if (!listaMonstros.isEmpty()) {
            listaMonstros = listaMonstros.substring(2); 
        }
        
        if (listaMonstros == ""){
            listaMonstros = "nenhum";
        }
        return "A masmorra contém os seguintes monstros" + listaMonstros+ "!";
    }

    /**
     * Começa batalha contra Monstro com a função do CampoDeBatalha batalharContraMonstro, muda
     * o inventário do jogador em caso de vencer a batalha e em caso de derrota, muda o nível do jogador
     */
    public void abrirPortaMonstro (Monstro monstro, Jogador jogador, BauDeTesouros bau){
        CampoDeBatalha campo = new CampoDeBatalha();
        CampoDeBatalha.Resultado resultado = campo.batalharContraMonstro(monstro, jogador); 

        if (resultado == CampoDeBatalha.Resultado.VITORIA){ 
            if(bau == null || bau.getItens() == null || bau.getItens().isEmpty()){
                System.out.println("Monstro está sem itens.");
            }
            else{
                int tesouros = monstro.getTesouros(); //acha quantidade de tesouros que será dado ao jogador
                List<Item> listaBau = bau.pegarItensAleatórios(tesouros, jogador); //escolhe os itens do bau
                jogador.getInventário().getItens().addAll(listaBau); // adiciona itens ao inventario do jogador
            }
        }
        if (resultado == CampoDeBatalha.Resultado.DERROTA){
            int nivelJogador = jogador.getNivel();
            int niveisPerdidos = monstro.getNíveisPerdidos();
            nivelJogador -= niveisPerdidos; //calcula novo nível do jogador após perder
            jogador.setNivel(nivelJogador);
        }
    }

    /**
     * Dá escolha ao jogador de 2 itens aleatórios do baú, então 
     * coloca no inventário o item escolhido e o retira do baú.
     */
    public void abrirPortaItem (BauDeTesouros bau, Jogador jogador){
        System.out.println("Você abre o baú e vê os seguintes itens:\n");
        //lista itens no baú
        bau.listarItens();
        System.out.println("Qual deles você escolhe?");
        Scanner scanner = new Scanner(System.in);
        String tesouro = scanner.nextLine();
        if (bau.acessarItem(tesouro, jogador) == null){ 
            //se algo deu errado no acesso do item, ie. se ele não existe ou se inventário ta cheio
            System.out.println("Não foi possível adicionar ao inventário.");
        }
        else{
            System.out.println("Adicionado ao inventário!");
            System.out.println("Pressione qualquer tecla para continuar...");
            scanner.nextLine();
        scanner.close();
        }
    }   
}
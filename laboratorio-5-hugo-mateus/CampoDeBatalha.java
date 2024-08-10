
import java.util.Random;

public class CampoDeBatalha {
    

    /**
     * Batalha contra um monstro. Compara o nível dos dois para ver quem vence, caso for
     * o jogador, o transfere os tesouros do monstro. Caso perder, tem a chance de fugir ao rodar um d6
     * caso de derrota: perde niveis conforme o monstro
     */
    public Resultado batalharContraMonstro(Monstro monstro, Jogador jogador){
        //caso para se o jogador ganhou
        if(jogador.getNivel() >= monstro.getPoder()){
            System.out.println("A batalha começa, seus ataques são certeiros, a criatura consegue "+
            "te atingir, mas você é mais forte que ela. Logo, você percebe a vida saindo dos olhos daquele monstro horrendo "+
            "seu corpo está no chão e seu itens agora são seus!");
            return Resultado.VITORIA; 
        }    
        //tenta fugir
        System.out.println("Você tenta lutar, mas a criatura está te machucando muito, você começa "+
        "a se desesperar e percebe que sua chance de sobrevivência está em tentar fugir, boa sorte!\n");
        Random aleatorio = new Random();
        int dadoFugir = aleatorio.nextInt(6); //roda d6 pra fugir
        if (dadoFugir >= 5){
            System.out.println("A adrenalina te faz correr mais rápido do que você achava ser possível "+
            "você percorre os corredores da masmorra e percebe que não ouve mais os sons da criaura horrenda."+
            " Você conseguiu fugir!");
            return Resultado.FUGA;
        }
        //caso de derrota
        System.out.println("Você tenta fugir, mas a criatura é mais rápida, mais forte, mais inteligente "+
        "a masmorra é seu domínio e ela não te deixará sair ileso. Você perdeu a batalha e no processo perdeu "+
        monstro.getNíveisPerdidos()+ " nível(is)");
        return Resultado.DERROTA;
    }


public enum Resultado{
        VITORIA,
        DERROTA,
        FUGA
    }
}
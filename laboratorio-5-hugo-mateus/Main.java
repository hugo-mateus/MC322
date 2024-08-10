public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();

        IArquivo leitorJogadores = new LerJogadores();
        leitorJogadores.lerArquivo(jogo, "Jogadores.xml");

        IArquivo leitorMonstros = new LerMonstros();
        leitorMonstros.lerArquivo(jogo, "Monstros.xml");

        IArquivo leitorItens = new LerItens();
        leitorItens.lerArquivo(jogo, "Itens.xml");
        

        Inventário inventário = new Inventário(10000, jogo.getItens());
        BauDeTesouros bauDeTesouros = BauDeTesouros.getInstance(inventário);
        Masmorra masmorra = new Masmorra(jogo.getMonstros(), bauDeTesouros);

        jogo.setBauDeTesouros(bauDeTesouros);
        jogo.setMasmorra(masmorra);

        Jogador jogador = jogo.getJogadores().get(0);
        JogadorView jogadorView = new JogadorView();
        JogadorController jogadorController = new JogadorController(jogador, jogadorView);

        MasmorraView masmorraView = new MasmorraView();
        MasmorraController masmorraController = new MasmorraController(masmorra, masmorraView);

        jogadorController.updateView();
        masmorraController.updateView();

        jogo.loopDeJogo();
    }
}






































































































































































//estudar cm manejar tanto arquivo
//estudar cm debuggar essa coisinha lindinha direito
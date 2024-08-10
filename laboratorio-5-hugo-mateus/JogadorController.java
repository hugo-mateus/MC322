public class JogadorController {
    private Jogador jogador;
    private JogadorView view;

    public JogadorController(Jogador jogador, JogadorView view) {
        this.jogador = jogador;
        this.view = view;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public void setJogadorNome(String nome) {
        jogador.setNome(nome);
    }

    public String getJogadorNome() {
        return jogador.getNome();
    }

    public void setJogadorNivel(int nivel) {
        jogador.setNivel(nivel);
    }

    public int getJogadorNivel() {
        return jogador.getNivel();
    }

    public void updateView() {
        view.displayJogadorDetails(jogador.getNome(), jogador.getNivel(), jogador.getRaça(), jogador.getClasse(), jogador.getInventário().getItens());
    }
}

import java.util.List;

public class MasmorraController {
    private Masmorra masmorra;
    private MasmorraView view;

    public MasmorraController(Masmorra masmorra, MasmorraView view) {
        this.masmorra = masmorra;
        this.view = view;
    }

    public void setMonstros(List<Monstro> monstros) {
        masmorra.setMonstros(monstros);
    }

    public List<Monstro> getMonstros() {
        return masmorra.getMonstros();
    }

    public void setTesouros(BauDeTesouros tesouros) {
        masmorra.setTesouros(tesouros);
    }

    public BauDeTesouros getTesouros() {
        return masmorra.getTesouros();
    }

    public void updateView() {
        view.displayMasmorraDetails(masmorra.getMonstros(), masmorra.getTesouros().getItens());
    }
}

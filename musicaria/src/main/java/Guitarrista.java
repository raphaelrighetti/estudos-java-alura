import java.util.ArrayList;
import java.util.List;

public class Guitarrista extends Musico implements TocaMusicas {

    private Tocador tocador = new Tocador();
    private List<String> musicas = new ArrayList<String>();

    public Guitarrista(String nome, int idade, boolean drogado) {
        super(nome, idade, drogado, "Guitarra");
    }

    @Override
    public String toca(int index) {
        return tocador.toca(this, musicas.get(index));
    }

    @Override
    public List<String> listaMusicas() {
        return tocador.listaMusicas(musicas);
    }

    public void adicionaMusica(String musica) {
        musicas.add(musica);
    }

    public void removeMusicas() {
        musicas.removeAll(musicas);
    }
}

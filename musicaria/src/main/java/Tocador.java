import java.util.List;

public class Tocador {

    public String toca(Musico musico, String musica) {
        return "Meu nome é " +
                musico.getNome() +
                " e estou tocando "
                + musica;
    }

    public List<String> listaMusicas(List<String> musicas) {
        return musicas;
    }
}

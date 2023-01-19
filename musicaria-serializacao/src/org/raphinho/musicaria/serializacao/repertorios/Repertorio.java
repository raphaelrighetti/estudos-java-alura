package org.raphinho.musicaria.serializacao.repertorios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Repertorio implements Serializable {

    private final List<String> musicas = new ArrayList<>();

    public String getMusica(int index) {
        return musicas.get(index);
    }

    public List<String> getMusicas() {
        return musicas;
    }

    public void addMusica(String musica) {
        this.musicas.add(musica);
    }

    public void removeMusica(int index) {
        this.musicas.remove(index);
    }
}

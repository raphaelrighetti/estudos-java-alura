import java.util.ArrayList;
import java.util.List;

public class Testando {

    public static void main(String[] args) {
        Guitarrista raphael = new Guitarrista("Raphael", 20, false);

        raphael.adicionaMusica("Moon Undah Water");
        raphael.adicionaMusica("Querido Meu Amor");

        System.out.println(raphael.getNome());
        System.out.println(raphael.toca(1));
        System.out.println(raphael.listaMusicas());
    }
}

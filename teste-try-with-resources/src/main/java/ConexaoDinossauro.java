public class ConexaoDinossauro {

    public ConexaoDinossauro() {
        System.out.println("Conexão aberta");
        throw new IllegalStateException("deu ruim pq o estado n ta certo n");
    }

    public void readData() {
        System.out.println("Lendo dados");
    }

    public void close() {
        System.out.println("Conexão fechada");
    }
}

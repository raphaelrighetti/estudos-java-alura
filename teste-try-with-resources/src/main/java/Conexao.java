public class Conexao implements AutoCloseable{

    public Conexao() {
        System.out.println("Conexão aberta");
    }

    public void readData() {
        System.out.println("Lendo dados");
        throw new IllegalStateException("deu ruim pq o estado n ta certo n");
    }

    @Override
    public void close() {
        System.out.println("Conexão fechada");
    }
}

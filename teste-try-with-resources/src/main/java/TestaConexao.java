public class TestaConexao {

    public static void main(String[] args) {
        try (Conexao conexao = new Conexao()) {
            conexao.readData();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}

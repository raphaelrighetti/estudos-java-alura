public class TestaConexaoDinossauro {

    public static void main(String[] args) {
        ConexaoDinossauro conexaoDinossauro = null;
        try {
            conexaoDinossauro = new ConexaoDinossauro();
            conexaoDinossauro.readData();
        } catch(IllegalStateException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Entrou no finally");
            if (conexaoDinossauro != null) {
                conexaoDinossauro.close();
            }
        }
    }
}

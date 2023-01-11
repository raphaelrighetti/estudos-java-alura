public abstract class Musico {

    private String nome;
    private int idade;
    private boolean drogado;
    private String instrumento;

    public Musico(String nome, int idade, boolean drogado, String instrumento) {
        this.nome = nome;
        this.idade = idade;
        this.drogado = drogado;
        this.instrumento = instrumento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isDrogado() {
        return drogado;
    }

    public void setDrogado(boolean drogado) {
        this.drogado = drogado;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }
}

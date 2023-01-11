public enum Prioridade {

    MIN(1),NORMAL(5),MAX(10);

    private int value;

    Prioridade(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

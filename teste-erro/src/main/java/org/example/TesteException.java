package org.example;

public class TesteException {

    public static void main(String[] args) {
        try {
            metodo2();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("continuei vivo");
    }

    public static void metodo1() throws MinhaExceptionChecked {
        throw new MinhaExceptionChecked("deu ruim aqui");
    }
    public static void metodo2() {
        throw new MinhaExceptionUnchecked("deu ruim no metodo 2");
    }
}

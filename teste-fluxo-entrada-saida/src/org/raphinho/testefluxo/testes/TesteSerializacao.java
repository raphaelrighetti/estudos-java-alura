package org.raphinho.testefluxo.testes;

import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) {
        String nome = "Pedro de Alcântara João Carlos Leopoldo Salvador Bibiano Francisco Xavier de Paula Leocádio Miguel Gabriel Rafael Gonzaga de Bragança e Bourbon";

//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"))) {
//            oos.writeObject(nome);
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"))) {
            String nomeLido = (String) ois.readObject();
            System.out.println(nomeLido);
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}

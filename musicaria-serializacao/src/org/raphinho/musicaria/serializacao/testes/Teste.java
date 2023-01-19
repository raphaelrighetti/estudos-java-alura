package org.raphinho.musicaria.serializacao.testes;

import org.raphinho.musicaria.serializacao.musicos.Baixista;
import org.raphinho.musicaria.serializacao.repertorios.Repertorio;

import java.io.*;

public class Teste {

    public static void main(String[] args) {
        Baixista raphael = new Baixista("Raphael", 20, false);
        Repertorio repertorio = new Repertorio();

        repertorio.addMusica("As It Was");
        repertorio.addMusica("pouring outside");
        repertorio.addMusica("Piano Girl");
        raphael.setRepertorio(repertorio);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializado.bin"))) {
            oos.writeObject(raphael);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serializado.bin"))) {
            Baixista raphaelLido = (Baixista) ois.readObject();

            System.out.println(raphaelLido.getRepertorio().getMusicas());
            System.out.println(raphaelLido.doSlap(2));
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}

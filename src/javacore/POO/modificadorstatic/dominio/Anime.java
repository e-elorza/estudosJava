package javacore.POO.modificadorstatic.dominio;

import java.sql.SQLOutput;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Anime criado com 100 eps (BLOCO INIT)");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime() {
    }


    public Anime(String nome) {
        this.nome = nome;
    }

    public void print() {
        System.out.println(this.nome);
        for (int eps : episodios) {
            System.out.print(eps + " ");
        }
        System.out.println("\n");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}

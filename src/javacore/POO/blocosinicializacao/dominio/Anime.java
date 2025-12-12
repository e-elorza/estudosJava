package javacore.POO.blocosinicializacao.dominio;

public class Anime {
    String nome;
    private int[] episodios;
    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
            System.out.print(episodios[i] + " ");
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }
}

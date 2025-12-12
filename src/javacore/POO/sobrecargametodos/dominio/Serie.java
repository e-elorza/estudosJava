package javacore.POO.sobrecargametodos.dominio;

public class Serie {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;


    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String genero) {
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    public void print() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return this.tipo;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public String getGenero() {
        return genero;
    }


}

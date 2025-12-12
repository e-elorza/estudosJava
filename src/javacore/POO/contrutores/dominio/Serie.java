package javacore.POO.contrutores.dominio;

public class Serie {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String streaming;

        public Serie(String nome, String tipo, int episodios, String genero){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Serie(String nome, String tipo, int episodios, String genero, String streaming){
        this(nome, tipo, episodios, genero);
        this.streaming = streaming;
    }

    public void print() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.streaming);

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

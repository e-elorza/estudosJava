package javacore.POO.introducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public String curso;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.curso);
    }
}

package Entidades;

public class Criança {
    private String nome;
    private int idade;
    private Adulto responsavel;

    public Criança(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Criança(String nome, int idade, Adulto responsavel) {
        this.nome = nome;
        this.idade = idade;
        this.responsavel = responsavel;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Adulto getResponsavel() {
        return responsavel ;
    }
}
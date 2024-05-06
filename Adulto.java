package Entidades;

public class Adulto {
  public int idade_minima = 0;

    public Adulto(String nome_adulto, int i) {
        this.nome_adulto = nome_adulto;
    }

    public String getNome_adulto() {
        return nome_adulto;
    }

    public void setNome_adulto(String nome_adulto) {
        this.nome_adulto = nome_adulto;
    }

    public String nome_adulto;

    public Adulto(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    private int idade;

    }


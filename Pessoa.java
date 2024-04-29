package Entidade;

public class Pessoa {
    public String nome;
    public String conjugue;
    public String filhos;

    public String getNome() {


        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConjugue() {
        return conjugue;
    }

    public void setConjugue(String conjugue) {
        this.conjugue = conjugue;
    }

    public String getFilhos() {
        return filhos;
    }

    public void setFilhos(String filhos) {
        this.filhos = filhos;
    }

    public Pessoa(String nome) {
        System.out.println(nome);
        System.out.println(conjugue);
        System.out.println(filhos);
    }
    public String addConjugue(String conjugue) {
        System.out.println(conjugue);
        return conjugue;
    }
    public String addFilhos(String filhos) {
        System.out.println(filhos);
        return filhos;
    }
    public void printArvoreFamiliar(int i){
        System.out.println();
    }
}

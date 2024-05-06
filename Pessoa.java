
package Entidade;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private Pessoa conjuge;
    private List<Pessoa> filhos;
    private Pessoa pai;

    public Pessoa(String nome) {
        this.nome = nome;
        this.filhos = new ArrayList<>();
    }

    public Pessoa(String nome, Pessoa pai) {
        this(nome);
        this.pai = pai;
        if (pai != null) {
            pai.adicionarFilhos(this);
        } //Método para verificar se a pessoa possui filho ou não
    }

    public void adicionarFilhos(Pessoa filho) {
        this.filhos.add(filho);
    }

    public void adicionarConjuge(Pessoa conjuge) {
        this.conjuge = conjuge;
        if (conjuge != null && conjuge.conjuge != this) {
            conjuge.adicionarConjuge(this);
        } // Método para verificar se há conjuge e adicioná-lo ou não
    }

    public void imprimirArvoreGenealogica(int nivel) {
        for (int i = 0; i < nivel; i++) {
            System.out.print("  ");
        }
        System.out.println(nome);
        if (conjuge != null) {
            for (int i = 0; i < nivel; i++) {
                System.out.print("  ");
            }
            System.out.println("-- Casado(a) com: " + conjuge.nome);
        } else {
            System.out.println("-- Solteiro(a) ");
        }
            for (Pessoa filho : filhos) {
                System.out.printf("-- Filhos:");
                filho.imprimirArvoreGenealogica(nivel + 1);
            } // Impressão da árvore familiar de forma recursiva
        }
    }


package Entidades;

import java.util.List;

public class Roda_Gigante {
    private List<String> cabine;
     public int capacidade;



    public void board(int i, Criança joao) {
    }

    public void status() {
        if(cabine != null){
            System.out.println("Cheio");
        }
        else{
            System.out.println("Vazio");
        }   //Informa o status atual da cabine
    }
    public void quadro(int i, Criança nome) {
        int proximaCabineLivre = encontrarProximaCabine();
        if (proximaCabineLivre == 0) {
            proximaCabineLivre = Integer.parseInt((nome.getNome()));
            System.out.println(proximaCabineLivre);
        }
        else {
            System.out.println("Desculpe, não há gôndolas disponíveis.");
        }
    }
    private int encontrarProximaCabine() {
        for (int i = 0; i < capacidade; i++) {
            if (cabine.get(i) == null) {
                return i; // Retorna o índice da próxima gôndola livre
            }
        }
        return -1; // Retorna -1 se não houver gôndolas disponíveis
    }
    }




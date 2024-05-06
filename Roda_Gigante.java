package Entidades;

public class Roda_Gigante {
     public String cabine;
     public int capacidade;



    public void board(int i, Criança joao) {
    }

    public void status() {
        if(cabine != null){
            System.out.println("Cheio");
        }
        else{
            System.out.println("Vazio");
        }
    }
    public void quadro(int i, Criança nome) {
        int proximaCabineLivre = encontrarProximaCabine();
        if (proximaCabineLivre != -1) {
            cabine.isEmpty();
        } else {
            System.out.println("Desculpe, não há gôndolas disponíveis.");
        }
    }

    private int encontrarProximaCabine() {
        for (int i = 0; i < capacidade; i++) {
            if (cabine.length(i) == null) {
                return i; // Retorna o índice da próxima gôndola livre
            }
        }
        return -1; // Retorna -1 se não houver gôndolas disponíveis
    }
    }




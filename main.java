
import Entidade.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> Arvore = new ArrayList<String>();


        Pessoa lily = new Pessoa("Lily");
        lily.adicionarConjuge(new Pessoa("Wilhelm"));
        // Patriarch and matriarch
        Pessoa opa = new Pessoa("Opa", lily);
        opa.adicionarConjuge (new Pessoa("Oma"));
        // Children of Oma and Opa
        Pessoa reinhold = new Pessoa("Reinhold",opa);
        Pessoa wilma = new Pessoa("Wilma", opa);
        Pessoa sigrid = new Pessoa("Sigrid", opa);
        // Children and spouse of Reinhold
        reinhold.adicionarConjuge(new Pessoa("Sonia"));
        Pessoa christian = new Pessoa("Christian", reinhold);
        Pessoa gabrielle = new Pessoa("Gabrielle", reinhold);
        Pessoa sabine = new Pessoa("Sabine", reinhold);
        // Children and spouse of Wilma
        wilma.adicionarConjuge(new Pessoa("Rodolfo"));
        Pessoa ricardo = new Pessoa("Ricardo", wilma);
        Pessoa rodrigo = new Pessoa("Rodrigo", wilma);
        // Ricardo and spouse
        ricardo.adicionarConjuge(new Pessoa("Debora"));
        // Children and spouse of Christian
        christian.adicionarConjuge(new Pessoa("Monica"));
        Pessoa oscar = new Pessoa("Oscar", christian);
        Pessoa lorena = new Pessoa("Lorena", christian);
        // Children and spouse of Sigrid
        sigrid.adicionarConjuge(new Pessoa("Peter"));
        Pessoa martin = new Pessoa("Martin", sigrid);
        Pessoa thomas = new Pessoa("Thomas", sigrid);
        Pessoa claudia = new Pessoa("Claudia", sigrid);
        martin.adicionarConjuge(new Pessoa("Carla"));
        martin.adicionarFilhos(new Pessoa("Nicolas"));
        lily.imprimirArvoreGenealogica(0);


    }
}








import Entidade.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> Arvore = new ArrayList<String>();


        Pessoa lily = new Pessoa("Lily");
        lily.addConjugue(String.valueOf(new Pessoa("Wilhelm")));
        // Patriarch and matriarch
        Pessoa opa = new Pessoa("Opa");
        lily.addFilhos(String.valueOf(opa));
        Pessoa oma = new Pessoa("Oma");
        opa.addConjugue(String.valueOf(oma));
        // Children of Oma and Opa
        Pessoa reinhold = new Pessoa("Reinhold");
        Pessoa wilma = new Pessoa("Wilma");
        Pessoa sigrid = new Pessoa("Sigrid");
        opa.addFilhos(String.valueOf(reinhold));
        // Children and spouse of Reinhold
        reinhold.addConjugue(String.valueOf(new Pessoa("Sonia")));
        Pessoa christian = new Pessoa("Christian", reinhold);
        Pessoa gabrielle = new Pessoa("Gabrielle", reinhold);
        Pessoa sabine = new Pessoa("Sabine", reinhold);
        // Children and spouse of Wilma
        wilma.addConjugue(String.valueOf(new Pessoa("Rodolfo")));
        Pessoa ricardo = new Pessoa("Ricardo", wilma);
        Pessoa rodrigo = new Pessoa("Rodrigo", wilma);
        // Ricardo and spouse
        ricardo.addConjugue(String.valueOf(new Pessoa("Debora")));
        // Children and spouse of Christian
        christian.addConjugue(String.valueOf(new Pessoa("Monica")));
        Pessoa oscar = new Pessoa("Oscar", christian);
        Pessoa lorena = new Pessoa("Lorena", christian);
        // Children and spouse of Sigrid
        sigrid.addConjugue(String.valueOf(new Pessoa("Peter")));
        Pessoa martin = new Pessoa("Martin", sigrid);
        Pessoa thomas = new Pessoa("Thomas", sigrid);
        Pessoa claudia = new Pessoa("Claudia", sigrid);
        martin.addConjugue(String.valueOf(new Pessoa("Carla")));
        martin.addFilhos((new Pessoa("Nicolas"));
        lily.printArvoreFamiliar(0);

     {
            if ( lily.conjugue!= null) {
                System.out.println("É casado(a) com: " + ((i)));
            }
            else {
                System.out.println("");
            }
        }
    }
}

import Entidades.Adulto;
import Entidades.Criança;
import Entidades.Roda_Gigante;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Roda_Gigante rodaGigante = new Roda_Gigante(); // Creating a new Ferris wheel
        Adulto paulo = new Adulto("Paulo", 42); // Adult named Paulo
        // Paulo's children
        Criança joao = new Criança("Joao", 5, paulo); // New child with Paulo as the father
        Criança maria = new Criança("Maria", 12, paulo); // This is Paulo's daughter
        // Child without defined father
        Criança pedro = new Criança("Pedro", 13, paulo);
        Criança henrique = new Criança("Henrique", 10, paulo);
        /*
         * Now comes the fun part. A rule has been created in the park:
         * - Children under 12 years old can only ride accompanied by their father!
         */
        rodaGigante.quadro(2, joao); // ERROR: Joao is under 12 and the father is not present
        rodaGigante.quadro(2, joao); // OK: Now the father is present
        rodaGigante.quadro(3, maria); // OK: Maria is 12 years old and can ride alone
        rodaGigante.quadro(13, pedro); // OK: Pedro rides alone
        rodaGigante.quadro(16, henrique); // ERROR: Henrique is under 12 and we don't know who the father is (should be Silvio, but he didn't assume responsibility!)
        rodaGigante.status();


        }
    }

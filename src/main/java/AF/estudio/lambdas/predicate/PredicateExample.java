package AF.estudio.lambdas.predicate;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        /*
        Expresion Predicate
        Recibe un valor y devuelve un booleano (true o false).
         */

        // Manera de utilizar la funcion lambda
        /*
        Predicate<String> predicate = (str)->{
            return str.length() > 5;
        };
        */

        Predicate<String> predicate = (str)-> str.length() > 5;

        boolean result = predicate.test("Hola Mundo");
        System.out.println(result);
    }
}

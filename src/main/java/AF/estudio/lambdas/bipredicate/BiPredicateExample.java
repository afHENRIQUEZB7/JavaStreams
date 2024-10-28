package AF.estudio.lambdas.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {
        /*
            Expresion BiPredicate
            Recibe dos valores y devuelve un booleano (true o false).
        */

        // Manera de utilizar la funcion lambda
        /*
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> {
            return a < b;
        };
        */

        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a < b;


        boolean result = biPredicate.test(10, 5);
        System.out.println(result);

    }
}

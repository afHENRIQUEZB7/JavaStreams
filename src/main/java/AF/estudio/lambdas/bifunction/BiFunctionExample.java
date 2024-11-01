package AF.estudio.lambdas.bifunction;

import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {

        /*
        Expresion BiFunction
        Recibe dos valores y retorna un resultado.
         */

        // Manera de utilizar la funcion lambda
        /*
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> {
            return a + b;
        };
         */

        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;

        int result = biFunction.apply(10, 20);
        System.out.println(result);
    }
}

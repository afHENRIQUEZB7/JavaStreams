package AF.estudio.lambdas.function;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        /*
        Expresión Function
        Recibe un valor y retorna un resultado.
         */

        // Manera de utilizar la funcion lambda
        /*
        Function<Integer, String> function = (num) ->{
            return "El numero es: " + num;
        };
        */

        Function<Integer, String> function = (num) -> "El numero es: " + num;

        String result = function.apply(5);
        System.out.println(result);
    }
}

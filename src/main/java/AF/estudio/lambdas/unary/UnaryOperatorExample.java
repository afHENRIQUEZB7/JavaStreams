package AF.estudio.lambdas.unary;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {
        /*
        Expresion UnaryOperator
        Recibe un valor, lo procesa y devuelve un resultado del mismo tipo.
        */

        // Manera de utilizar la funcion lambda
        /*
        UnaryOperator<Integer> unaryOperator = (number) -> {
            return number * number;
        };
        */

        UnaryOperator<Integer> unaryOperator = number -> number * number;
        int result = unaryOperator.apply(5);
        System.out.println(result);
    }
}

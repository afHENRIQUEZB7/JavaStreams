package AF.estudio.lambdas.binary;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {
        /*
        Expresion BinaryOperator
        Recibe dos valores del mismo tipo y retorna un valor del mismo tipo.
         */

        // Manera de utilizar la funcion lambda
        /*
        BinaryOperator<Integer> binaryOperator = (a, b) -> {
            return a + b;
        };
        */

        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;

        int result = binaryOperator.apply(10,20);
        System.out.println(result);

    }
}

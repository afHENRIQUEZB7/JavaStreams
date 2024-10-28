package AF.estudio.lambdas.Supplier;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        /*
        Expresion Supplier
        No recibe ningun valor, pero retorna un resultado.
         */

        // Manera de utilizar la funcion lambda
        /*
        Supplier<String> supplier = () -> {
            return "Hola soy un Supplier";
        };
        */

        Supplier<String> supplier = () -> "Hola soy un Supplier";

        System.out.println(supplier.get());

    }
}

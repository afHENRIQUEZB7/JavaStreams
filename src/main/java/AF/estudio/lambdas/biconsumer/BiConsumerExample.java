package AF.estudio.lambdas.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        /*
        la funcion Biconsumer
        Recibe dos valores y no retorna nada.
        */

        // Manera de utilizar la funcion lambda
        /*
        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println(a + " " + b);
        };
        */

        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println(a + " " + b);

        biConsumer.accept("Hola", "Mundo");
    }
}

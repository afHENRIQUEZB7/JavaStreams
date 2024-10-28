package AF.estudio.lambdas.consumer;


import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        /*
        La funcion "Consumer"
        Recibe un valor y no retorna nada.
        */

        // Manera de utilizar la funcion lambda
        /*
        Consumer<String> consumer = (String param) -> {
            System.out.println(param);
        };
        */

        /*
        Consumer<String> consumer = (String param) -> System.out.println(param);
        */

        Consumer<String> consumer = System.out::println;

        consumer.accept("Andres Felipe Henriquez Bayona");

    }

}
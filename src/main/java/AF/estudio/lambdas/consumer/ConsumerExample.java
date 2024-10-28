package AF.estudio.lambdas.consumer;


import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        /*
        La funcion "Consumer"
        Recibe un valor y no retorna nada.
        */

        Consumer<String> consumer = (String param) -> {
            System.out.println(param);
        };

        consumer.accept("Andres Felipe Henriquez Bayona");

    }

}
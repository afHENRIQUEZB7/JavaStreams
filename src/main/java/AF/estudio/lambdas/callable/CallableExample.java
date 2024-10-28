package AF.estudio.lambdas.callable;

import java.util.concurrent.Callable;

public class CallableExample {
    public static void main(String[] args) {
        /*
        Expresion Callable
        No recibe valores, pero retorna un resultado y puede lanzar una excepción.
        */

        // Manera de utilizar la funcion lambda
        /*
        Callable<String> callable = () -> {
            return "Resultado de la tarea";
        };
        */

        Callable<String> callable = () ->  "Resultado de la tarea";

        try{
            String result = callable.call();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

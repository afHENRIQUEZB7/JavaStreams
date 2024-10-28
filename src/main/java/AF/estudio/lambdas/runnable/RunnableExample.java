package AF.estudio.lambdas.runnable;

public class RunnableExample {

    public static void main(String[] args) {
        /*
        Expresion Runnable
        No recibe valores y no retorna nada, solo ejecuta una tarea.
        */

        // Manera de utilizar la funcion lambda
        /*
        Runnable runnable = () -> {
            System.out.println("Ejecutando tarea...");
        };
        */

        Runnable runnable = () -> System.out.println("Ejecutando tarea...");

        runnable.run();
    }
}

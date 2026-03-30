import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        while (true) {
            System.out.println("**** Aplicacion Calculadora ****");
            mostrarMenu();

            System.out.println("Operacion a realizar? ");
            try {

                var operacion = Integer.parseInt(consola.nextLine());
                // Revisar que este dentro de las opciones mencionadas

                if (operacion >= 1 && operacion <= 4) {
                    // Ejecutamos la operacion deseada
                    ejecutarOperacion(operacion, consola);

                } else if (operacion == 5) {
                    System.out.println("Hasta Pronto...");
                    break;
                } else {
                    System.out.println(("Opcion erronea: " + operacion));
                }
                // Imprimimos un salto antes de repetir el ciclo
                System.out.println();
            }//fin try
            catch (Exception e){
                System.out.println("Ocurrio un error: "+ e.getMessage());
                System.out.println();
            }
        }//fin while
    }//fin main

    private static void mostrarMenu(){

        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    """);
    }

    private static void ejecutarOperacion(int operacion, Scanner consola){
        System.out.println("proporciona valor operando 1: ");
        var operando1 = Double.parseDouble(consola.nextLine());

        System.out.println("proporciona valor operando 2: ");
        var operando2 = Double.parseDouble(consola.nextLine());

        double resultado;

        switch (operacion) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("Resultado Suma: " + resultado);
            }

            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("Resultado Resta: " + resultado);
            }

            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("Resultado multiplicacion: " + resultado);
            }

            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("Resultado Division: " + resultado);
            }

            default -> {
                System.out.println("Opcion erronea: " + operacion);
            }
        }
    }
}//fin clase

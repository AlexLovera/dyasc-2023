package fibo;
import java.util.Scanner;

public class EjercicioFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Generar serie de Fibonacci");
            System.out.println("2. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la cantidad de términos: ");
                    int cantidad = scanner.nextInt();
                    generarSerieFibonacci(cantidad);
                    break;
                case 2:
                    System.out.println("¡Hasta la proxima!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elige una opción válida.");
            }
        } while (opcion != 2);

        scanner.close();
    }

    public static void generarSerieFibonacci(int cantidad) {
        int primero = 0, segundo = 1;

        System.out.print("Serie de Fibonacci de " + cantidad + " términos:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(" " + primero);
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }

        System.out.println();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}

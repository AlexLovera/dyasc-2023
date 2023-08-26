package ar.edu.untref.dyasc.fibo2;

public class EjercicioFibonacci2 {
    public static void main(String[] args) {
        int cantidad = 0;
        char orientacion = 'h';
        char direccion = 'd';

        if (args.length < 1) {
            System.out.println("Faltan argumentos. Uso: java EjercicioFibonacci2 [-o=<orientacion+direccion>] <cantidad>");
            return;
        }

        if (args[0].startsWith("-o=")) {
            String opciones = args[0].substring(3);
            if (opciones.length() != 2) {
                System.out.println("Opciones no validas.");
                return;
            }
            orientacion = opciones.charAt(0);
            direccion = opciones.charAt(1);
            cantidad = Integer.parseInt(args[1]);
        } else {
            cantidad = Integer.parseInt(args[0]);
        }

        if (!(orientacion == 'h' || orientacion == 'v') || !(direccion == 'd' || direccion == 'i')) {
            System.out.println("Opciones no validas.");
            return;
        }

        generarSerieFibonacci(cantidad, orientacion, direccion);
    }

    public static void generarSerieFibonacci(int cantidad, char orientacion, char direccion) {
        int[] fibonacci = new int[cantidad];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        String input = String.valueOf(orientacion) + String.valueOf(direccion);

        System.out.println("fibo<"+cantidad+">:");

        for (int i = 2; i < cantidad; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        switch (input) {
            case "hd":
                for (int i = 0; i < cantidad; i++) {
                    System.out.print(fibonacci[i] + " ");
                }
                break;
            case "vd":
                for (int i = 0; i < cantidad; i++) {
                    System.out.println(fibonacci[i]);
                }
                break;
            case "hi":
                for (int i = cantidad - 1; i >= 0; i--) {
                    System.out.print(fibonacci[i] + " ");
                }
                break;
            case "vi":
                for (int i = cantidad - 1; i >= 0; i--) {
                    System.out.println(fibonacci[i] + " ");
                }
                break;
        }

        System.out.println(); // Imprime una línea vacía al final
    }
}

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



    public static long[] generarSerieFibonacci(int cantidadAGenerar) {
        if (cantidadAGenerar <= 0) {
            return new long[0];
        }

        long[] series = new long[cantidadAGenerar];
        series[0] = 0;
        if (cantidadAGenerar > 1) {
            series[1] = 1;
        }

        for (int i = 2; i < cantidadAGenerar; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }

        return series;
    }

    public static void imprimirSerieFibonacci(String opcionIngresada,long[] serieFibonacci,int cantidadElementosGenerados){
        switch (opcionIngresada) {
            case "hd":
                for (int i = 0; i < cantidadElementosGenerados; i++) {
                    System.out.print(serieFibonacci[i] + " ");
                }
                break;
            case "vd":
                for (int i = 0; i < cantidadElementosGenerados; i++) {
                    System.out.println(serieFibonacci[i]);
                }
                break;
            case "hi":
                for (int i = cantidadElementosGenerados - 1; i >= 0; i--) {
                    System.out.print(serieFibonacci[i] + " ");
                }
                break;
            case "vi":
                for (int i = cantidadElementosGenerados - 1; i >= 0; i--) {
                    System.out.println(serieFibonacci[i] + " ");
                }
                break;
        }
        System.out.println(); // Imprime una línea vacía al final
    }
}

package fibo;

public class EjercicioFibonacci {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Por favor, introduci un numero como argumento.");
            return;
        }

        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("El argumento debe ser un numero entero.");
            return;
        }

        long[] series = generarSerieFibonacci(n);
        System.out.print("fibo<" + n + ">: ");
        for (long num : series) {
            System.out.print(num + " ");
        }
        System.out.println();
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

}

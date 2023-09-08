package ar.edu.untref.dyasc.fibo2;

public class GeneradorFibonacci implements GeneradorSerie{
    @Override
    public long[] generarSerie(int cantidadAGenerar) {
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

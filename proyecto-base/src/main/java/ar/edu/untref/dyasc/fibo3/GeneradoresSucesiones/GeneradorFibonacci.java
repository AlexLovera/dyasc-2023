package ar.edu.untref.dyasc.fibo3.GeneradoresSucesiones;

import ar.edu.untref.dyasc.fibo3.Sumatoria;

public class GeneradorFibonacci implements GeneradorSerie {
    private static final long PRIMER_VALOR_FIBONACCI = 0;
    private static final long SEGUNDO_VALOR_FIBONACCI = 1;
    @Override
    public long[] generarSerie(int cantidadAGenerar) {
        if (cantidadAGenerar <= 0) {
            return new long[0];
        }

        long[] series = new long[cantidadAGenerar];
        series[0] = PRIMER_VALOR_FIBONACCI;
        if (cantidadAGenerar > 1) {
            series[1] = SEGUNDO_VALOR_FIBONACCI;
        }

        for (int i = 2; i < cantidadAGenerar; i++) {
            long terminoPrevio = series[i - 1];
            long segundoTerminoPrevio = series[i - 2];

            series[i] = terminoPrevio + segundoTerminoPrevio;
        }

        return series;
    }

    @Override
    public long calcularSumatoria(int cantidadElementos) {
        long[] serie = generarSerie(cantidadElementos);
        long sumatoria = 0;
        for(long num : serie) {
            sumatoria += num;
        }
        return sumatoria;
    }
}

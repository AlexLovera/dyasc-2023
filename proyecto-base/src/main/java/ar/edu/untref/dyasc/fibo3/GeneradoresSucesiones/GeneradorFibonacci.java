package ar.edu.untref.dyasc.fibo3.GeneradoresSucesiones;

import ar.edu.untref.dyasc.fibo3.Sumatoria;

public class GeneradorFibonacci implements GeneradorSerie {
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

package ar.edu.untref.dyasc.fibo3.Formateadores;

import ar.edu.untref.dyasc.fibo3.Configuracion;

public class FormateadorSucesiones implements Formateador{
    private static final String SEPARADOR_VERTICAL = "\n";
    private static final String SEPARADOR_HORIZONTAL = " ";
    public String formatear(long[] serie, Configuracion config) {
        if (config.getEsInversa()) {
            serie = invertirSerie(serie);
        }
        System.out.println(config.getEsInversa());
        if (config.getEsVertical()) {
            return formatearVerticalmente(serie);
        } else {
            return formatearHorizontalmente(serie);
        }
    }

    public String formatear(long suma){
        return Long.toString(suma);
    }

    private long[] invertirSerie(long[] serie) {
        long[] invertida = new long[serie.length];
        for(int i = 0; i < serie.length; i++) {
            invertida[i] = serie[serie.length - 1 - i];
        }
        return invertida;
    }

    private String formatearVerticalmente(long[] serie) {
        StringBuilder resultado = new StringBuilder();
        for (long valor : serie) {
            resultado.append(valor).append(SEPARADOR_VERTICAL);
        }
        return resultado.toString();
    }

    private String formatearHorizontalmente(long[] serie) {
        StringBuilder resultado = new StringBuilder();
        for (long valor : serie) {
            resultado.append(valor).append(SEPARADOR_HORIZONTAL);
        }
        return resultado.toString().trim();  // trim() para eliminar el último espacio
    }
}
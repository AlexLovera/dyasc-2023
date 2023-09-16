package ar.edu.untref.dyasc.fibo3.Formateadores;

import ar.edu.untref.dyasc.fibo3.Configuracion;

public interface Formateador {
    String formatear(long[] serie, Configuracion config);
    String formatear(long suma);
}
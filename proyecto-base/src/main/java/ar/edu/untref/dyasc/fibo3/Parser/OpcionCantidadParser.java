package ar.edu.untref.dyasc.fibo3.Parser;

import ar.edu.untref.dyasc.fibo3.Configuracion;

public class OpcionCantidadParser implements OpcionParser {

    @Override
    public boolean parse(String arg, Configuracion config) {
        try {
            int cantidad = Integer.parseInt(arg);
            if (cantidad >= 0) {
                config.setCantidadElementos(cantidad);
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
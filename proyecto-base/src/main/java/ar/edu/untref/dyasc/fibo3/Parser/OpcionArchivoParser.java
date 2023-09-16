package ar.edu.untref.dyasc.fibo3.Parser;

import ar.edu.untref.dyasc.fibo3.Configuracion;

import static ar.edu.untref.dyasc.fibo3.Constantes.OPCION_ARCHIVO_PREFIJO;

public class OpcionArchivoParser implements OpcionParser{
    @Override
    public boolean parse(String arg, Configuracion config) {
        if (arg.startsWith(OPCION_ARCHIVO_PREFIJO)) {
            config.setRutaArchivoSalida(arg.substring(3));
            return true;
        }
        return false;
    }
}

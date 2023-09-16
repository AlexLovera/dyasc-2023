package ar.edu.untref.dyasc.fibo3.Parser;

import ar.edu.untref.dyasc.fibo3.Configuracion;

public class OpcionArchivoParser implements OpcionParser{
    @Override
    public boolean parse(String arg, Configuracion config) {
        if (arg.startsWith("-f=")) {
            config.setRutaArchivoSalida(arg.substring(3));
            return true;
        }
        return false;
    }
}

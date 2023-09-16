package ar.edu.untref.dyasc.fibo3.Parser;

import ar.edu.untref.dyasc.fibo3.Configuracion;

public class OpcionOrientacionYDireccionParser implements OpcionParser{
    @Override
    public boolean parse(String argumento, Configuracion config) {
        if (argumento.startsWith("-o=") && argumento.length() == 5) {
            char orientacion = argumento.charAt(3);
            char direccion = argumento.charAt(4);

            if ((orientacion == 'v' || orientacion == 'h') && (direccion == 'i' || direccion == 'd')) {
                config.setOrientacion(orientacion);
                config.setDireccion(direccion);
                return true;
            }
        }
        return false;
    }
}

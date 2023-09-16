package ar.edu.untref.dyasc.fibo3.Parser;

import ar.edu.untref.dyasc.fibo3.Configuracion;

import static ar.edu.untref.dyasc.fibo3.Constantes.*;

public class OpcionOrientacionYDireccionParser implements OpcionParser{
    @Override
    public boolean parse(String argumento, Configuracion config) {
        if (argumento.startsWith(OPCION_DIREC_ORIENT_PREFIJO) && argumento.length() == 5) {
            char orientacion = argumento.charAt(3);
            char direccion = argumento.charAt(4);

            if ((orientacion == ORIENTACION_VERTICAL || orientacion == ORIENTACION_HORIZONTAL)
                    && (direccion == DIRECCION_INVERSA || direccion == DIRECCION_DIRECTA)) {
                config.setOrientacion(orientacion);
                config.setDireccion(direccion);
                return true;
            }
        }
        return false;
    }
}

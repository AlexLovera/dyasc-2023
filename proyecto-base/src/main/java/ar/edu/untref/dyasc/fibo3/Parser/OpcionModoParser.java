package ar.edu.untref.dyasc.fibo3.Parser;
import ar.edu.untref.dyasc.fibo3.Configuracion;

import static ar.edu.untref.dyasc.fibo3.Constantes.*;

public class OpcionModoParser implements OpcionParser{
    @Override
    public boolean parse(String arg, Configuracion config) {
        if (arg.startsWith(OPCION_MODO_PREFIJO)) {
            char modo = arg.charAt(3);
            if (modo == MODO_FUNCIONAMIENTO_LISTA || modo == MODO_FUNCIONAMIENTO_SUMA) {
                config.setModo(modo);
                return true;
            }
        }
        return false;
    }
}

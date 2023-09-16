package ar.edu.untref.dyasc.fibo3.Parser;
import ar.edu.untref.dyasc.fibo3.Configuracion;
public class OpcionModoParser implements OpcionParser{
    @Override
    public boolean parse(String arg, Configuracion config) {
        if (arg.startsWith("-m=")) {
            char modo = arg.charAt(3);
            if (modo == 'l' || modo == 's') {
                config.setModo(modo);
                return true;
            }
        }
        return false;
    }
}

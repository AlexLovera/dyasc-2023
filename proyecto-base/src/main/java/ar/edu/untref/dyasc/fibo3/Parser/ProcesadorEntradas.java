package ar.edu.untref.dyasc.fibo3.Parser;

import ar.edu.untref.dyasc.fibo3.Configuracion;

import java.util.List;

public class ProcesadorEntradas {
    private List<OpcionParser> parsers;

    public ProcesadorEntradas(List<OpcionParser> procesadoresPorOpcion){
        this.parsers = procesadoresPorOpcion;
    }

    public Configuracion procesar(String[] args) {
        Configuracion config = new Configuracion();
        for (String arg : args) {
            boolean parsed = false;
            for (OpcionParser parser : parsers) {
                if (parser.parse(arg, config)) {
                    parsed = true;
                    break;
                }
            }
            if (!parsed) {
                System.out.println("Opción no válida: " + arg);
                return null;
            }
        }
        return config;
    }
}

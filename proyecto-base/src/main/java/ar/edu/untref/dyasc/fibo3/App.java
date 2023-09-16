package ar.edu.untref.dyasc.fibo3;

import ar.edu.untref.dyasc.fibo3.Formateadores.Formateador;
import ar.edu.untref.dyasc.fibo3.Formateadores.FormateadorSucesiones;
import ar.edu.untref.dyasc.fibo3.GeneradoresSucesiones.GeneradorSerie;
import ar.edu.untref.dyasc.fibo3.Parser.OpcionParser;
import ar.edu.untref.dyasc.fibo3.Salida.ProovedorSalida;
import ar.edu.untref.dyasc.fibo3.Salida.SalidaArchivo;
import ar.edu.untref.dyasc.fibo3.Salida.SalidaConsola;
import ar.edu.untref.dyasc.fibo3.Parser.ProcesadorEntradas;

import java.util.List;

public class App {
    private final GeneradorSerie generadorFibo;
    private final Formateador formateador;
    private final ProcesadorEntradas procesadorEntradas;

    public App(GeneradorSerie generadorFibo, Formateador formateador, ProcesadorEntradas procesadorEntradas) {

        this.generadorFibo = generadorFibo;
        this.formateador = formateador;
        this.procesadorEntradas = procesadorEntradas;
    }

    public void ejecutarEjercicioFibonacci3(String[] args) {
        Configuracion config = procesadorEntradas.procesar(args);

        if (config != null) {
            ProovedorSalida salida = obtenerProovedorSalida(config); // Este metodo determina si es consola, archivo, etc.

            if (config.getModo() == 's') {
                long sumatoria = generadorFibo.calcularSumatoria(config.getCantidadElementos());
                String resultadoFormateado = formateador.formatear(sumatoria);
                salida.enviar("fibo<" + config.getCantidadElementos() + ">s: " + resultadoFormateado);
            } else {
                long[] serie = generadorFibo.generarSerie(config.getCantidadElementos());
                String resultadoFormateado = formateador.formatear(serie, config);
                salida.enviar("fibo<" + config.getCantidadElementos() + ">:\n" + resultadoFormateado);
            }
        }
    }

    private static ProovedorSalida obtenerProovedorSalida(Configuracion config) {
        if (config.getRutaArchivoSalida() != null) {
            return new SalidaArchivo(config.getRutaArchivoSalida());
        }
        return new SalidaConsola();
    }
}

package ar.edu.untref.dyasc.fibo3;

import ar.edu.untref.dyasc.fibo3.Formateadores.Formateador;
import ar.edu.untref.dyasc.fibo3.Formateadores.FormateadorSucesiones;
import ar.edu.untref.dyasc.fibo3.GeneradoresSucesiones.GeneradorFibonacci;
import ar.edu.untref.dyasc.fibo3.GeneradoresSucesiones.GeneradorSerie;
import ar.edu.untref.dyasc.fibo3.Parser.*;
import ar.edu.untref.dyasc.fibo3.Parser.ProcesadorEntradas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejecutable {
    public static void main(String[] args) {
        GeneradorSerie generadorFibo = new GeneradorFibonacci();
        Formateador formateador = new FormateadorSucesiones();
        List<OpcionParser> procesadoresPorOpcion = new ArrayList<>(
                Arrays.asList(
                        new OpcionOrientacionYDireccionParser(),
                        new OpcionModoParser(),
                        new OpcionArchivoParser(),
                        new OpcionCantidadParser()
                )
        );
        ProcesadorEntradas procesadorEntradas = new ProcesadorEntradas(procesadoresPorOpcion);
        App app = new App(generadorFibo, formateador, procesadorEntradas);
        app.ejecutarEjercicioFibonacci3(args);
    }
}

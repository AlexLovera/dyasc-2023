package ar.edu.untref.dyasc.fibo2;

public class Ejecutable {
    public static void main(String[] args) {
        ProcesadorEntradas parser = new ProcesadorEntradas();
        GeneradorSerie generadorFibo = new GeneradorFibonacci();
        ImpresorSeries printer = new ImpresorSeries();

        App app = new App(parser, generadorFibo, printer);
        app.ejecutarEjercicioFibonacci2(args);
    }
}

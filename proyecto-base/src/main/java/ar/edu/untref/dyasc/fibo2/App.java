package ar.edu.untref.dyasc.fibo2;

public class App {
    private final ProcesadorEntradas procesadorEntradas;
    private final GeneradorSerie generadorFibo;
    private final ImpresorSeries impresor;

    public App(ProcesadorEntradas procesadorEntradas, GeneradorSerie generadorFibo, ImpresorSeries impresor){
        this.procesadorEntradas = procesadorEntradas;
        this.generadorFibo = generadorFibo;
        this.impresor = impresor;
    }
    public void ejecutarEjercicioFibonacci2(String[] args){
        if (!procesadorEntradas.procesarArgumentosComando(args)) {
            System.out.println("Argumentos inválidos.");
            return;
        }

        long[] serieFibonacci = generadorFibo.generarSerie(procesadorEntradas.getCantidad());
        impresor.imprimir(serieFibonacci, procesadorEntradas.getOrientacion(),
                procesadorEntradas.getDireccion(), procesadorEntradas.getCantidad());
    }
}

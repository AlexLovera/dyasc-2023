package ar.edu.untref.dyasc.fibo3.GeneradoresSucesiones;

public interface GeneradorSerie {

    long[] generarSerie(int cantidadAGenerar);

    long calcularSumatoria(int cantidadElementos);
}

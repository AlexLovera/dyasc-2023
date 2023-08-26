package ar.edu.untref.dyasc;
import static org.assertj.core.api.Assertions.assertThat;

import fibo.EjercicioFibonacci;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class EjercicioFibonacciTest {

    @Test
    public void DeberiaRetornarLosPrimeros5NumerosDeFibonacci() {
        long[] expected = {0, 1, 1, 2, 3};
        long[] result = EjercicioFibonacci.generarSerieFibonacci(5);
        assertArrayEquals(expected, result);
    }

    @Test
    public void DeberiaRetornarLosPrimeros8NumerosDeFibonacci() {
        long[] expected = {0, 1, 1, 2, 3, 5, 8, 13};
        long[] result = EjercicioFibonacci.generarSerieFibonacci(8);
        assertArrayEquals(expected, result);
    }

}

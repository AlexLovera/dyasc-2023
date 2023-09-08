package ar.edu.untref.dyasc.fibo2;
public class ImpresorSeries {
    public void imprimir(long[] serie, char orientacion, char direccion, int cantidadElementos){
        System.out.print("fibo<"+cantidadElementos +">:");
        String opcionIngresada = String.valueOf(orientacion) + String.valueOf(direccion);

        switch (opcionIngresada) {
            case "hd":
                imprimirHorizontal(serie, true);
                break;
            case "vd":
                imprimirVertical(serie, true);
                break;
            case "hi":
                imprimirHorizontal(serie, false);
                break;
            case "vi":
                imprimirVertical(serie, false);
                break;
        }
    }
    private void imprimirHorizontal(long[] serie, boolean direccionAscendente) {
        int inicio = direccionAscendente ? 0 : serie.length - 1;
        int fin = direccionAscendente ? serie.length : -1;
        int incremento = direccionAscendente ? 1 : -1;

        for (int i = inicio; i != fin; i += incremento) {
            System.out.print(serie[i] + " ");
        }
        System.out.println();
    }
    private void imprimirVertical(long[] serie, boolean direccionAscendente) {
        int inicio = direccionAscendente ? 0 : serie.length - 1;
        int fin = direccionAscendente ? serie.length : -1;
        int incremento = direccionAscendente ? 1 : -1;

        System.out.println();
        for (int i = inicio; i != fin; i += incremento) {
            System.out.println(serie[i]);
        }
    }
}

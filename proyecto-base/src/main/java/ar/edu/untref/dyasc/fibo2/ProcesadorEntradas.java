package ar.edu.untref.dyasc.fibo2;
public class ProcesadorEntradas {
    private int cantidad;
    private char orientacion = 'h';
    private char direccion = 'd';
    public boolean procesarArgumentosComando(String[] args) {
        try {
            if (args[0].startsWith("-o=")) {
                String opciones = args[0].substring(3);
                if (opciones.length() != 2) {
                    return false;
                }
                orientacion = opciones.charAt(0);
                direccion = opciones.charAt(1);
                cantidad = Integer.parseInt(args[1]);
            } else {
                cantidad = Integer.parseInt(args[0]);
            }
        } catch (Exception e) {
            return false;
        }
        return (orientacion == 'h' || orientacion == 'v') && (direccion == 'd' || direccion == 'i');
    }
    public int getCantidad() {
        return cantidad;
    }
    public char getOrientacion() {
        return orientacion;
    }
    public char getDireccion() {
        return direccion;
    }
}
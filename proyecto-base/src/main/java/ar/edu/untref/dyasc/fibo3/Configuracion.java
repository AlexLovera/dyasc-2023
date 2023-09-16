package ar.edu.untref.dyasc.fibo3;

public class Configuracion {
    private char orientacion = 'h';
    private char direccion = 'd';
    private String archivoSalida;  // null si no se especifica
    private char modo = 'l';       // 'l' por default
    private int cantidadElementos;
    private boolean esVertical = false;
    private boolean esInversa = false;

    public void setOrientacion(char orientacion) {
        this.orientacion = orientacion;
        this.esVertical = (orientacion == 'v');
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
        this.esInversa = (direccion == 'i');
    }

    public String getRutaArchivoSalida() {
        return archivoSalida;
    }

    public void setRutaArchivoSalida(String archivoSalida) {
        this.archivoSalida = archivoSalida;
    }

    public char getModo() {
        return modo;
    }

    public void setModo(char modo) {
        this.modo = modo;
    }

    public int getCantidadElementos() {
        return cantidadElementos;
    }

    public void setCantidadElementos(int cantidadElementos) {
        this.cantidadElementos = cantidadElementos;
    }

    public boolean getEsVertical() {
        return esVertical;
    }

    public boolean getEsInversa() {
        return esInversa;
    }
}

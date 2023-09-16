package ar.edu.untref.dyasc.fibo3.Salida;

public class SalidaConsola implements ProovedorSalida{
    @Override
    public void enviar(String datos) {
        System.out.println(datos);
    }
}

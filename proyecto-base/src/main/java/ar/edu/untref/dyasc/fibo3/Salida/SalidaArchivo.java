package ar.edu.untref.dyasc.fibo3.Salida;
import java.io.FileWriter;
import java.io.IOException;
public class SalidaArchivo implements ProovedorSalida{
    private final String rutaArchivo;

    public SalidaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    @Override
    public void enviar(String datos) {
        if (rutaArchivo.endsWith(".txt")) {
            escribirComoArchivoTexto(datos);
        }
    }

    private void escribirComoArchivoTexto(String datos) {
        try (FileWriter archivo = new FileWriter(rutaArchivo)) {
            archivo.write(datos);
            String subcadenaHastaPuntos = datos.substring(0, datos.indexOf(':'));
            System.out.println(subcadenaHastaPuntos + " guardado en " + rutaArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

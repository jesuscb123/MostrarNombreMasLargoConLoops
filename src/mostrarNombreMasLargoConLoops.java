import javax.swing.*;
import java.util.*;

public class mostrarNombreMasLargoConLoops {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre1 = pedirNombreCompleto();
        String nombre2 = pedirNombreCompleto();
        String nombre3 = pedirNombreCompleto();
        String[] nombresCompletos = {nombre1, nombre2, nombre3};
        List<String> nombres = obtenerListaSoloNombres(nombresCompletos);
        String nombreMasLargo = obtenerNombreMasLargo(nombres);
        System.out.println("El nombre más largo es:" + " " + obtenerCoincidencia(nombresCompletos, nombreMasLargo));

    }

    public static String pedirNombreCompleto() {
        return JOptionPane.showInputDialog("Introduce tu nombre completo");
    }

    public static List<String> obtenerListaSoloNombres(String[] nombresCompletos) {
        List<String> nombresSeparados = new ArrayList<String>();
        for (int i = 0; i < nombresCompletos.length; i++) {
            String temp = nombresCompletos[i]; // he creado una variable temporal para obtener el nombre completo de la lista
            String nombre = temp.split(" ")[0]; // así accedo solo al nombre sin los apellidos.
            nombresSeparados.add(nombre);
        }
        return nombresSeparados;
    }

    public static String obtenerNombreMasLargo(List<String> nombres) {
        String nombreMasLargo = "";
        for (int i = 0; i < nombres.size(); i++) {
            String nombreActual = nombres.get(i);
            if (nombreMasLargo.length() < nombreActual.length()) {
                nombreMasLargo = nombreActual;
            }
        }
        return nombreMasLargo;
    }

    public static String obtenerCoincidencia(String[] nombresCompletos, String nombre) {
        for (int i = 0; i < nombresCompletos.length; i++) {
            String temp = nombresCompletos[i];
            String nombreActual = temp.split(" ")[0];
            if (nombreActual.toLowerCase().equals(nombre.toLowerCase())) {
                return nombresCompletos[i];
            }
        }
        return "";
    }
}
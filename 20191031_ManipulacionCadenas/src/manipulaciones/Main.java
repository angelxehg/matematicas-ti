/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulaciones;

/**
 *
 * @author angel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer cadena
        Entrada entrada = new Entrada();
        entrada.mostrarMensaje("Ingrese una cadena:");
        String cadena = entrada.cadena();
        // Obtener información
        int cuentaCadena = cadena.length();
        int cuentaLetras = 0;
        String letras = "";
        for (char caracter : cadena.toCharArray()) {
            letras += " ";
            letras += caracter;
            cuentaLetras++;
        }
        // Mostrar resultados
        entrada.mostrarMensaje("Longitud: " + cuentaCadena);
        entrada.mostrarMensaje("Letras (" + cuentaLetras + "): " + letras);
    }

}

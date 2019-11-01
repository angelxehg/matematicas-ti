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
        int cuentaNumeros = 0;
        int cuentaOperadores = 0;
        String letras = "";
        String numeros = "";
        String operadores = "";
        for (char caracter : cadena.toCharArray()) {
            String Caracter = "" + caracter;
            if (Caracter.matches("[A-Za-z]+")) {
                // Letra
                letras += " " + Caracter;
                cuentaLetras++;
            } else if (Caracter.matches("[0-9]+")) {
                // Número
                numeros += " " + Caracter;
                cuentaNumeros++;
            } else if (Caracter.matches("[+,-,*,/,^,%,=,!,|,&,<,>,(,)]")) {
                // Operador
                operadores += " " + Caracter;
                cuentaOperadores++;
            }
        }
        // Mostrar resultados
        entrada.mostrarMensaje("Cadena: (" + cuentaCadena + "): " + cadena);
        entrada.mostrarMensaje("Letras (" + cuentaLetras + "): " + letras);
        entrada.mostrarMensaje("Números (" + cuentaNumeros + "): " + numeros);
        entrada.mostrarMensaje("Operadores (" + cuentaOperadores + "): " + operadores);
    }

}

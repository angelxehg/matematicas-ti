/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

import comunes.CustomScanner;

/**
 *
 * @author utzac
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        CustomScanner scanner = new CustomScanner();
        int y = scanner.readNextInt("Ingrese el año: ");
        System.out.println("El año " + y + Ejercicio12.esBisiesto(y));
    }

    public static String esBisiesto(int y) {
        if ((y % 4 == 0) && ((y % 100 != 0) || (y % 400 == 0))) {
            return " es un año bisiesto";
        } else {
            return " NO es un año bisiesto";
        }
    }

}

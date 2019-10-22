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
public class Ejercicio18 {

    public static void main(String[] args) {
        CustomScanner scanner = new CustomScanner();
        int y = 0;
        do {
            y = scanner.readNextInt("Ingrese el año: ");
            System.out.println("El año " + y + Ejercicio12.esBisiesto(y));
        } while (y > 0);
    }

}

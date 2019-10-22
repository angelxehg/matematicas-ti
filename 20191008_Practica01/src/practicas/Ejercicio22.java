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
public class Ejercicio22 {

    public static void main(String[] args) {
        CustomScanner scanner = new CustomScanner();
        int y1 = scanner.readNextInt("Ingrese valor A: ");
        int y2 = scanner.readNextInt("Ingrese valor B: ");
        int inicio = (y1 % 4 == 0) ? y1 : y1 + (y1 % 4);
        int fin = (y2 % 4 == 0) ? y2 : y2 - (y2 % 4);
        System.out.println("todos los años biciestos:");
        for (int i = inicio; i <= fin; i += 4) {
            if (((i % 100 != 0) || (i % 400 == 0))) {
                System.out.println("" + i);
            }
        }
    }

}

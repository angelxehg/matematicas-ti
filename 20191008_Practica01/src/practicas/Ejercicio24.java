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
public class Ejercicio24 {

    public static void main(String[] args) {
        CustomScanner scanner = new CustomScanner();
        int a = scanner.readNextInt("Ingrese valor A: ");
        int b = scanner.readNextInt("Ingrese valor B: ");
        int iz = scanner.readNextInt("Ingrese valor incrementos: ");
        int is = scanner.readNextInt("Ingrese valor interrupción: ");
        System.out.println("Los valores posibles son:");
        for (int i = a; i <= b; i += iz) {
            System.out.println("" + i);
            if (i == is) {
                break;
            }
        }
    }

}

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
public class Ejercicio10 {

    public static void main(String[] args) {
        CustomScanner scanner = new CustomScanner();
        int a = scanner.readNextInt("Ingrese valor A: ");
        int b = scanner.readNextInt("Ingrese valor B: ");
        int c = scanner.readNextInt("Ingrese valor C: ");
        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;
        if (a2 + b2 == c2) {
            System.out.println("Teorema de pitagoras cumplido!");
        } else {
            System.out.println("NO!");
        }
    }

}

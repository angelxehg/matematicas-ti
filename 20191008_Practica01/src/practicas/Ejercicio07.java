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
public class Ejercicio07 {

    public static void main(String[] args) {
        CustomScanner scanner = new CustomScanner();
        int a = scanner.readNextInt("Ingrese valor A: ");
        int b = scanner.readNextInt("Ingrese valor B: ");
        System.out.println("Resultado de suma: " + (a + b));
        System.out.println("Resultado de resta: " + (a - b));
        System.out.println("Resultado de multiplicación: " + (a * b));
        System.out.println("Resultado de división: " + (a / b));
    }

}

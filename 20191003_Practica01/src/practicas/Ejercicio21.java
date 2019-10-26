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
public class Ejercicio21 {

    public static void main(String[] args) {
        CustomScanner scanner = new CustomScanner();
        int a = scanner.readNextInt("Ingrese valor A: ");
        int b = scanner.readNextInt("Ingrese valor B: ");
        int inicio = (a % 2 == 0) ? a : a + 1;
        int fin = (b % 2 == 0) ? b : b - 1;
        System.out.println("todos los enteros pares:");
        for (int i = inicio; i <= fin; i += 2) {
            System.out.println("" + i);
        }
    }

}

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
public class Ejercicio09 {

    public static void main(String[] args) {
        CustomScanner scanner = new CustomScanner();
        int a = scanner.readNextInt("Ingrese valor A: ");
        int b = scanner.readNextInt("Ingrese valor B: ");
        int c = scanner.readNextInt("Ingrese valor C: ");
        System.out.println("Número A (" + a + ") es " + Ejercicio09.esPar(a));
        System.out.println("Número B (" + b + ") es " + Ejercicio09.esPar(b));
        System.out.println("Número C (" + c + ") es " + Ejercicio09.esPar(c));
    }

    public static String esPar(int numero) {
        if (numero % 2 == 0) {
            return "par";
        } else {
            return "impar";
        }
    }

}

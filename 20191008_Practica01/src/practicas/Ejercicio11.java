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
public class Ejercicio11 {

    public static void main(String[] args) {
        CustomScanner scanner = new CustomScanner();
        int a = scanner.readNextInt("Ingrese valor A: ");
        int b = scanner.readNextInt("Ingrese valor B: ");
        System.out.println("Número A (" + a + ") es " + Ejercicio11.esPositivo(a));
        System.out.println("Número B (" + b + ") es " + Ejercicio11.esPositivo(b));
    }

    private static String esPositivo(int numero) {
        if (numero >= 0) {
            return "positivo";
        } else {
            return "negativo";
        }
    }

}

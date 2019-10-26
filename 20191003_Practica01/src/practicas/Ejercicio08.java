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
public class Ejercicio08 {

    public static void main(String[] args) {
        CustomScanner scanner = new CustomScanner();
        int mayor = 0;
        int menor = 0;
        int a = scanner.readNextInt("Ingrese valor A: ");
        int b = scanner.readNextInt("Ingrese valor B: ");
        int c = scanner.readNextInt("Ingrese valor C: ");
        if (a > b) {
            if (a > c) {
                mayor = a;
                menor = (b < c) ? b : c;
            } else {
                mayor = c;
                menor = b;
            }
        } else {
            if (b > c) {
                mayor = b;
                menor = (a < c) ? a : c;
            } else {
                mayor = c;
                menor = a;
            }
        }
        System.out.println("El número mayor es " + mayor);
        System.out.println("El número menor es " + menor);
    }

}

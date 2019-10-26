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
public class Ejercicio04 {

    public static void main(String[] args) {
        CustomScanner scanner = new CustomScanner();
        int a = scanner.readNextInt("Ingrese un valor para a: ");
        int b = scanner.readNextInt("Ingrese un valor para b: ");
        System.out.println("El número mayor es " + Math.max(a, b));
        scanner.close();
    }

}

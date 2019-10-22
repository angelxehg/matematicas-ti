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
public class Ejercicio05 {

    public static void main(String[] args) {
        CustomScanner scanner = new CustomScanner();
        float a = scanner.readNextFloat("Ingrese un número decimal A: ");
        float b = scanner.readNextFloat("Ingrese un número decimal B: ");
        int menor = Math.min(Math.round(a), Math.round(b));
        System.out.println("El número menor es " + menor);
    }

}

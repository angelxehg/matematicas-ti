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
public class Ejercicio06 {

    public static void main(String[] args) {
        CustomScanner scanner = new CustomScanner();
        float a = scanner.readNextFloat("Ingrese un número decimal A: ");
        float b = scanner.readNextFloat("Ingrese un número decimal B: ");
        double multiplicacion = Math.round(a) * Math.round(b);
        double raiz = Math.sqrt(multiplicacion);
        System.out.println("Resultado multiplicación: " + multiplicacion);
        System.out.println("Resultado raíz cuadrada: " + raiz);
    }

}

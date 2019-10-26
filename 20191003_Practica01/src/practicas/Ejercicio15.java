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
public class Ejercicio15 {

    public static void main(String[] args) {
        CustomScanner scanner = new CustomScanner();
        char c = scanner.readNextChar("Ingrese F, M, otro");
        if (c == 'F' || c == 'f') {
            System.out.println("Femenino");
        } else if (c == 'M' || c == 'm') {
            System.out.println("Masculino");
        } else {
            System.out.println("Indefinido");
        }
    }

}

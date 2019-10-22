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
public class Ejercicio17 {

    public static void main(String[] args) {
        CustomScanner scanner = new CustomScanner();
        int temp = 0;
        do {
            temp = scanner.readNextInt("Ingrese valor mayor a cero, o ingrese 0 para terminar suma: ");
            System.out.println("El valor " + temp + " es " + Ejercicio09.esPar(temp));
        } while (temp > 0);
    }

}

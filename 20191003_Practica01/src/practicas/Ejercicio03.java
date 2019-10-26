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
public class Ejercicio03 {

    public static void main(String[] args) {
        CustomScanner scanner = new CustomScanner();
        int i = scanner.readNextInt("Nuevo valor para i: ");
        float f = scanner.readNextFloat("Nuevo valor para f: ");
        boolean b = scanner.readNextBoolean("Nuevo valor para b: ");
        char c = scanner.readNextChar("Nuevo valor para c: ");
        String s = scanner.readNextString("Nuevo valor para s: ");
        System.out.println("Valor de i: " + i);
        System.out.println("Valor de f: " + f);
        System.out.println("Valor de b: " + b);
        System.out.println("Valor de c: " + c);
        System.out.println("Valor de s: " + s);
        scanner.close();
    }

}

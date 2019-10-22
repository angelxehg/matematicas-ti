/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosjava.estrudatos;

import java.util.Stack;

/**
 *
 * @author angel
 */
public class EjemploArray {

    public void ejecutar() {
        // Crear un Array
        String[] autos = { "Volvo", "BMW", "Ford", "Mazda" };
        System.out.println(autos[0]);
        // Crear una pila
        Stack<String> pila = new Stack<String>();
        for (String auto : autos) {
            pila.push(auto);
        }
    }

}

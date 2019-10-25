/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosjava.estrucontrol;

/**
 *
 * @author utzac
 */
public class EjemploWhile {

    // Valores
    private Integer A = 2;

    // Método principal
    public void ejecutar() {
        // Ejemplo WHILE
        System.out.println("Ejemplos de Estructura While");
        while (A <= 10) {
            System.out.println("- Iteración!");
            A++;
        }
    }

}

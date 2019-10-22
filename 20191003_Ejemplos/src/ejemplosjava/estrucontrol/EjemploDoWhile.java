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
public class EjemploDoWhile {

    // Valores
    private Integer A = 2;

    // Método principal
    public void ejecutar() {
        // Ejemplo DO-WHILE
        System.out.println("Ejemplos de Estructura Do While");
        do {
            System.out.println("- Iteración!");
            A++;
        } while (A <= 10);
    }

}

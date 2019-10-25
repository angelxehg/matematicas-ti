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
public class EjemploSwitch {

    // Valores
    private final Integer A = 2;

    // Método principal
    public void ejecutar() {
        // Ejemplo SWITCH
        System.out.println("Ejemplos de Estructura Switch");
        switch (A) {
        case 1:
            System.out.println("R = 1");
        case 2:
            System.out.println("R = 2");
        case 3:
            System.out.println("R = 3");
        default:
            System.out.println("R = 4");
        }
    }

}

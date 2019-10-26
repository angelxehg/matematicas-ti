/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdecontrol.seleccion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class EjemploIf {
    
    public static void main(String [] args) {
        // Declarar Scanner y variables
        Scanner entrada = new Scanner(System.in);
        int a = 0; int b = 0;
        // Ingresar valores
        try {
            System.out.println("Escribe el valor de A: ");
            a = entrada.nextInt();
            System.out.println("Escribe el valor de B: ");
            b = entrada.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("No ingresaste un número!");
        }
        // Selección If
        if (a > b) {
            System.out.println("A es mayor que B");
        } else if (a < b){
            System.out.println("B es mayor que A");
        } else {
            System.out.println("A es igual a B");
        }
        // Finalizar
        entrada.close();
    }
}

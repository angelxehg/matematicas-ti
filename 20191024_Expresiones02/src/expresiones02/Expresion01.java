/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresiones02;

/**
 *
 * @author angel
 */
public class Expresion01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir variables
        double a = 1;
        double b = 2;
        double c = 3;
        double m = (double) 1 / 2;
        double n = (double) 1 / 3;
        double p = (double) 1 / 4;
        // Realizar operaciones
        double r1 = ((double) 5 / 6 * Math.pow(a, b - 1)) * (Math.pow(m, c - 2));
        double r2 = 0;
        double r3 = 0;
        double r4 = 0;
        double r5 = 0;
        // Imprimir valores
        System.out.println("Resultado 1: " + r1);
        System.out.println("Resultado 2: " + r2);
        System.out.println("Resultado 3: " + r3);
        System.out.println("Resultado 4: " + r4);
        System.out.println("Resultado 5: " + r5);
    }

}

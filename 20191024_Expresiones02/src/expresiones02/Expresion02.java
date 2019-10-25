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
public class Expresion02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir variables
        double a = 3;
        double b = 4;
        double c = (double) 1 / 3;
        double d = (double) 1 / 2;
        double m = 6;
        double n = (double) 1 / 4;
        // Realizar operaciones
        double r1 = (c * Math.sqrt(3 * a)) - (d * Math.sqrt(16 * b * b)) + (n * Math.sqrt(8 * d));
        double r2 = (((double) 1 / 2) * ((double) 4 * Math.pow(d, 2)))
                + (((double) 1 / 2) * ((double) 16 * Math.pow(n, 2))) - 1;
        double r3 = ((double) (a + b) / (c)) - ((double) (b + m) / (d));
        double r4 = ((double) (Math.sqrt(b) + Math.sqrt(2 * d)) / 2)
                - ((double) (Math.sqrt(3 * c) + Math.sqrt(8 * d)) / 4);
        double r5 = ((double) (2 * Math.sqrt(Math.pow(a, 2) * Math.pow(b, 2))) / 3)
                + ((double) (3 * Math.sqrt(2 + Math.pow(d, 2))) / 4) - (a * Math.sqrt(n));
        // Imprimir valores
        System.out.println("Resultado 1: " + r1);
        System.out.println("Resultado 2: " + r2);
        System.out.println("Resultado 3: " + r3);
        System.out.println("Resultado 4: " + r4);
        System.out.println("Resultado 5: " + r5);
    }

}

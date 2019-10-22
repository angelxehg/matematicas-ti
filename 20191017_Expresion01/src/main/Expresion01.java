/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author angel
 */
public class Expresion01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entrada e = new Entrada();
        e.mostrarMensaje("Ingresa el valor de a y b: ");
        int a = e.numeroEntero();
        int b = e.numeroEntero();
        double r = (((double) 3 / 4 * Math.pow(a, 2)) + ((double) 2 / 3 * Math.pow(b, 2)))
                * (((double) -1 / 3 * a * b) + ((double) 1 / 9 * Math.pow(b, 2)))
                * (((double) 1 / 6 * a * b) - ((double) 1 / 3 * Math.pow(b, 2)));
        System.out.println("" + r);
    }

}

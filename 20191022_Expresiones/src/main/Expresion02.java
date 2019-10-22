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
public class Expresion02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entrada e = new Entrada();
        e.mostrarMensaje("Ingresa el valor de a, b y c: ");
        int a = e.numeroEntero();
        int b = e.numeroEntero();
        int c = e.numeroEntero();
        double r = Math.pow((c * Math.pow(((double) c / a), 3) * Math.pow(b, c)), 1 / ((double) a * b));
        System.out.println("R: " + r);
    }

}

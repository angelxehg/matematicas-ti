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
public class Expresion03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entrada e = new Entrada();
        e.mostrarMensaje("Ingresa el valor de a, b y c: ");
        int a = e.numeroEntero();
        int b = e.numeroEntero();
        int c = e.numeroEntero();
        double r = ((3 * Math.PI) * (((double) a / b) + ((double) c / a) - ((double) b / c) * ((double) a / b))
                * Math.pow((Math.pow(a, c) + Math.pow(b, b) - Math.pow(c, a)), (double) 1 / 2)) - (a * Math.PI);
        System.out.println("R: " + r);
    }

}

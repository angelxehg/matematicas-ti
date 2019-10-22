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
        e.mostrarMensaje("Ingresa el valor de a, b y c: ");
        int a = e.numeroEntero();
        int b = e.numeroEntero();
        int c = e.numeroEntero();
        double r = ((6 * Math.pow(c, 3)) * (Math.pow((Math.pow(b, 2)), (double) 1 / 2)))
                * ((Math.pow(6, 2)) / (a * Math.pow(8, 2)))
                * (((Math.pow(180, (double) 1 / 3) + (a * Math.pow(4, 2)))
                        / (((3 * Math.pow(a, 2)) - (2 * Math.pow(b, 3)) * ((double) c / 4))
                                * ((2 * Math.pow(b, 2)) * (3 * Math.pow(c, 3)))))
                        / (Math.pow((16 * a), (double) 1 / 2) * Math.PI));
        System.out.println("R: " + r);
    }

}

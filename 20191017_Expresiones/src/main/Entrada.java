/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Entrada {

    private Scanner s;

    public Entrada() {
        s = new Scanner(System.in);
    }

    public void mostrarMensaje(String m) {
        System.out.println(m);
    }

    public int numeroEntero() {
        try {
            return this.s.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: " + e.getMessage());
            return -1;
        }
    }
}

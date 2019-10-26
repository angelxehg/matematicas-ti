/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTI;

import JavaTI.Classes.MiClase;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instancia de MiClase
        MiClase miClase = new MiClase();
        miClase.setValorX(3);
        int resultado = miClase.getCalculo1();
        System.out.println(resultado);

        // otra instancia de MiClase
        MiClase miClase2 = new MiClase(3);
        int resultado2 = miClase2.getCalculo1();
        System.out.println(resultado2);
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        
        try {
            int valor = entrada.nextInt();
            System.out.println(valor);
        } catch(InputMismatchException e) {
            System.out.println("XD");
        }
        
    }
    
}

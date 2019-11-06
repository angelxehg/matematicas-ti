/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresivo;

import java.util.ArrayList;

/**
 *
 * @author utzac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        String expresion = entrada.cadena().trim();
        // ...
        ArrayList<String> fragmentos = Main.separar(expresion);
        //
        System.out.println("Expresión: " + expresion);
        for (String fragmentp : fragmentos) {
            System.out.println(fragmentp);
        }
    }

    public static ArrayList<String> separar(String expresion) {
        int nextPlus = expresion.indexOf("+");
        int nextMinus = expresion.indexOf("-");
        if (nextPlus < 0 && nextMinus < 0) {
            // Caso base
            ArrayList<String> fragmentos = new ArrayList<>();
            fragmentos.add(expresion);
            return fragmentos;
        }
        int index = 0;
        if ((nextPlus < nextMinus && nextPlus > 0) || nextMinus < 0) {
            // Suma está más cerca
            index = nextPlus;
        } else {
            // Resta está más cerca
            index = nextMinus;
        }
        // Recursividad
        String fragmento = expresion.substring(0, index);
        String restante = expresion.substring(index + 1);
        ArrayList<String> fragmentos = Main.separar(restante);
        fragmentos.add(fragmento);
        return fragmentos;
    }

}

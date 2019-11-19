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
        // Separar en fragmentos
        ArrayList<String> fragmentos = Main.separar(expresion);
        // Imprimir fragmentos
        System.out.println("Expresión: " + expresion);
        for (String fragmentp : fragmentos) {
            System.out.println(fragmentp);
        }
    }

    public static ArrayList<String> separar(String expresion) {
        // Obtener índices
        int nextPlus = expresion.indexOf("+");
        int nextMinus = expresion.indexOf("-");
        // Determinar carga (positivo o negativo)
        boolean positive = (nextMinus != 0); // A menos que exista un - al inicio, debe ser positivo
        String caption = positive ? " (positivo)" : " (negativo)";
        // Quitar signo (si existe)
        if (nextPlus == 0 || nextMinus == 0) {
            expresion = expresion.substring(1);
            nextPlus = expresion.indexOf("+");
            nextMinus = expresion.indexOf("-");
        }
        // Determinar caso base
        if (nextPlus < 0 && nextMinus < 0) {
            ArrayList<String> fragmentos = new ArrayList<>();
            String fragmento = expresion + caption;
            fragmentos.add(fragmento);
            return fragmentos;
        }
        // Continuar recursividad
        int index = (nextPlus < nextMinus && nextPlus > 0) || nextMinus < 0 ? nextPlus : nextMinus;
        String fragmento = expresion.substring(0, index) + caption;
        String restante = expresion.substring(index);
        ArrayList<String> fragmentos = Main.separar(restante);
        fragmentos.add(0, fragmento);
        return fragmentos;
    }

}

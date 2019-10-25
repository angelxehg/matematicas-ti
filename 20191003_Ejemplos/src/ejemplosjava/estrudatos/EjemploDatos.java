/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosjava.estrudatos;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class EjemploDatos {

    // Metodo principal
    public void ejecutar() {
        // Crea arraylist
        ArrayList<String> lista = new ArrayList<String>();
        // Añade el elemento al ArrayList
        lista.add("Elemento");
        // Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro.
        lista.remove("Elemento");
        // Borra todos los elementos de ArrayList
        lista.clear();
    }

}

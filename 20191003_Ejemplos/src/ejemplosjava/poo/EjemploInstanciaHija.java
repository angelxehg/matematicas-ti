/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosjava.poo;

/**
 *
 * @author angel
 */
public class EjemploInstanciaHija extends EjemploInstancia {

    // Metodo principal
    public void ejecutar() {
        // Verificar que es hija
        System.out.println("ESTA ES LA CLASE HIJA");
        // Ejecutar lo mismo
        super.ejecutar();
    }

}

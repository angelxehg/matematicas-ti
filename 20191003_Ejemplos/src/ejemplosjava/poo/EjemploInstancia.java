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
public class EjemploInstancia {

    // Metodo principal
    public void ejecutar() {
        // Crear instancia
        EjemploClase instancia = new EjemploClase();
        // Usar metodo
        instancia.metodo();
        // Usar metodo estático
        EjemploClase.metodoEstatico();
        // Usar Gets y Sets
        System.out.println("Valor actual de atributo: " + instancia.getAtributo());
        instancia.setAtributo((Integer) 4);
        // Verificar resultado
        System.out.println("Valor actual de atributo: " + instancia.getAtributo());
    }

}

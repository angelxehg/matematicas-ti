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
public class EjemploClase {

    // ejemplo de atributo
    private Integer atributo; // Atributo

    // Get y sets
    public Integer getAtributo() {
        return this.atributo;
    }

    public void setAtributo(Integer atributo) {
        this.atributo = atributo;
    }

    // Ejemplo de metodo estatico
    public static void metodoEstatico() {
        System.out.println("OK Estático!");
    }

    // Ejemplo de metodo
    public void metodo() {
        System.out.println("Atributo = " + this.atributo);
    }

}

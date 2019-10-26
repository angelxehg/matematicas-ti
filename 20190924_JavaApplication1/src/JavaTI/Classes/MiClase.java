/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTI.Classes;

/**
 *
 * @author angel
 */
public class MiClase {
    
    // Miembros de clase: atributos
    
    private int valorX;
    
    private final int VALOR_Y = 2; // final = constante
    
    // Métodos: constructor, acceso y específicos
    
    public MiClase(){
        System.out.println("Constructor default");
    }
    
    public MiClase(int valorX){
        this.valorX = valorX;
    }

    public int getValorX() {
        return valorX;
    }
    
    public void setValorX(int valorX) {
        this.valorX = valorX;
    }
    
    public int getValorY() {
        return VALOR_Y;
    }

    public int getCalculo1() {
        return this.valorX * this.VALOR_Y;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosjava.operadores;

/**
 *
 * @author utzac
 */
public class EjemploAsignacion {

    // Constantes
    private final Integer A = 4;
    private final Integer B = 2;
    
    // Método principal
    public void ejecutar() {
        // Iniciar variables
        Integer b1 = B, b2 = B, b3 = B, b4 = B;
        double b5 = B, b6 = B;
        // Realizar asignaciones
        b1 = A;
        b2 += A;
        b3 -= A;
        b4 *= A;
        b5 /= A;
        b6 %= A;
        // Imprimir resultados
        System.out.println("Ejemplos de Operadores de asignación, Valor de A = 4 y B = 2");
        System.out.println("- Resultado de B = A es: " + b1);
        System.out.println("- Resultado de B += A es: " + b2);
        System.out.println("- Resultado de B -= A es: " + b3);
        System.out.println("- Resultado de B *= A es: " + b4);
        System.out.println("- Resultado de B /= A es: " + b5);
        System.out.println("- Resultado de B %= A es: " + b6);
    }
    
}

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
public class EjemploOperadores {

    // Constantes
    private final Integer A = 4;
    private final Integer B = 2;
    
    // Método principal
    public void ejecutar() {
        // Iniciar variables
        Integer a1 = A, a2 = A;
        // Imprimir resultados
        System.out.println("Ejemplos de Operadores, Valor de A = 4 y B = 2");
        System.out.println("- Resultado de A == b es: " + (A == B));
        System.out.println("- Resultado de A != b es: " + (A != B));
        System.out.println("- Resultado de A < b es: " + (A < B));
        System.out.println("- Resultado de A > b es: " + (A > B));
        System.out.println("- Resultado de A <= b es: " + (A <= B));
        System.out.println("- Resultado de A >= b es: " + (A >= B));
        System.out.println("- Resultado de A++ es: " + (a1++));
        System.out.println("- Resultado de ++A es: " + (++a2));
    }
    
}

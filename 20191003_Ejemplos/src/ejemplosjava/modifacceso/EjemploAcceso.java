/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosjava.modifacceso;

/**
 *
 * @author utzac
 */
public class EjemploAcceso {

    // Variables y constantes
    private String TextoPrivate; // Variable con acceso privado
    protected String TextoProtected; // Variable con acceso protegido
    public String TextoPublic; // Variable con acceso público
    public final String CONSTANTE = "Hola"; // Constante
    String TextoDefault; // Variable con acceso default

    // Constructor
    public EjemploAcceso() {
        this.TextoPrivate = "Private";
        this.TextoProtected = "Protected";
        this.TextoPublic = "Public";
        this.TextoDefault = "Default";
    }

    // Método principal
    public void ejecutar() {
        // Imprimir resultados
        System.out.println("Ejemplos de Modificadores de acceso");
        System.out.println("- Valor de TextoPrivate: " + TextoPrivate);
        System.out.println("- Valor de TextoProtected: " + TextoProtected);
        System.out.println("- Valor de TextoPublic: " + TextoPublic);
        System.out.println("- Valor de CONSTANTE: " + CONSTANTE);
        System.out.println("- Valor de TextoDefault: " + TextoDefault);
    }
    
}

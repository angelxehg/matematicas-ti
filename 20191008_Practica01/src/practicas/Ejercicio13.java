/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

import comunes.CustomScanner;

/**
 *
 * @author utzac
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        CustomScanner scanner = new CustomScanner();
        int d = scanner.readNextIntRange("Ingrese valor Día (1-7): ", 1, 7);
        int m = scanner.readNextIntRange("Ingrese valor Mes (1-12): ", 1, 12);
        System.out.println("d es " + Ejercicio13.diaSemana(d));
        System.out.println("m es " + Ejercicio13.mes(m));
    }

    private static String diaSemana(int d) {
        switch (d) {
        case 1:
            return "Domingo";
        case 2:
            return "Lunes";
        case 3:
            return "Martes";
        case 4:
            return "Miercoles";
        case 5:
            return "Jueves";
        case 6:
            return "Viernes";
        case 7:
            return "Sabado";
        default:
            return "Error";
        }
    }

    private static String mes(int m) {
        switch (m) {
        case 1:
            return "Enero";
        case 2:
            return "Febrero";
        case 3:
            return "Marzo";
        case 4:
            return "Abril";
        case 5:
            return "Mayo";
        case 6:
            return "Junio";
        case 7:
            return "Julio";
        case 8:
            return "Agosto";
        case 9:
            return "Septiembre";
        case 10:
            return "Octubre";
        case 11:
            return "Noviembre";
        case 12:
            return "Diciembre";
        default:
            return "Error";
        }
    }

}

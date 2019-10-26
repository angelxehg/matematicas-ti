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
public class Ejercicio14 {

    public static void main(String[] args) {
        CustomScanner scanner = new CustomScanner();
        int m = scanner.readNextIntRange("Ingrese valor Mes (1-12): ", 1, 12);
        int d = scanner.readNextIntRange("Ingrese valor Día (1-31): ", 1, (m == 2 ? 28 : 31));
        System.out.println("Tu signo es " + Ejercicio14.obtenerSigno(m, d));
    }

    private static String obtenerSigno(int m, int d) {
        switch (m) {
        case 1:
            if (d <= 20) {
                return "Capricornio";
            } else {
                return "Acuario";
            }
        case 2:
            if (d <= 18) {
                return "Acuario";
            } else {
                return "Piscis";
            }
        case 3:
            if (d <= 20) {
                return "Piscis";
            } else {
                return "Aries";
            }
        case 4:
            if (d <= 20) {
                return "Aries";
            } else {
                return "Tauro";
            }
        case 5:
            if (d <= 20) {
                return "Tauro";
            } else {
                return "Géminis";
            }
        case 6:
            if (d <= 20) {
                return "Géminis";
            } else {
                return "Cáncer";
            }
        case 7:
            if (d <= 22) {
                return "Cáncer";
            } else {
                return "Leo";
            }
        case 8:
            if (d <= 23) {
                return "Leo";
            } else {
                return "Virgo";
            }
        case 9:
            if (d <= 23) {
                return "Virgo";
            } else {
                return "Libra";
            }
        case 10:
            if (d <= 22) {
                return "Libra";
            } else {
                return "Escorpio";
            }
        case 11:
            if (d <= 22) {
                return "Escorpio";
            } else {
                return "Sagitario";
            }
        case 12:
            if (d <= 20) {
                return "Sagitario";
            } else {
                return "Capricornio";
            }
        default:
            return "Error";
        }
    }

}

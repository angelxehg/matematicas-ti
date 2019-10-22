/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosjava;

import ejemplosjava.estrucontrol.*;
import ejemplosjava.estrudatos.*;
import ejemplosjava.modifacceso.*;
import ejemplosjava.operadores.*;
import ejemplosjava.poo.EjemploInstancia;
import ejemplosjava.poo.EjemploInstanciaHija;
import ejemplosjava.tiposdatos.*;

/**
 *
 * @author angel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciar clases de ejemplos
        EjemploEnteros ejemplo01 = new EjemploEnteros();
        EjemploNaturales ejemplo02 = new EjemploNaturales();
        EjemploTexto ejemplo03 = new EjemploTexto();
        EjemploLogicos ejemplo04 = new EjemploLogicos();
        //
        EjemploAritmeticos ejemplo05 = new EjemploAritmeticos();
        EjemploAsignacion ejemplo06 = new EjemploAsignacion();
        EjemploOperadores ejemplo07 = new EjemploOperadores();
        //
        EjemploAcceso ejemplo08 = new EjemploAcceso();
        //
        EjemploIf ejemplo09 = new EjemploIf();
        EjemploSwitch ejemplo10 = new EjemploSwitch();
        EjemploFor ejemplo11 = new EjemploFor();
        EjemploWhile ejemplo12 = new EjemploWhile();
        EjemploDoWhile ejemplo13 = new EjemploDoWhile();
        //
        EjemploArray ejemplo14 = new EjemploArray();
        EjemploDatos ejemplo15 = new EjemploDatos();
        //
        EjemploInstancia ejemplo16 = new EjemploInstancia();
        EjemploInstanciaHija ejemplo17 = new EjemploInstanciaHija();
        // Ejecutar ejemplos
        ejemplo01.ejecutar();
        ejemplo02.ejecutar();
        ejemplo03.ejecutar();
        ejemplo04.ejecutar();
        //
        ejemplo05.ejecutar();
        ejemplo06.ejecutar();
        ejemplo07.ejecutar();
        //
        ejemplo08.ejecutar();
        //
        ejemplo09.ejecutar();
        ejemplo10.ejecutar();
        ejemplo11.ejecutar();
        ejemplo12.ejecutar();
        ejemplo13.ejecutar();
        //
        ejemplo14.ejecutar();
        ejemplo15.ejecutar();
        //
        ejemplo16.ejecutar();
        ejemplo17.ejecutar();
    }

}

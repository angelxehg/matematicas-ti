/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author utzac
 */
public class CustomScanner {

    private Scanner scanner;

    public CustomScanner() {
        this.scanner = new Scanner(System.in);
    }

    public int readNextInt(String message) {
        int value = 0;
        boolean flag = true;
        while (flag) {
            try {
                System.out.println(message);
                value = this.scanner.nextInt();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Error");
            }
        }
        return value;
    }

    public int readNextIntRange(String message, int min, int max) {
        int value = this.readNextInt(message);
        if (min <= value && value <= max) {
            return value;
        } else {
            System.out.println("El valor debe estar entre " + min + " y " + max);
            return 0;
        }
    }

    public float readNextFloat(String message) {
        float value = 0;
        boolean flag = true;
        while (flag) {
            try {
                System.out.println(message);
                value = this.scanner.nextFloat();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Error");
            }
        }
        return value;
    }

    public boolean readNextBoolean(String message) {
        boolean value = false;
        boolean flag = true;
        while (flag) {
            try {
                System.out.println(message);
                value = this.scanner.nextBoolean();
                this.scanner.nextLine();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Error");
            }
        }
        return value;
    }

    public char readNextChar(String message) {
        char value = 'f';
        boolean flag = true;
        while (flag) {
            try {
                System.out.println(message);
                value = this.scanner.nextLine().charAt(0);
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Error");
            }
        }
        return value;
    }

    public String readNextString(String message) {
        String value = "f";
        boolean flag = true;
        while (flag) {
            try {
                System.out.println(message);
                value = this.scanner.nextLine();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("Error");
            }
        }
        return value;
    }

    public void close() {
        this.scanner.close();
    }

}

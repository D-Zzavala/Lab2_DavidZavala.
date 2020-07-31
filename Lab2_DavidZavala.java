/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_davidzavala;

import java.util.Scanner;

/**
 *
 * @author 50431
 */
public class Lab2_DavidZavala {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        char sn = 's';
        boolean tf = false;
        String usuario = "leobanegas", contrasena = "99";
        while (sn == 's') {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5");
            System.out.println("6");
            System.out.println("7");
            System.out.println("0. Salir");
            int op = read.nextInt();
            switch (op) {
                case 1: {
                    if (tf == true) {

                    }
                    break;
                }
                case 2: {
                    if (tf == true) {

                    }
                    break;
                }
                case 3: {
                    while (tf) {
                        System.out.println("Usuario");
                        String temp1 = read.next();
                        System.out.println("Contraseña");
                        String temp2 = read.next();
                        if (temp1.equals(usuario) && temp2.equalsIgnoreCase(temp2)) {
                            tf = !tf;
                        } else {
                            System.out.println("Credenciales incorrectas");
                        }

                    }
                    break;
                }
                case 4: {
                    if (tf == true) {

                    }
                    break;
                }
                case 5: {
                    if (tf == true) {

                    }
                    break;
                }
                case 6: {
                    if (tf == true) {

                    }
                    break;
                }
                case 7: {
                    if (tf == true) {

                    }
                    break;
                }
                case 0: {
                    sn = 'n';
                    break;
                }
                default:
            }
        }
    }
}

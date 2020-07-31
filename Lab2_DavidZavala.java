/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_davidzavala;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 50431
 */
public class Lab2_DavidZavala {

    static Scanner read = new Scanner(System.in);
    static Empleados Emp = new Empleados();

    static ArrayList All = new ArrayList();
    static ArrayList Man = new ArrayList();
    static ArrayList Ase = new ArrayList();
    static ArrayList Caj = new ArrayList();
    static ArrayList Seg = new ArrayList();

    public static void main(String[] args) {
        char sn = 's';
        boolean tf = false;
        String usuario = "leobanegas", contrasena = "99";
        while (sn == 's') {
            System.out.println("1. Registro de Emplados");
            System.out.println("2. Despedir Empleados");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("6. ");
            System.out.println("7. ");
            System.out.println("0. Salir");
            int op = read.nextInt();
            switch (op) {
                case 1: {
                    if (tf == true) {
                        System.out.println("1. Nombre");
                        String nombre = read.next();
                        Emp.setNombre(nombre);

                        System.out.println("2. Apellido ");
                        String apellido = read.next();
                        Emp.setApellido(apellido);

                        System.out.println("3. Color Favorito ");
                        String color = read.next();
                        Emp.setColor(color);

                        System.out.println("4. Edad");
                        int edad = read.nextInt();
                        Emp.setEdad(edad);

                        System.out.println("5. Genero");
                        System.out.println("1. Masculino ||| 2. Femenino");
                        int gen = read.nextInt();
                        boolean c = false;
                        while (c) {
                            switch (gen) {
                                case 1:
                                    Emp.setGenero("Masculino");
                                    c = !c;
                                    break;
                                case 2:
                                    Emp.setGenero("Femenino");
                                    c = !c;
                                    break;
                                default:
                                    System.out.println("Error intente de nuevo");
                                    break;
                            }
                        }

                        System.out.println("6. Altura");
                        double altura = read.nextDouble();
                        Emp.setAltura(altura);

                        System.out.println("7. Peso");
                        double peso = read.nextDouble();
                        Emp.setPeso(peso);

                        System.out.println("8. Titulo");
                        System.out.println("1. Bachiller ||| 2. Licenciado ||| 3. Abogado ||| 4. Ingeniero ||| 5. Doctor");
                        int tit = read.nextInt();
                        boolean cc = false;
                        while (cc) {
                            switch (tit) {
                                case 1:
                                    Emp.setTitulo("Bachiller");
                                    break;
                                case 2:
                                    Emp.setTitulo("Licenciado");
                                    break;
                                case 3:
                                    Emp.setTitulo("Abogado");
                                    break;
                                case 4:
                                    Emp.setTitulo("Ingeniero");
                                    break;
                                case 5:
                                    Emp.setTitulo("Doctor");
                                    break;
                                default:
                            }
                        }
                        System.out.println("9. Cargo");
                        System.out.println("1. Gerente ||| 2. Aseador ||| 3. Cajero ||| 4. Seguridad");
                        int car = read.nextInt();
                        boolean ccc = false;
                        while (ccc) {
                            switch (car) {
                                case 1:
                                    Emp.setCargo("Gerente");
                                    break;
                                case 2:
                                    Emp.setCargo("Aseador");
                                    break;
                                case 3:
                                    Emp.setCargo("Cajero");
                                    break;
                                case 4:
                                    Emp.setCargo("Seguridad");
                                    break;
                                default:
                            }
                        }
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
                        for (int i = 0; i < All.size(); i++) {
                            System.out.println("[" + All.get(i) + "]");
                        }
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

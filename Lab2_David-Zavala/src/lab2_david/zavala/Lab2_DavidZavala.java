package lab2_david.zavala;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_DavidZavala {

    static Scanner read = new Scanner(System.in);
    static Empleado Empleado = new Empleado();
    static ArrayList<ArrayList> Emp = new ArrayList();
    static ArrayList<Empleado> Caj = new ArrayList();
    static ArrayList<Empleado> Seg = new ArrayList();
    static ArrayList<Empleado> Man = new ArrayList();
    static ArrayList<Empleado> Ase = new ArrayList();

    public static void main(String[] args) {
        char sn = 's';
        Emp.add(Caj);
        Emp.add(Seg);
        Emp.add(Man);
        Emp.add(Ase);
        boolean tf = false;
        String usuario = "leobanegas", contrasena = "99";
        while (sn == 's') {
            System.out.println("1. Registro de Emplados");
            System.out.println("2. Despedir Empleados");
            System.out.println("3. Log in");
            System.out.println("4. Ascender Cajero");
            System.out.println("5. Listar Empleados");
            System.out.println("6. Modificar Empleado");
            System.out.println("7. RANDOM");
            System.out.println("0. Salir");
            int op = read.nextInt();
            switch (op) {
                case 1: {
                    if (tf == true) {
                        System.out.println("1. Gerente ||| 2. Aseador ||| 3. Cajero ||| 4. Seguridad");
                        String cargo;
                        int car = read.nextInt();
                        read = new Scanner(System.in);
                        boolean ccc = true;
                        while (ccc) {
                            switch (car) {
                                case 1: {
                                    cargo = "Gerente";
                                    System.out.println("1. Bachiller ||| 2. Licenciado ||| 3. Abogado ||| 4. Ingeniero ||| 5. Doctor");
                                    int tit = read.nextInt();
                                    boolean cc = false;
                                    while (cc == false) {
                                        String titulo;
                                        switch (tit) {
                                            case 1:
                                                titulo = "Bachiller";
                                                System.out.println("entra while>titulo>cargo>Add");
                                                Man.add(NewEmpleado(titulo, cargo));
                                                cc = !cc;
                                                break;
                                            case 2:
                                                titulo = ("Licenciado");
                                                Man.add(NewEmpleado(titulo, cargo));
                                                cc = !cc;
                                                break;
                                            case 3:
                                                titulo = ("Abogado");
                                                Man.add(NewEmpleado(titulo, cargo));
                                                cc = !cc;
                                                break;
                                            case 4:
                                                titulo = ("Ingeniero");
                                                Man.add(NewEmpleado(titulo, cargo));
                                                cc = !cc;
                                                break;
                                            case 5:
                                                titulo = ("Doctor");
                                                Man.add(NewEmpleado(titulo, cargo));
                                                cc = !cc;
                                                break;
                                            default:
                                                System.out.println("Error intente de nuevo");
                                                break;
                                        }
                                    }
                                    ccc = !ccc;
                                    break;
                                }
                                case 2: {
                                    cargo = "Aseador";
                                    System.out.println("1. Bachiller ||| 2. Licenciado ||| 3. Abogado ||| 4. Ingeniero ||| 5. Doctor");
                                    int tit = read.nextInt();
                                    boolean cc = false;
                                    while (cc) {
                                        String titulo;
                                        switch (tit) {
                                            case 1:
                                                titulo = "Bachiller";
                                                Ase.add(NewEmpleado(titulo, cargo));
                                                cc = !cc;
                                                break;
                                            case 2:
                                                titulo = ("Licenciado");
                                                Ase.add(NewEmpleado(titulo, cargo));
                                                cc = !cc;
                                                break;
                                            case 3:
                                                titulo = ("Abogado");
                                                Ase.add(NewEmpleado(titulo, cargo));
                                                cc = !cc;
                                                break;
                                            case 4:
                                                titulo = ("Ingeniero");
                                                Ase.add(NewEmpleado(titulo, cargo));
                                                cc = !cc;

                                                break;
                                            case 5:
                                                titulo = ("Doctor");
                                                Ase.add(NewEmpleado(titulo, cargo));
                                                cc = !cc;
                                                break;
                                            default:
                                                System.out.println("Error intente de nuevo");
                                                break;
                                        }
                                    }
                                    ccc = !ccc;
                                    break;
                                }
                                case 3: {
                                    cargo = "Cajero";
                                    System.out.println("1. Bachiller ||| 2. Licenciado ||| 3. Abogado ||| 4. Ingeniero ||| 5. Doctor");
                                    int tit = read.nextInt();
                                    boolean cc = false;
                                    while (cc) {
                                        String titulo;
                                        switch (tit) {
                                            case 1:
                                                titulo = "Bachiller";
                                                Caj.add(NewEmpleado(titulo, cargo));
                                                cc = !cc;
                                                break;
                                            case 2:
                                                titulo = ("Licenciado");
                                                Caj.add(NewEmpleado(titulo, cargo));
                                                cc = !cc;
                                                break;
                                            case 3:
                                                titulo = ("Abogado");
                                                Caj.add(NewEmpleado(titulo, cargo));
                                                cc = !cc;
                                                break;
                                            case 4:
                                                titulo = ("Ingeniero");
                                                Caj.add(NewEmpleado(titulo, cargo));
                                                cc = !cc;
                                                break;
                                            case 5:
                                                titulo = ("Doctor");
                                                Caj.add(NewEmpleado(titulo, cargo));
                                                cc = !cc;
                                                break;
                                            default:
                                                System.out.println("Error intente de nuevo");
                                                break;
                                        }
                                    }
                                    ccc = !ccc;
                                    break;
                                }
                                case 4: {
                                    cargo = "Seguridad";
                                    System.out.println("1. Bachiller ||| 2. Licenciado ||| 3. Abogado ||| 4. Ingeniero ||| 5. Doctor");
                                    int tit = read.nextInt();
                                    boolean cc = false;
                                    while (cc) {
                                        String titulo;
                                        switch (tit) {
                                            case 1:
                                                titulo = "Bachiller";
                                                Seg.add(NewEmpleado(titulo, cargo));
                                                cc = !cc;
                                                break;
                                            case 2:
                                                titulo = ("Licenciado");
                                                Seg.add(NewEmpleado(titulo, cargo));
                                                cc = !cc;
                                                break;
                                            case 3:
                                                titulo = ("Abogado");
                                                Seg.add(NewEmpleado(titulo, cargo));
                                                cc = !cc;
                                                break;
                                            case 4:
                                                titulo = ("Ingeniero");
                                                Seg.add(NewEmpleado(titulo, cargo));
                                                cc = !cc;
                                                break;
                                            case 5:
                                                titulo = ("Doctor");
                                                Seg.add(NewEmpleado(titulo, cargo));
                                                cc = !cc;
                                                break;
                                            default:
                                                System.out.println("Error intente de nuevo");
                                                break;
                                        }
                                    }
                                }
                                ccc = !ccc;
                                break;
                                default:
                                    System.out.println("Error intente de nuevo");
                                    break;
                            }
                        }
                    } else {
                        System.out.println("Complete el Log In Para usar esta opcion\n");
                    }
                    break;
                }
                case 2: {
                    if (tf == true) {
                        if (Caj.isEmpty() && Man.isEmpty() && Seg.isEmpty() && Ase.isEmpty()) {
                            System.out.println("Se necesita tener empleados para despedirlos: ");
                        } else {
                            System.out.println("Elija el Cargo del Empleado a despedir: ");
                            System.out.println("1. Gerente ||| 2. Aseador ||| 3. Cajero ||| 4. Seguridad");
                            String cargo;
                            int car = read.nextInt();
                            boolean ccc = true;
                            while (ccc) {
                                switch (car) {
                                    case 1: {
                                        if (Man.isEmpty()) {
                                            System.out.println("Se necesita tener empleados para despedirlos: ");

                                        } else {
                                            ListArrayLists(Man);
                                            System.out.println("");
                                            System.out.println("elija el empleado a despedir: ");
                                            int des = read.nextInt();
                                            if (des <= Man.size() && des >= 0) {
                                                Man.remove(op);
                                                ccc = !ccc;
                                            } else {
                                                System.out.println("Error");
                                            }
                                        }
                                        break;
                                    }
                                    case 2: {
                                        if (Ase.isEmpty()) {
                                            System.out.println("Se necesita tener empleados para despedirlos: ");

                                        } else {
                                            ListArrayLists(Ase);
                                            System.out.println("");
                                            System.out.println("elija el empleado a despedir: ");
                                            int des = read.nextInt();
                                            if (des <= Ase.size() && des >= 0) {
                                                Ase.remove(op);
                                                ccc = !ccc;
                                            } else {
                                                System.out.println("Error");
                                            }
                                        }
                                        break;
                                    }
                                    case 3: {
                                        if (Caj.isEmpty()) {
                                            System.out.println("Se necesita tener empleados para despedirlos: ");

                                        } else {
                                            ListArrayLists(Caj);
                                            System.out.println("");
                                            System.out.println("elija el empleado a despedir: ");
                                            int des = read.nextInt();
                                            if (des <= Caj.size() && des >= 0) {
                                                Caj.remove(op);
                                                ccc = !ccc;
                                            } else {
                                                System.out.println("Error");
                                            }
                                        }
                                        break;
                                    }
                                    case 4: {
                                        if (Seg.isEmpty()) {
                                            System.out.println("Se necesita tener empleados para despedirlos: ");
                                        } else {
                                            ListArrayLists(Seg);
                                            System.out.println("");
                                            System.out.println("elija el empleado a despedir: ");
                                            int des = read.nextInt();
                                            if (des <= Seg.size() && des >= 0) {
                                                Seg.remove(op);
                                                ccc = !ccc;
                                            } else {
                                                System.out.println("Error");
                                            }
                                        }
                                        break;
                                    }
                                    default:
                                        System.out.println("Error intente de nuevo");
                                        break;
                                }
                            }
                        }
                    } else {
                        System.out.println("Complete el Log In Para usar esta opcion\n");
                    }
                    break;
                    //
                }
                case 3: {
                    if (tf == true) {
                        
                        System.out.println("Log in completado previamente\n");
                   
                    } else {
                        
                        System.out.println("User: ");
                        String user = read.next().toLowerCase();
                        System.out.println("Password: ");
                        String password = read.next().toLowerCase();
                        
                        if (user.equals(usuario) && password.equals(contrasena)) {
                            
                            System.out.println("Log in exitoso");
                            System.out.println("Bienvenido" + usuario + "\n");
                            tf = !tf;
                            
                        } else if (!(user.equals(usuario)) || !(password.equals(contrasena))){
                        
                            while (tf == false) {
                    
                                System.out.println("\nCredenciales Erroneas \n ");
                                System.out.println("User: ");
                                user = read.next().toLowerCase();
                                System.out.println("Password: ");
                                password = read.next().toLowerCase();
                                
                                if (user.equals(usuario) && password.equals(contrasena)) {
                                
                                    System.out.println("Log in exitoso");
                                    System.out.println("Bienvenido" + usuario + "\n");
                                    tf = !tf;
                                
                                }
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    if (tf == true) {
                        if (Caj.isEmpty()) {
                            System.out.println("Se necesita tener empleados para despedirlos.");
                        } else if (Man.size() > 2) {
                            System.out.println("Despida un Gerente para poder crear otro.");
                        } else if (!Caj.isEmpty() && Man.size() < 2 && Man.isEmpty()) {
                            ListArrayLists(Caj);
                            System.out.println("Elija un cajero: ");
                            int sel = read.nextInt();
                            if (sel > 0 && sel <= Caj.size()) {
                                Man.add(Caj.get(sel));
                                Caj.remove(sel);
                            }
                        }
                    } else {
                        System.out.println("Complete el Log In Para usar esta opcion\n");
                    }
                    break;
                }
                case 5: {
                    if (tf == true) {
                        if (Caj.isEmpty() && Man.isEmpty() && Seg.isEmpty() && Ase.isEmpty()) {
                            System.out.println("Se necesita tener empleados para despedirlos: ");
                        } else if (!Caj.isEmpty() || !Man.isEmpty() || !Seg.isEmpty() || !Ase.isEmpty()) {
                            System.out.println("1. Listar Todos los Empleados |||| 2. Lstar Empleados por Cargo");
                            int sel = read.nextInt();
                            switch (sel) {
                                case 1: {
                                    ListArrayLists(Emp);
                                }
                                case 2: {
                                    System.out.println("1. Gerente ||| 2. Aseador ||| 3. Cajero ||| 4. Seguridad");
                                    int car = read.nextInt();
                                    boolean ccc = true;
                                    while (ccc) {
                                        switch (car) {
                                            case 1:
                                                ListArrayLists(Man);
                                                ccc = !ccc;
                                                break;
                                            case 2:
                                                ListArrayLists(Ase);
                                                ccc = !ccc;
                                                break;
                                            case 3:
                                                ListArrayLists(Caj);
                                                ccc = !ccc;
                                                break;
                                            case 4:
                                                ListArrayLists(Seg);
                                                ccc = !ccc;
                                                break;
                                            default:
                                                System.out.println("Error intente de nuevo");
                                                break;
                                        }
                                    }
                                }
                                default: {
                                    System.out.println("Error");
                                }
                            }
                        }
                    } else {
                        System.out.println("Complete el Log In Para usar esta opcion\n");
                    }
                    break;
                }
                case 6: {
                    if (tf == true) {

                    } else {
                        System.out.println("Complete el Log In Para usar esta opcion\n");
                    }
                    break;
                }
                case 7: {
                    if (tf == true) {

                    } else {
                        System.out.println("Complete el Log In Para usar esta opcion\n");
                    }
                    break;
                }
                case 0: {
                    sn = ' ';
                }
                default: {
                    System.out.println("Opcion no reconocida\n");
                }
            }
        }
    }

    static Empleado NewEmpleado(String Titulo, String Cargo) {
        System.out.println("Nombre");
        String nombre = read.next();
        System.out.println("Apellido");
        String apellido = read.next();
        System.out.println("Edad");
        int edad = read.nextInt();
        System.out.println("Altura");
        double altura = read.nextDouble();
        System.out.println("Peso");
        double peso = read.nextDouble();
        System.out.println("Color");
        String color = read.next();
        System.out.println("Genero[(1) ][(2) ]");
        int gen = read.nextInt();
        String genero;
        switch (gen) {
            case 1:
                genero = "Masculino";
            case 2:
                genero = "Femenino";
            default:
                genero = "Indefinido";
        }
        return new Empleado(edad, altura, peso, nombre, Titulo, apellido, Cargo, color, genero);
    }

    static Empleado ModEmpleado(Empleado empleado, String genero) {
        System.out.println("Nombre");
        String nombre = read.next();

        System.out.println("Apellido");
        String apellido = read.next();

        System.out.println("Edad");
        int edad = read.nextInt();

        System.out.println("Altura");
        double altura = read.nextDouble();

        System.out.println("Peso");
        double peso = read.nextDouble();

        System.out.println("Color");
        String color = read.next();

        System.out.println("Nuevo Cargo");
        System.out.println("1. Gerente ||| 2. Aseador ||| 3. Cajero ||| 4. Seguridad");
        String cargo = null;
        int car = read.nextInt();
        boolean ccc = true;
        while (ccc) {
            switch (car) {
                case 1:
                    if (Man.size() >= 2) {
                        System.out.println("No hay posisciones disponible");
                    } else {
                        cargo = "Gerente";
                        ccc = !ccc;
                    }
                    break;
                case 2:
                    cargo = "Aseador";
                    ccc = !ccc;
                    break;
                case 3:
                    cargo = "Cajero";
                    ccc = !ccc;
                    break;
                case 4:
                    cargo = "Seguridad";
                    ccc = !ccc;
                    break;
                default:
                    System.out.println("Error intente de nuevo");
                    break;
            }
        }

        System.out.println("Nuevo Titulo");
        System.out.println("1. Bachiller ||| 2. Licenciado ||| 3. Abogado ||| 4. Ingeniero ||| 5. Doctor");
        int tit = read.nextInt();
        boolean cc = false;
        String titulo = null;
        while (cc) {
            switch (tit) {
                case 1:
                    titulo = "Bachiller";
                    cc = !cc;
                    break;
                case 2:
                    titulo = ("Licenciado");
                    cc = !cc;
                    break;
                case 3:
                    titulo = ("Abogado");
                    cc = !cc;
                    break;
                case 4:
                    titulo = ("Ingeniero");
                    cc = !cc;
                    break;
                case 5:
                    titulo = ("Doctor");
                    cc = !cc;
                    break;
                default:
                    System.out.println("Error intente de nuevo");
                    break;
            }
        }
        return new Empleado(edad, altura, peso, nombre, titulo, apellido, cargo, color, genero);
    }
    

    static void ListArrayLists(ArrayList ArrayList) {
        for (int i = 0; i < ArrayList.size(); i++) {
            System.out.print("[(" + i + ")" + ArrayList.get(i) + "]");
        }
        System.out.println("");
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_david.zavala;

import java.util.ArrayList;

public class Empleado {

    private int Edad;
    private double Altura, Peso;
    private String Nombre, Apellido, Titulo, Cargo, Color, Genero;
    static ArrayList<ArrayList> AEmpleados = new ArrayList();
        
    public Empleado() {
    }

    public Empleado(int Edad, double Altura, double Peso, String Nombre, String Titulo, String Apellido, String Cargo, String Color, String Genero) {
        this.Edad = Edad;
        this.Altura = Altura;
        this.Peso = Peso;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cargo = Cargo;
        this.Color = Color;
        this.Genero = Genero;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public ArrayList<ArrayList> getAEmpleados() {
        return AEmpleados;
    }

    public void setAEmpleados(ArrayList<ArrayList> AEmpleados) {
        this.AEmpleados = AEmpleados;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Edad=" + Edad + ", Altura=" + Altura + ", Peso=" + Peso + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Titulo=" + Titulo + ", Cargo=" + Cargo + ", Color=" + Color + ", AEmpleados=" + AEmpleados + '}';
    }

}

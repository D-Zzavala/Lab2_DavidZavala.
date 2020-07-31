/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_davidzavala;

public class Empleados {

    private String Nombre, Apellido, Color, Cargo, Titulo, Genero;
    ;
    private double Altura, Peso;
    private int Edad;

    public Empleados() {
    }

    public Empleados(String Nombre, String Apellido, String Color, String Titulo, String Genero, double Altura, double Peso, int Edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Color = Color;
        this.Titulo = Titulo;
        this.Genero = Genero;
        this.Altura = Altura;
        this.Peso = Peso;
        this.Edad = Edad;
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

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
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

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    
    @Override
    public String toString() {
        return "Empleados{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Color=" + Color + ", Cargo=" + Cargo + ", Titulo=" + Titulo + ", Altura=" + Altura + ", Peso=" + Peso + ", Edad=" + Edad + ", Genero=" + Genero + '}';
    }

}

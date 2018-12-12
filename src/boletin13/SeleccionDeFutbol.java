/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13;

/**
 *
 * @author oracle
 */
public class SeleccionDeFutbol {
    int id;
    String Nombre;
    String Apellidos;
    int Edad;

public SeleccionDeFutbol() {

    }

    public SeleccionDeFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.Edad = edad;
    }

    @Override
    public String toString() {
        return  "id=" + id + "\n Nombre=" + Nombre + "\n Apellidos=" + Apellidos + "\n Edad=" + Edad;
    }

    public void concentrarse() {
        System.out.println("concentrase a seleccion");
    }
    
    public void viajar() {
        System.out.println("viaxa a seleccion");
    }

}

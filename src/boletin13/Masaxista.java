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
public class Masaxista extends SeleccionDeFutbol {
      private String Titulacion;
    private int anosExperiencia;


    
    public Masaxista() {
        super();
    }

    public Masaxista(int id, String nombre, String apellidos, int edad, String Titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.Titulacion = Titulacion;
        this.anosExperiencia = aniosExperiencia;
    }

    public void setTitulacion(String Titulacion) {
        this.Titulacion = Titulacion;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    


    public String getTitulacion() {
        return Titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public int getEdad() {
        return Edad;
    }
    
    //otros
    
    public void darMasaje() {

    }

    @Override
    public String toString() {
        return "Masaxista:"+super.toString() + "\n Titulacion=" + Titulacion + "\n aniosExperiencia=" + anosExperiencia ;
    }

    @Override
    public void viajar() {
        System.out.println("viaxa o masaxista"); 
    }
    
    
    
}

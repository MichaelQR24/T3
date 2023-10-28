/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3;

/**
 *
 * @author Micha
 */
public class Persona implements Tienda {
     private String nombre;
    private String ropa;
    private String precio;

    public Persona(String nombre, String apellido, String precio) {
        this.nombre = nombre;
        this.ropa = apellido;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getropa() {
        return ropa;
    }

    public void setropa(String ropa) {
        this.ropa = ropa;
    }

    public String getprecio() {
        return precio;
    }

    public void setprecio(String precio) {
        this.precio = precio;
    }
    public String getTexto(){
        return (this.nombre + " | " +
                this.ropa + " | Ropa: " 
                + this.precio+ " soles");
    }
    

    @Override
    public String obtenerInformacion() {
        return "Nombre: " + nombre + ", Ropa: " + ropa + ", Precio: " + precio;
    }
    
}

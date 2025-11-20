/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.groupo.pkg2;

/**
 *
 * @author Laboratorio
 */
public class Barista {
    private String nombre;
    private String menu[];

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getMenu() {
        return menu;
    }

    public void setMenu(String[] menu) {
        this.menu = menu;
    }

    public Barista(String nombre, String[] menu) {
        this.nombre = nombre;
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Barista{" + "nombre=" + nombre + ", menu=" + menu + '}';
    }
    
    
}

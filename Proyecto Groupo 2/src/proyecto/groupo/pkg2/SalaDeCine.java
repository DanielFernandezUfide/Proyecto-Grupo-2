/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.groupo.pkg2;

/**
 *
 * @author Laboratorio
 */
public class SalaDeCine {
    private String Pelicula;
    private int sillas [][];

    public String getPelicula() {
        return Pelicula;
    }

    public void setPelicula(String Pelicula) {
        this.Pelicula = Pelicula;
    }

    public int[][] getSillas() {
        return sillas;
    }

    public void setSillas(int[][] sillas) {
        this.sillas = sillas;
    }

    public SalaDeCine(String Pelicula, int[][] sillas) {
        this.Pelicula = Pelicula;
        this.sillas = sillas;
    }

    
    @Override
    public String toString() {
        return "SalaDeCine{" + "Pelicula=" + Pelicula + ", sillas=" + sillas + '}';
    }
    
    
}

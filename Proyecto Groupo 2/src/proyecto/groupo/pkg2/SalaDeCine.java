/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.groupo.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class SalaDeCine {
    private String Pelicula;
    private String sillas [][];
    private Empleado[][] empleados;
    
    public SalaDeCine(String Pelicula, int filasSillas, int columnasSillas) {
        this.Pelicula = Pelicula;
        this.sillas = new String [filasSillas][columnasSillas];
    }

    public String getPelicula() {
        return Pelicula;
    }

    public void setPelicula(String Pelicula) {
        this.Pelicula = Pelicula;
    }

    public String[][] getSillas() {
        return sillas;
    }

    public void setSillas(int filasSillas, int columnasSillas) {
        this.sillas = new String [filasSillas][columnasSillas];
        for (int i = 0; i < filasSillas; i++) {
            for (int j = 0; j < columnasSillas; j++) {
                sillas[i][j] = "L";
            }
        }
    }

    public Empleado[][] getEmpleado() {
        return empleados;
    }

    public void setEmpleado(Empleado[][] empleados, int filasSillas, int columnasSillas) {
        this.empleados = new Empleado [filasSillas][columnasSillas];
        
    }


    
    
    @Override
    public String toString() {
        return "SalaDeCine{" + "Pelicula=" + Pelicula + ", sillas=" + sillas + '}';
    }

   
    
    public void MostrarCine (int filasSillas, int columnasSillas) {
        String sala = "Pelicula: " + this.Pelicula;
        sala += "\n";
        sala += "L: Libre";
        sala += "\n";
        sala += "O: Ocupado";
        sala += "\n";
        sala += "        ___________ Pantalla";
        
        String letras = "ABCDEFGHIJKMNLOPQRSTUVWXYZ";
        for (int i = 0; i < this.sillas.length; i++) {
            sala += "\n";
            sala += letras.charAt(i) + "      ";
            
            for (int j = 0; j < this.sillas[0].length; j++) {
                sala += sillas[i][j] + "  ";    
            }
        }
        sala += "\n";
        sala += "        ";
        for (int i = 0; i < this.sillas[0].length; i++) {
            sala += (i+1) + "  ";
        }
        
        JOptionPane.showMessageDialog(null, sala);
    }
    
}

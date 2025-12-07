/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.groupo.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class ProyectoGroupo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables para Cines
        int filasSalas = 5;
        int columnasSalas = 6;
        int cantidadSalas = 2;
        SalaDeCine[] sala = CrearCines(filasSalas, columnasSalas, true, cantidadSalas);
        Menu(filasSalas,columnasSalas, cantidadSalas, sala);
    }
    
    
    
   public static void Menu (int filasSalas,int columnasSalas, int cantidadSalas, SalaDeCine[] sala) {
       while (true) {
           String menu = "=======Sistema de gestion de beneficios empresariales=======";
            menu += "\n";
            menu += "Seleccione una de las siguientes opciones:";
            menu += "\n";
            menu += "1- Cine";
            menu += "\n";
            menu += "2- Gimnasio";
            menu += "\n";
            menu += "3- Clases";
            menu += "\n";
            menu += "4- Cafeteria";
            menu += "\n";
            menu += "5- Salir";
            int seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch (seleccion) {
               case 1:
                   MenuCine(filasSalas,columnasSalas, cantidadSalas, sala);
                   break;
               case 2:
                   
                   break;
               case 3:
                   
                   break;
               case 4:
                   
                   break;
               case 5:
                   return;
           }
       }
       
    }
        
   public static void MenuCine (int filasSalas,int columnasSalas, int cantidadSalas, SalaDeCine[] sala){
       while (true) {           
          String menu = "=======Menu del Cine=======";
            menu += "\n";
            menu += "Seleccione una de las siguientes opciones:";
            menu += "\n";
            menu += "1- Ver salas";
            menu += "\n";
            menu += "2- Modificar salas";
            menu += "\n";
            menu += "3- Crear sala";
            menu += "\n";
            menu += "4- Gestionar reservaciones";
            menu += "\n";
            menu += "5- volver";
            menu += "\n";
            int seleccion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (seleccion) {
              case 1:
                   VerCines(sala, filasSalas, columnasSalas, cantidadSalas);
                   break;
              case 2:
                  ModificarCines(sala, filasSalas, columnasSalas, cantidadSalas);
                  break;
              case 3:

                  break;
              case 4:

                  break;
              case 5:
                  return;
            }
        }
    }   
   
   
   public static SalaDeCine[] CrearCines(int filasSalas, int columnasSalas, boolean inicio, int cantidadSalas){
        
        if (inicio){
            cantidadSalas = 2;
        }else{
            cantidadSalas = Integer.parseInt(JOptionPane.showInputDialog(""));
        }
        
        SalaDeCine sala[] = new SalaDeCine[cantidadSalas];
        
        if (inicio){
            for (int i = 0; i < cantidadSalas; i++) {
                switch (i){
                    case 0:
                        sala[i] = new SalaDeCine("Shrek 2", filasSalas, columnasSalas);
                        sala[i].setSillas(filasSalas, columnasSalas);
                        break;   
                    case 1:
                        sala[i] = new SalaDeCine("Alien", filasSalas, columnasSalas);
                        sala[i].setSillas(filasSalas, columnasSalas);
                        break;
                }
            }
        }
        return sala;
    }
   
   
   public static void VerCines(SalaDeCine[] sala, int filasSalas, int columnasSalas, int cantidadSalas){
       while (true) {   
            String listaSalas = "=======Salas de Cine=======";
            listaSalas += "\n";

            for (int i = 0; i < cantidadSalas; i++) {
                listaSalas += "Sala " + (i+1) + ": ";
                listaSalas += sala[i].getPelicula();
                listaSalas += "\n";
             }
            listaSalas += "Seleccione que sala desea ver. Utilize \"-1\" para salir";
            int seleccion = Integer.parseInt(JOptionPane.showInputDialog(listaSalas));

            for (int i = 0; i < cantidadSalas; i++) {
                if (seleccion == -1) {
                    return;
                }else if (seleccion == (i+1)){
                    sala[i].MostrarCine(filasSalas, columnasSalas);
                    break;
                }
            }
       }
       
   }
   
   public static void ModificarCines(SalaDeCine[] sala, int filasSalas, int columnasSalas, int cantidadSalas){
       String menu = "=======Salas Disponibles=======";
       menu += "\n";
       for (int i = 0; i < cantidadSalas; i++) {
           menu += "Sala " + (i+1) + ": ";
           menu += sala[i].getPelicula() + " " ;
           menu += "cantidad de asientos: " + (sala[i].getSillas().length * sala[i].getSillas()[0].length);
           menu += "\n";
        }
       menu += "Seleccione cual sala modificar.Ingrese \"-1\" para salir";
       int seleccionSala = Integer.parseInt(JOptionPane.showInputDialog(menu));
       menu = "¿Que desea modificar de la sala " + seleccionSala + "?";
       menu += "\n";
       menu += "1- Pelicula";
       menu += "\n";
       menu += "2- Cantidad de Sillas";
       menu += "\n";
       menu += "3- Menu anterior";
       int seleccionModificar = Integer.parseInt(JOptionPane.showInputDialog(menu));
       switch (seleccionModificar) {
           case 1:
               sala[(seleccionSala-1)].setPelicula(JOptionPane.showInputDialog("Ingrese el nombre de la pelicula"));
               break;
           case 2:
               sala[(seleccionSala-1)].setSillas(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de filas")), Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de columnas")));
               break;
           case 3:
               break;               
       }
   }
   
}

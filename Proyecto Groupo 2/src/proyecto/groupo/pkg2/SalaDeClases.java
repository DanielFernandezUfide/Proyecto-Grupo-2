/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.groupo.pkg2;

/**
 *
 * @author Laboratorio
 */
public class SalaDeClases {
    private String tipoDeClase;
    private int horario;
    private int cupos;

    public String getTipoDeClase() {
        return tipoDeClase;
    }

    public void setTipoDeClase(String tipoDeClase) {
        this.tipoDeClase = tipoDeClase;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public SalaDeClases(String tipoDeClase, int horario, int cupos) {
        this.tipoDeClase = tipoDeClase;
        this.horario = horario;
        this.cupos = cupos;
    }

    @Override
    public String toString() {
        return "SalaDeClases{" + "tipoDeClase=" + tipoDeClase + ", horario=" + horario + ", cupos=" + cupos + '}';
    }
    
    
}

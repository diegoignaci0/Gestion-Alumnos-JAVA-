/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioalumno;
import java.util.ArrayList;
/**
 *
 * @author sonia
 */
public class Manejadora {
    private ArrayList<Alumno>alumnos=new ArrayList<Alumno>();

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    public int buscarAlumno(String rut)
    {
        for (int i = 0; i < alumnos.size(); i++) {
            if(alumnos.get(i).getRut().compareToIgnoreCase(rut)==0)
                return i;
        }
        return -1;
    }
    
    public String ingresarAlumno(Alumno alu)
    {
        if(buscarAlumno(alu.getRut())==-1)
        {
            alumnos.add(alu);
            return "Alumno ingresado";
        }
        return "Alumno ya existe";
    }
    
    public String eliminarAlumno(String rut)
    {
        if(buscarAlumno(rut)==-1)
            return "No se puede eliminar.. Alumno no existe";
        alumnos.remove(buscarAlumno(rut));
        return "Alumno eliminado";
    }
}

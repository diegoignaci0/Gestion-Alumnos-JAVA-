/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioalumno;

/**
 *
 * @author CETECOM
 */
public class Alumno {
    private String nombre;
    private String rut;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedioControles;

    public Alumno(String nombre, String rut, double nota1, double nota2, double nota3, double promedioControles) {
        this.nombre = nombre;
        this.rut = rut;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.promedioControles = promedioControles;
    }

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getPromedioControles() {
        return promedioControles;
    }

    public void setPromedioControles(double promedioControles) {
        this.promedioControles = promedioControles;
    }
    
    

   
    public double notaPresentacion()
    {
        return nota1*0.2+nota2*0.3+nota3*0.3+promedioControles*0.2;
    }
    
    public double notaFinal(double notaExamen)
    {
        return notaPresentacion()*0.6+notaExamen*0.4;
    }
    
    public String situacion(double notaExamen)
    {
        if(notaFinal(notaExamen)>=3.95)
            return "\nFelicitaciones Aprobó la asignatura";
        return "\nLamentablemente Reprobó la asignatura";
    }
    public String toString()
    {
        return "\nRut: "+rut+" Nombre: "+nombre+" Nota1: "+nota1+" Nota2: "+nota2+" Nota3: "+nota3+" Prom. cont.: "+promedioControles;
    }
}


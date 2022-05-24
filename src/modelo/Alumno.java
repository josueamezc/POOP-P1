/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Equipo1
 */

public class Alumno {
    /**
     * Informacion general de alumnos
     */
    public String nombre;
    public int edad;
    public int semestre;
    public String direccion;
    public ArrayList<Calificacion> materias = new ArrayList<>(); 
    public double promedio;
    public int numCreditos;
    public int numCuenta;
    public double numInsc;
    // lista ligada asignaturas //
    
    /**
     * 
     * @param nombre permite la asignación al nombre del alumno
     */
    public Alumno(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Constructor vacio
     */
    public Alumno() {
    }
    /**
     * 
     * @param nombre recibe el nombre del alumno
     * @param edad recibe la edad del alumno
     * @param semestre recibe el semestre del alumno
     * @param direccion recibe la direccion del alumno
     * @param promedio recibe el promedio del alumno
     * @param numCreditos recibe el numero de creditos del alumno
     * @param NumCuenta recibe el numero de cuenta del alumno
     */
    public Alumno(String nombre, int edad, int semestre, String direccion, double promedio, int numCreditos, int NumCuenta) {
        this.nombre = nombre;
        this.edad = edad;
        this.semestre = semestre;
        this.direccion = direccion;
        this.promedio = promedio;
        this.numCreditos = numCreditos;
        this.numCuenta = NumCuenta;
    }
       
    
    
}

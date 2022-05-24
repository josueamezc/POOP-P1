/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Equipo1
 */
public class Calificacion {
    
    public String materia;
    public int calif;
    /**
     * Asignacion de calificacion
     * @param materia recibe el nombre de la materia
     * @param calif recibe la califacion de la materia
     */
    public Calificacion(String materia, int calif) {
        this.materia = materia;
        this.calif = calif;
    }
    
    
}

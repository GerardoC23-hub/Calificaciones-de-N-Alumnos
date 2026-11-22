/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listacalificaciones;

public class Nodo {

    private double calificacion;
    private Nodo siguiente;

    public Nodo(double calificacion) {
        this.calificacion = calificacion;
        this.siguiente = null;
    }
    
  
    public Nodo(double calificacion, Nodo siguiente) {
        this.calificacion = calificacion;
        this.siguiente = siguiente;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }


}

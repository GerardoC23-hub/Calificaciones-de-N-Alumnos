/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listacalificaciones;

/**
 *
 * @author gerardo
 */

public class ListaEnlazada {
    private Nodo cabeza;
    private int tamano;

    // Constructor por defecto
    public ListaEnlazada() {
        cabeza = null;
        tamano = 0;
    }

    // Validar si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Caso 6: total de estudiantes
    public int getTamano() {
        return tamano;
    }

    // Inserta manteniendo el orden de menor a mayor
    public void insertar(double calificacion) {
        // Al inicio
        if (estaVacia() || calificacion <= cabeza.getCalificacion()) {
            cabeza = new Nodo(calificacion, cabeza);
        } else {
            // Buscar el nodo anterior a donde va
            Nodo aux = cabeza;
            while (aux.getSiguiente() != null
                    && aux.getSiguiente().getCalificacion() < calificacion) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(new Nodo(calificacion, aux.getSiguiente()));
        }
        tamano++;
    }

    // Caso 1: ver la lista ordenada
    public String toString() {
        String resultado = "";
        Nodo aux = cabeza;
        while (aux != null) {
            resultado += aux.getCalificacion() + " ";
            aux = aux.getSiguiente();
        }
        return resultado;
    }

    // Caso 2: calificación mínima (la cabeza)
    public double getMinima() {
        if (estaVacia()) return -1;
        return cabeza.getCalificacion();
    }

    // Caso 2: calificación máxima (el último nodo)
    public double getMaxima() {
        if (estaVacia()) return -1;
        Nodo aux = cabeza;
        while (aux.getSiguiente() != null) {
            aux = aux.getSiguiente();
        }
        return aux.getCalificacion();
    }

    // Caso 2: mediana
    public double getMediana() {
        if (estaVacia()) return -1;
        Nodo aux = cabeza;
        int mitad = tamano / 2;

        if (tamano % 2 != 0) {
            // Impar: nodo del centro
            for (int i = 0; i < mitad; i++) {
                aux = aux.getSiguiente();
            }
            return aux.getCalificacion();
        } else {
            // Par: promedio de los dos centrales
            for (int i = 0; i < mitad - 1; i++) {
                aux = aux.getSiguiente();
            }
            return (aux.getCalificacion() + aux.getSiguiente().getCalificacion()) / 2;
        }
    }

    // Caso 3: eliminar una calificación
    public boolean eliminar(double calificacion) {
        if (estaVacia()) return false;

        // Está al inicio: la cabeza pasa al siguiente
        if (cabeza.getCalificacion() == calificacion) {
            cabeza = cabeza.getSiguiente();
            tamano--;
            return true;
        }

        // Está en medio o al final
        Nodo aux = cabeza;
        while (aux.getSiguiente() != null) {
            if (aux.getSiguiente().getCalificacion() == calificacion) {
                // Se salta el nodo a eliminar
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
                tamano--;
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false; // No se encontró
    }

    // Caso 5: buscar una calificación
    public boolean buscar(double calificacion) {
        Nodo aux = cabeza;
        while (aux != null) {
            if (aux.getCalificacion() == calificacion) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    // Caso 4: corregir una calificación
    public boolean corregir(double vieja, double nueva) {
        if (estaVacia()) return false;
        if (!buscar(vieja)) return false;

        eliminar(vieja);
        insertar(nueva); // Se inserta en su posición correspondiente
        return true;
    }
}




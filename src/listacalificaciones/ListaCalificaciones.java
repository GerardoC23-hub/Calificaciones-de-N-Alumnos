/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listacalificaciones;

/**
 *
 * @author gerardo
 */
public class ListaCalificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
    lista.insertar(9);
    lista.insertar(8.2);
    lista.insertar(10);
    lista.insertar(8.5);
    lista.insertar(9.5);

    System.out.println(lista);                  // 8.2 8.5 9.0 9.5 10.0
    System.out.println(lista.getMinima());      // 8.2
    System.out.println(lista.getMaxima());      // 10.0
    System.out.println(lista.getMediana());     // 9.0
    System.out.println(lista.buscar(8.8));      // false
    System.out.println(lista.eliminar(8.5));    // true
    System.out.println(lista.corregir(9, 8.8)); // true
    System.out.println(lista.getTamano());      // 4
    }
    
}

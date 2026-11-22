LISTA ENLAZADA ORDENADA DE CALIFICACIONES
=========================================

Proyecto en Java para la materia de Estructura de Datos. Implementa una
lista enlazada simple que guarda calificaciones (double) siempre ordenadas
de menor a mayor.


ESTRUCTURA DEL PROYECTO
-----------------------
Nodo.java            Nodo con calificacion y referencia al siguiente
ListaEnlazada.java   Lista con cabeza y tamano


CLASES
------

Nodo
- Atributos privados: calificacion (double) y siguiente (Nodo).
- Dos constructores: uno para insertar al final y otro para insertar al inicio.
- Getters y setters.

ListaEnlazada
- Atributos privados: cabeza (Nodo) y tamano (int).
- Constructor por defecto que inicializa los atributos.
- estaVacia() valida si la lista esta vacia y se reutiliza en otros metodos.


CASOS DE USO
------------

Caso 1: toString()
  Muestra la lista ordenada de menor a mayor, recorriendola con un nodo
  auxiliar.

Caso 2: getMinima(), getMaxima(), getMediana()
  - getMinima(): devuelve la calificacion de la cabeza (la menor).
  - getMaxima(): recorre hasta el ultimo nodo (la mayor).
  - getMediana(): si el tamano es impar devuelve el nodo del centro; si es
    par, el promedio de los dos centrales.

Caso 3: eliminar(double)
  Elimina una calificacion invalida. Devuelve true si se elimino, false si
  no existe o la lista esta vacia.

Caso 4: corregir(double vieja, double nueva)
  Reemplaza una calificacion por la correcta: busca, elimina e inserta la
  nueva en su posicion.

Caso 5: buscar(double)
  Devuelve true si alguien saco esa calificacion, false si no.

Caso 6: getTamano()
  Devuelve el total de estudiantes.


COMO FUNCIONA LA INSERCION
--------------------------
Como las calificaciones se insertan de forma ordenada, el metodo
insertar(double) coloca cada valor en su posicion correcta, ya sea al
inicio, en medio o al final. Por eso la minima es siempre la cabeza y la
maxima el ultimo nodo.


EJEMPLO DE USO
--------------
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


AUTOR
-----
Gerardo Cruz Hernandez

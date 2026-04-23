//crear el proyecto arbol binario
//se agrego el link a txt
package com.mycompany.arbolbinario;

public class ArbolBinario {
     // Clase Nodo (define cómo es cada nodo)
    static class Nodo {
        int dato; // valor que guarda el nodo
        Nodo izquierdo; // apunta al hijo izquierdo
        Nodo derecho; // apunta al hijo derecho

        // Constructor
        Nodo(int dato) {
            this.dato = dato;// guarda el valor
            this.izquierdo = null; // no tiene hijo izquierdo al inicio
            this.derecho = null; // no tiene hijo derecho al inicio
        }
    }
    public static void main(String[] args) {

        Nodo raiz = new Nodo(10); // nodo principal

        // Crear hijos
        raiz.izquierdo = new Nodo(5); // hijo izquierdo de 10
        raiz.derecho = new Nodo(20); // hijo derecho de 10

        // Hijos del nodo 5
        raiz.izquierdo.izquierdo = new Nodo(3); // hijo izquierdo de 5
        raiz.izquierdo.derecho = new Nodo(7);   // hijo derecho de 5

        // Mostrar algunos valores, sirve´para comprobar
        System.out.println("Raíz: " + raiz.dato); // imprime 10
        System.out.println("Izquierdo de raíz: " + raiz.izquierdo.dato); // imprime 5
        System.out.println("Derecho de raíz: " + raiz.derecho.dato); // imprime 20
    }
}

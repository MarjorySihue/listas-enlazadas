/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marjory;

/**
 * Clase que implementa las funcionalidades
 *
 * @author Marjory
 */
public class ListaEnlazada<T> {

    private Nodo inicio; // inicia recorrido
    private Nodo fin; // termina el recorrido.

    /**
     * Método para saber si lista está vacía
     * @return 
     */
    private boolean isEmpty() {
        return inicio == null;
    }

    // Método para agregar dato al final
    public void add(T dato) {
        Nodo<T> nuevoNodo = new Nodo<T>(dato);
        if (isEmpty()) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        }else{
            fin.enlazar(nuevoNodo);
            fin = nuevoNodo;
        }
    }
    
    public int size(){
        int contador = 0;
        if (!isEmpty()) {
            Nodo temporal = inicio;
            while (temporal != null) {
                temporal = temporal.getSiguiente();
                contador++;
            }
        }
        return contador;
    }
    
    public void remove(int pos){
        Nodo nodoLeft = getNodo(pos - 1);
        Nodo nodoRight = getNodo(pos + 1);
        nodoLeft.enlazar(nodoRight);
//        System.out.println("nodoLeft" + nodoLeft);
//        System.out.println("nodoRight" + nodoRight);
    }
    
    /**
     * Devuelve el nodo de la posicion pos
     * @param pos
     * @return null si no existe
     */
    public Nodo getNodo(int pos){
        Nodo buscado = null;
        if(pos > 0 && pos < size()){
            buscado = inicio;
            for (int i = 0; i < pos; i++) {
                buscado = buscado.getSiguiente();
            }
        }
        
        return buscado;
    }

    /**
     * Método para mostrar lista
     */
    public void print() {
        if (!isEmpty()) {
            Nodo actual = inicio;
            while (actual != null) {
                actual.print();
                actual = actual.getSiguiente();
            }
            System.out.println("");
        } else {
            mensaje();
        }
    }

    /**
     * método para agregar un dato al inicio
     * @param dato 
     */
//    public void agregarNodoInicio(int dato) {
//        inicio = new Nodo(dato, inicio);
//        if (fin == null) {
//            fin = inicio;
//        }
//    }

    /**
     * Método para borrar lista total
     */
    public void borrarLista() {
        inicio = null;
        fin = null;
    }

    // método para saber si existe nodo
    private boolean existeNodo(int dato) {
        Nodo temporal = inicio;
        boolean estado = false;
        int contador = 0;
        while (temporal != null && estado != true) {
//            if (dato == temporal.dato) {
//                contador++;
//                estado = true;
//            } else {
//                temporal = temporal.siguiente;
//            }
        }
        return estado;
    }

    // método para saber la posición del nodo
    public void posicionNodo(int posicion) {
        Nodo temporal = inicio;
        int contador = 0;
        if (existeNodo(posicion)) {
//            while (posicion != temporal.dato) {
//                contador++;
//                temporal = temporal.siguiente;
//            }
            System.out.println("Posición del nodo: " + contador);
        } else {
            System.out.println("No existe nodo ingresado");
        }
    }

    // método para editar un nodo en específico
    public void editarNodoPorPosicion(int posicion, int valor) {

        /**
         * 1.preguntar si la posicion existe 
         * 2.Si existe, preguntar si es la posicion 0 y actualizar con el nuevo valor. 
         * 3.Si no lo fuera, recorrer lista hasta la posicion correcta y actualizar con nuevo valor.
         */
    }

    private void mensaje() {
        System.out.println("No hay nodos en la Lista ");
    }

}

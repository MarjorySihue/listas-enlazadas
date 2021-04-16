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
public class LinkedList {

    // toda lista debe tener referencia a un inicio y fin
    private Nodo inicio; // puntero que inicia el recorrido.
    private Nodo fin; // puntero que termina el recorrido.

    public LinkedList() {
        inicio = null;
        fin = null;
    }

    // Método para saber si lista está vacía
    public boolean estaVacia() {
        return inicio == null;
    }

    //método para agregar un nodo al inicio
    public void agregarDatoInicio(int dato) {
        inicio = new Nodo(dato, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }

    // Método para agregar dato al final
    public void agregarDatoFinal(int dato) {
        if (!estaVacia()) {
            fin.siguiente = new Nodo(dato);
            fin = fin.siguiente;
        } else {
            inicio = fin = new Nodo(dato);
        }
    }

    // Método para mostrar la lista
    public void mostrarLista() {
        Nodo recorrer = inicio;
        while (recorrer != null) {
            System.out.print("[" + recorrer.dato + "]-->");
            recorrer = recorrer.siguiente;
        }
    }

    // Método para borrar lista
    public void borrarLista() {
        inicio = null;
    }
    
    // método para editar un nodo en específico
    // método para eliminar un nodo en específico
    // método para saber la el total de nodos
}

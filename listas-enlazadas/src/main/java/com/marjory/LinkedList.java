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

    // M�todo para saber si lista est� vac�a
    public boolean estaVacia() {
        return inicio == null;
    }

    //m�todo para agregar un nodo al inicio
    public void agregarDatoInicio(int dato) {
        inicio = new Nodo(dato, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }

    // M�todo para agregar dato al final
    public void agregarDatoFinal(int dato) {
        if (!estaVacia()) {
            fin.siguiente = new Nodo(dato);
            fin = fin.siguiente;
        } else {
            inicio = fin = new Nodo(dato);
        }
    }

    // M�todo para mostrar la lista
    public void mostrarLista() {
        Nodo recorrer = inicio;
        while (recorrer != null) {
            System.out.print("[" + recorrer.dato + "]-->");
            recorrer = recorrer.siguiente;
        }
    }

    // M�todo para borrar lista
    public void borrarLista() {
        inicio = null;
    }
    
    // m�todo para editar un nodo en espec�fico
    // m�todo para eliminar un nodo en espec�fico
    // m�todo para saber la el total de nodos
}

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
public class List {

    private Nodo inicio; // inicia recorrido
    private Nodo fin; // termina el recorrido.

    public List() {
        inicio = null;
        fin = null;
    }

    // M�todo para saber si lista est� vac�a
    private boolean estaVacio() {
        return inicio == null;
    }

    // M�todo para agregar dato al final
    public void agregarNodoFinal(int dato) {
        if (!estaVacio()) {
            Nodo temporal = new Nodo(dato);
            fin.siguiente = temporal;
            fin = fin.siguiente;
        } else {
            inicio = fin = new Nodo(dato);
        }
    }

    // M�todo para mostrar lista
    public void mostrarLista() {
        if (!estaVacio()) {
            Nodo temporal = inicio;
            while (temporal != null) {
                System.out.print("(" + temporal.dato + ")-->");
                temporal = temporal.siguiente;
            }
        } else {
            mensaje();
        }
    }

    // m�todo para agregar un dato al inicio
    public void agregarNodoInicio(int dato) {
        inicio = new Nodo(dato, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }

    // M�todo para borrar lista total
    public void borrarLista() {
        inicio = null;
    }

    // m�todo para saber el total de nodos  
    public void mostrarTotalNodos() {
        if (!estaVacio()) {
            Nodo temporal = inicio;
            int contador = 0;
            while (temporal != null) {
                temporal = temporal.siguiente;
                contador++;
            }
            System.out.print("total de nodos: " + contador);
        } else {
            mensaje();
        }
    }

    // m�todo para saber si existe nodo
    private boolean existeNodo(int dato) {
        Nodo temporal = inicio;
        boolean estado = false;
        int contador = 0;
        while (temporal != null && estado != true) {
            if (dato == temporal.dato) {
                contador++;
                estado = true;
            } else {
                temporal = temporal.siguiente;
            }
        }
        return estado;
    }

    // m�todo para saber la posici�n del nodo
    public void posicionNodo(int posicion) {
        Nodo temporal = inicio;
        int contador = 0;
        if (existeNodo(posicion)) {
            while (posicion != temporal.dato) {
                contador++;
                temporal = temporal.siguiente;
            }
            System.out.println("Posici�n del nodo: " + contador);
        } else {
            System.out.println("No existe nodo ingresado");
        }
    }

    // m�todo para editar un nodo en espec�fico
    public void editarNodoPorPosicion(int posicion, int valor) {

    }

    // m�todo para eliminar nodo en especifico
    public void eliminarNodoPorPosicion(int posicion, int nuevoValor) {

    }

    private void mensaje() {
        System.out.println("No hay nodos en la Lista ");
    }

}

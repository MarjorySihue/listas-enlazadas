/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marjory;

/**
 *
 * @author Marjory
 */
public class Nodo<T> { // partes: dato/info y enlace/siguiente

    private T dato; //dato
    private Nodo siguiente; //enlace

    public Nodo(T d) {
        this.dato = d;
        this.siguiente = null;
    }

    public T getDato() {
        return dato;
    }
    
    public void enlazar(Nodo nodo){
        siguiente = nodo;
    }
    
    public Nodo getSiguiente(){
        return siguiente;
    }
    
    public void print(){
        System.out.println("(" + dato + ")-->" + siguiente);
    }

    @Override
    public String toString() {
        return "(" + dato + ")";
    }
}

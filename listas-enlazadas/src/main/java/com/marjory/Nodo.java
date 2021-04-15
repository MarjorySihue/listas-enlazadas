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
public class Nodo { // partes: dato/info y enlace/siguiente
    public int dato; //dato
    public Nodo siguiente; //enlace
    
    // constructor para insertar al final
    public Nodo(int d){
        this.dato = d;
        this.siguiente = null;
    }
    
    // constructor para insertar al inicio
    public Nodo(int d, Nodo n){
        dato = d;
        siguiente = n;
    }
}

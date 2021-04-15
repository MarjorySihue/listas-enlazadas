/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marjory;

import java.util.Scanner;

/**
 *
 * @author Marjory
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList lista = new LinkedList();
        int option;
        System.out.println("Mostrar Lista Vacia: ");
        lista.mostrarLista();                
        System.out.println("-----");
        
        //Agregando info
        lista.agregarDatoFinal(0);
        lista.agregarDatoFinal(10);
        lista.agregarDatoFinal(19);
        
        System.out.println("borrar lista: ");
        lista.borrarLista();
        
        System.out.println("Mostrar Lista con elementos agregados:");
        lista.mostrarLista();
        System.out.println("");
        System.out.println("-----");

    }
}

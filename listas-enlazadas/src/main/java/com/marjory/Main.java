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
        System.out.println("datos inicio");
        lista.agregarDatoInicio(8);
        lista.agregarDatoInicio(25);
        lista.mostrarLista();
        System.out.println("");
        System.out.println("dato final");
        lista.agregarDatoFinal(1);
        lista.agregarDatoFinal(10);
        lista.agregarDatoFinal(19);
        lista.mostrarLista();

    }
}

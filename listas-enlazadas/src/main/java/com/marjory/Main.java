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
        ListaEnlazada lista = new ListaEnlazada();

        //Agregando info
        System.out.println("datos agregados al inicio");
//        lista.agregarNodoInicio(23);
//        lista.agregarNodoInicio(25);
//        lista.agregarNodoInicio(17);
        lista.print();
        System.out.println("");
        System.out.println("datos agregados al final");
        lista.add(2);
        lista.add(10);
        lista.add(13);
        lista.print();
        System.out.println("");
        lista.print();
        System.out.println("");
        lista.posicionNodo(10);
        lista.editarNodoPorPosicion(1, 50);
        lista.print();

    }
}

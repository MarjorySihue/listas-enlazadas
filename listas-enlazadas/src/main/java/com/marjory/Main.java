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
        List lista = new List();

        //Agregando info
        System.out.println("datos agregados al inicio");
        lista.agregarNodoInicio(23);
        lista.agregarNodoInicio(25);
        lista.agregarNodoInicio(17);
        lista.mostrarLista();
        System.out.println("");
        System.out.println("datos agregados al final");
        lista.agregarNodoFinal(2);
        lista.agregarNodoFinal(10);
        lista.agregarNodoFinal(13);
        lista.mostrarLista();
        System.out.println("");
        lista.mostrarTotalNodos();
        System.out.println("");
        lista.posicionNodo(10);
        lista.editarNodoPorPosicion(1, 50);
        lista.mostrarLista();

    }
}

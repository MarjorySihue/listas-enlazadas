/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marjory;

import com.marjory.Nodo;
import org.junit.Test;

/**
 *
 * @author Omar
 */
public class NodoTest {
    @Test
    public void testNodoCrear() {
        Nodo<Integer> nodo = new Nodo<Integer>(5);
        Integer n = nodo.getDato();
        System.out.println("n:" + n);
        
        Nodo<String> nodos = new Nodo<String>("A");
        String s = nodos.getDato();
        System.out.println("s:" + s);
    }
}

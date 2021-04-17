package marjory;

import com.marjory.ListaEnlazada;
import com.marjory.Nodo;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ListaEnlazadaTest{
    @Test
    @Ignore
    public void testAgregarNodo_ListaVacia() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.add(2);
    }
    
    @Test
    @Ignore
    public void testAgregarNodo_ListaNoVacia() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.add(0);
        lista.add(1);
        lista.add(2);
        lista.print();
    }
    
    @Test
    @Ignore
    public void testLista_SizeNodos() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.add(0);
        lista.add(1);
        lista.add(2);
        System.out.println("total:" + lista.size());
    }
    
    @Test
    @Ignore
    public void testNodoPorPosicion_posicionExiste() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.add(0);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        Nodo nodo3 = lista.getNodo(3);
        
        System.out.println("nodo:" + nodo3);
    }
    
    @Test
    @Ignore
    public void testNodoPorPisicion_posicionNoExiste() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.add(0);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        
        Nodo nodo3 = lista.getNodo(8);
        System.out.println("nodo:" + nodo3);
    }
    
    @Test
    @Ignore
    public void testRemoveNodo_Existe(){
        ListaEnlazada<String> lista = new ListaEnlazada<>();
        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");
        lista.add("e");
        lista.add("f");
        lista.print();
        
        lista.remove(3);
        lista.print();
    }
}

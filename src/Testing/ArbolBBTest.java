/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import examenalgoritmos.*;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class ArbolBBTest {

    private ABB miArbol;

    public ArbolBBTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        miArbol = new ABB();

        miArbol.Agregar_Cliente(56856958, "Julian", 21);
        miArbol.Agregar_Cliente(49658547, "Martica", 40);
        miArbol.Agregar_Cliente(32158547, "Roberto", 33);
        miArbol.Agregar_Cliente(29653347, "Pepe", 19);
        miArbol.Agregar_Cliente(69652020, "Miguel", 52);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testPeso() {
        assertEquals(4, miArbol.getPeso(this.miArbol.getRaiz()));
    }

    @Test
    public void testAltura() {
        assertEquals(3, miArbol.altura());
    }

    @Test
    public void testEs_Cliente_True() {
        assertEquals(true, miArbol.es_Cliente(69652020));
    }

    @Test
    public void testEs_Cliente_False() {
        assertEquals(false, miArbol.es_Cliente(19652020));
    }

    @Test
    public void testEs_ClienteNodo() {
        assertEquals(29653347, miArbol.es_ClienteNodo(29653347).getCliente().getCi());
    }

    @Test
    public void testEs_Balanceado() {
        assertEquals(false, miArbol.es_Equilibrado());
    }

    @Test
    public void testAgregar_Cliente() {
        Cliente x = new Cliente(12345678, "Menganito", 20);
        miArbol.Agregar_Cliente(12345678, "Menganito", 20);
        assertEquals(x.getCi(), miArbol.es_ClienteNodo(12345678).getCliente().getCi());
    }

    @Test
    public void testes_Vacio() {
        assertEquals(false, miArbol.es_Vacio());
    }

    @Test
    public void testes_ArbolBinarioBusqueda() {
        assertEquals(true, miArbol.es_ArbolBinarioBusqueda());
    }

    @Test
    public void testhay_Camino() {
        assertEquals(true, miArbol.hay_Camino(miArbol.getRaiz(), miArbol.getRaiz().getIzq().getIzq()));
    }
    
    @Test
    public void testes_Completo(){
        assertEquals(false, miArbol.es_Completo());
    }

//    @Test
//    public void testEs_PadreSubArbol(){
//        
//        Nodo p = new Nodo(new Cliente(49658547, "Martica", 40));
//        Nodo n1 = new Nodo(new Cliente(32158547, "Roberto", 33));
//        Nodo n2 = new Nodo(new Cliente(29653347, "Pepe", 19));
//        assertEquals(p, miArbol.es_PadreSubArbol(n1, n2));
//    }
}

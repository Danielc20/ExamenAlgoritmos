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
        Cliente xC1 = new Cliente(56856958, "Julian", "Lopez");
        Cliente xC2 = new Cliente(49658547, "Martica", "Gimenez");
        Cliente xC3 = new Cliente(32158547, "Roberto", "Mamerto");
        Cliente xC4 = new Cliente(29653347, "Pepe", "Cohen");
        Cliente xC5 = new Cliente(69652020, "Miguel", "Aguado");

        miArbol = new ABB();
        
        miArbol.insertNodo(xC1);
        miArbol.insertNodo(xC2);
        miArbol.insertNodo(xC3);
        miArbol.insertNodo(xC4);
        miArbol.insertNodo(xC5);
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
        assertEquals(3, miArbol.getAltura());
    }

    @Test
    public void testEs_Cliente() {
        assertEquals(true, miArbol.es_Cliente(69652020));
    }

    @Test
    public void testEs_ClienteNodo() {
        assertEquals(29653347, miArbol.es_ClienteNodo(29653347).getCliente().getCi());
    }
    
    @Test
    public void testEs_Balanceado(){
        assertEquals(false, miArbol.es_Equilibrado());
    }
}

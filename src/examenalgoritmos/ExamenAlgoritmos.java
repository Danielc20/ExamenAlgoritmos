/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenalgoritmos;

/**
 *
 * @author Daniel
 */
public class ExamenAlgoritmos {

    private static ABB miArbol;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente xC1 = new Cliente(56856958, "Julian", "Lopez");
        Cliente xC2 = new Cliente(49658547, "Martica", "Gimenez");
        Cliente xC3 = new Cliente(32158547, "Roberto", "Mamerto");
        Cliente xC4 = new Cliente(29653347, "Pepe", "Cohen");
        Cliente xC5 = new Cliente(69652020, "Miguel", "Aguado");

        Nodo Nc1 = new Nodo(xC1);
        Nodo Nc2 = new Nodo(xC2);
        Nodo Nc3 = new Nodo(xC3);
        Nodo Nc4 = new Nodo(xC4);
        Nodo Nc5 = new Nodo(xC5);

        Nc1.setIzq(Nc2);
        Nc1.setDer(Nc5);

        Nc2.setIzq(Nc4);
        Nc2.setDer(Nc3);

        miArbol.setRaiz(Nc1);
    }
    
}

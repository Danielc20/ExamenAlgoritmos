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
public class ABB {

    private Nodo Raiz;

    /**
     * Constructor
     */
    public ABB(Nodo Raiz) {
        this.Raiz = Raiz;
    }

    public ABB() {
    }

    /**
     * Fin Constructor
     */
    public Nodo getRaiz() {
        return Raiz;
    }

    public void setRaiz(Nodo Raiz) {
        this.Raiz = Raiz;
    }

    public void Mostrar_Clientes() {
        Mostrar_Clientes(this.Raiz);
    }

    public void Mostrar_Clientes(Nodo r) {
        if (r.getIzq() != null) {
            Mostrar_Clientes(r.getIzq());
        }
        
        System.out.println(r.getCliente().getCi());
        
        if (r.getDer() != null) {
            Mostrar_Clientes(r.getDer());
        }
    }

}

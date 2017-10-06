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
public class Nodo {

    private Nodo Izq;
    private Nodo Der;
    private Cliente Cliente;

    public Nodo() {
    }

    public Nodo(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public Nodo getIzq() {
        return Izq;
    }

    public void setIzq(Nodo Izq) {
        this.Izq = Izq;
    }

    public Nodo getDer() {
        return Der;
    }

    public void setDer(Nodo Der) {
        this.Der = Der;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public boolean isHoja() {
        return this.Izq == null && this.Der == null;
    }
}

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

    /**
     * Devuelve todos los clientes ordenados por cedula de forma ascendente
     */
    public void Mostrar_Clientes() {
        Mostrar_Clientes(this.Raiz);
    }

    /**
     * Metodo recursivo de Mostrar_Clientes()
     *
     * @param r Nodo recursivo
     */
    public void Mostrar_Clientes(Nodo r) {
        if (r.getIzq() != null) {
            Mostrar_Clientes(r.getIzq());
        }

        /*En caso de que 'r' entre valiendo nulo*/
        if (r != null) {
            System.out.println(r.getCliente().getCi());
        }

        if (r.getDer() != null) {
            Mostrar_Clientes(r.getDer());
        }
    }

    /**
     * Devuelve el peso del sub-arbol a partir del nodo raiz (El peso no tiene
     * en cuenta al nodo raiz)
     *
     * @param r nodo raiz del sub-arbol
     * @return 0 si r == null | r > 0 si tiene nodos
     */
    public int Peso(Nodo r) {
        return Peso(r, -1);
    }

    /**
     * Metodo recursivo para caluclar el peso de un sub-arbol a partir de un
     * nodo raiz
     *
     * @param r nodo raiz del sub-arbol
     * @param ptotal Variable Auxiliar para contar cada Nodo.
     * @return 0 si r == null | r > 0 si tiene nodos
     */
    public int Peso(Nodo r, int ptotal) {
        if (r.getIzq() != null) {
            ptotal += Peso(r.getIzq(), ptotal);
        }

        if (r.getDer() != null) {
            ptotal += Peso(r.getDer(), ptotal);
        }

        return ptotal += 1;
    }
}

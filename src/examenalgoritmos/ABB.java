/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenalgoritmos;

import java.util.ArrayList;

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

    public void insertNodo(Cliente c) {
        this.Raiz = insertNodo(this.Raiz, c);
    }

    public Nodo insertNodo(Nodo r, Cliente c) {
        if (r == null) {
            return new Nodo(c);
        } else if (c.getCi() <= r.getCliente().getCi()) {
            r.setIzq(insertNodo(r.getIzq(), c));
        } else {
            r.setDer(insertNodo(r.getDer(), c));
        }
        return r;
    }

    public void PreOrder() {
        PreOrder(this.Raiz);
    }

    public void PreOrder(Nodo r) {
        /*En caso de que 'r' entre valiendo nulo*/
        if (r != null) {
            System.out.println(r.getCliente().getCi());
        }

        if (r.getIzq() != null) {
            InOrder(r.getIzq());
        }

        if (r.getDer() != null) {
            InOrder(r.getDer());
        }
    }

    /**
     * Busca si el cliente existe dentro del Arbol de Clientes
     *
     * @param ci Cedula del cliente
     * @return true si existe el cliente | false sinó
     */
    public boolean es_Cliente(int ci) {
        return es_Cliente(this.Raiz, ci);
    }

    /**
     * (Metodo Recursivo) Busca si el cliente existe dentro del Arbol de
     * Clientes
     *
     * @param r Nodo actual
     * @param ci Cedula del cliente
     * @return true si existe el cliente | false sinó
     */
    public boolean es_Cliente(Nodo r, int ci) {
        if (r == null) {
            return false;
        } else if (ci < r.getCliente().getCi()) {
            return es_Cliente(r.getIzq(), ci);
        } else if (ci > r.getCliente().getCi()) {
            return es_Cliente(r.getDer(), ci);
        }
        return true;
    }

    /**
     * Devuelve todos los clientes ordenados por cedula de forma ascendente
     */
    public void Mostrar_Clientes() {
        InOrder(this.Raiz);
    }

    /**
     * (Metodo Recursivo) Devuelve todos los clientes ordenados por cedula de
     * forma ascendente
     *
     * @param r Nodo actual
     */
    public void InOrder(Nodo r) {
        if (r.getIzq() != null) {
            InOrder(r.getIzq());
        }

        /*En caso de que 'r' entre valiendo nulo*/
        if (r != null) {
            System.out.println(r.getCliente().getCi());
        }

        if (r.getDer() != null) {
            InOrder(r.getDer());
        }
    }

    /**
     * Devuelve el peso del arbol completo a partir del nodo raiz (El peso no
     * tiene en cuenta al nodo raiz)
     *
     * @return 0 si r == null
     */
    public int getPeso() {
        return getPeso(this.Raiz, -1);
    }

    /**
     * (Metodo Recursivo) Devuelve el peso del sub-arbol a partir del nodo raiz
     * (El peso no tiene en cuenta al nodo raiz)
     *
     * @param r nodo raiz del sub-arbol
     * @return 0 si r == null
     */
    public int getPeso(Nodo r) {
        return getPeso(r, -1);
    }

    /**
     * (Metodo Recursivo) Devuelve el peso del sub-arbol a partir del nodo raiz
     *
     * @param r nodo raiz del sub-arbol
     * @param ptotal Variable Auxiliar para contar cada Nodo.
     * @return 0 si r == null
     */
    public int getPeso(Nodo r, int ptotal) {

        if (r.getIzq() != null) {
            ptotal = getPeso(r.getIzq(), ptotal);
        }

        if (r.getDer() != null) {
            ptotal = getPeso(r.getDer(), ptotal);
        }

        return ++ptotal;
    }

    /**
     * Devuelve la Altura del Arbol desde la raiz
     *
     * @return -1 si r == null
     */
    public int getAltura() {
        return getAltura(this.Raiz);
    }

    /**
     * (Metodo Recursivo) Devuelve la Cantidad de NODOS que hay entre un nodo r y la hoja mas
     * lejana de este
     *
     * @param r
     * @return Altura Maxima del arbol
     */
    public int getAltura(Nodo r) {

        if (r == null) {
            return 0;
        } else {
            if (r.isHoja()) {
                return 0;
            }
            return 1 + (Math.max(getAltura(r.getIzq()), getAltura(r.getDer())));
        }
    }
}

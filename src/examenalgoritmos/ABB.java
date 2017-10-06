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
     * Devuelve el peso del arbol completo a partir del nodo raiz (El peso no
     * tiene en cuenta al nodo raiz)
     *
     * @return 0 si r == null
     */
    public int getPeso() {
        return getPeso(this.Raiz, -1);
    }

    /**
     * Devuelve el peso del sub-arbol a partir del nodo raiz (El peso no tiene
     * en cuenta al nodo raiz)
     *
     * @param r nodo raiz del sub-arbol
     * @return 0 si r == null
     */
    public int getPeso(Nodo r) {
        return getPeso(r, -1);
    }

    /**
     * Metodo recursivo para caluclar el peso de un sub-arbol a partir de un
     * nodo raiz
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
     * Devuelve la Cantidad de NODOS que hay entre un nodo r y la hoja mas
     * lejana de este
     *
     * @param r
     * @return
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

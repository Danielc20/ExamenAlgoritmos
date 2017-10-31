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
public class Cliente implements Comparable<Cliente>{
    
    private int Ci;
    private String Nombre;
    private int Anios;

    public Cliente() {
    }

    public Cliente(int Ci, String Nombre, int Anios) {
        this.Ci = Ci;
        this.Nombre = Nombre;
        this.Anios = Anios;
    }

    Cliente(int ci) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Cliente o) {
        return (this.getCi() - o.getCi());
    }
    
    public int getCi() {
        return Ci;
    }

    public void setCi(int Ci) {
        this.Ci = Ci;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getAnios() {
        return Anios;
    }

    public void setAnios(int Anios) {
        this.Anios = Anios;
    }
    
    
    
}

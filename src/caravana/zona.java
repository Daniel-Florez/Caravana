/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caravana;

/**
 *
 * @author Usuario DAM 1
 */
public class zona {
   
   private int entradas;

    public zona() {
    }

    public zona(int entradas) {
        this.entradas = entradas;
    }

    public int getEntradas() {
        return entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }

    public void Venta() {
        if (entradas > 0) {
            entradas = entradas - 1;
        }
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jva_centroCosto;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus-PC
 */
public class Comprobante {

    String comprobante;
    String descripcion;
    String Tipo;
    int cuenta;

    public Comprobante(String comprobante, String descripcion, String Tipo, int cuenta) {
        this.comprobante = comprobante;
        this.descripcion = descripcion;
        this.Tipo = Tipo;
        this.cuenta = cuenta;
    }

    public Comprobante() {
        this.comprobante = "";
        this.descripcion = "";
        this.Tipo = "";
        this.cuenta = 01;
    }

    public String getComprobante() {
        return comprobante;
    }

    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

  
    /**
     * String comprobante ; String descripcion; String Tipo ; int cuenta ;
     */
    int cont = 1;

    public Comprobante crearCosa(Comprobante nueva) {
        JOptionPane.showMessageDialog(null, "ingreso para agregar comprobante # " + cont);
        cont++;
        String a = JOptionPane.showInputDialog("ingrese id del comprobante");
        String b = JOptionPane.showInputDialog("agrege una descripcion");
        String c = JOptionPane.showInputDialog("Escribir el tipo");
        int d = Integer.parseInt(JOptionPane.showInputDialog("Escribir numero de cuenta"));

        nueva = new Comprobante(a, b, c, d);
        return nueva;
    }

}

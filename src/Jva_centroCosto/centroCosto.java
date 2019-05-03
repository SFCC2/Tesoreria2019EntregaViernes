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
public class centroCosto {

    int id;
    String descripcion;
    int Cuenta;

    public centroCosto() {
        this.id = 01;
        this.descripcion = descripcion;
        this.Cuenta = 0;
    }

    public centroCosto(int id, String descripcion, int Cuenta) {
        this.id = id;
        this.descripcion = descripcion;
        this.Cuenta = Cuenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCuenta() {
        return Cuenta;
    }

    public void setCuenta(int Cuenta) {
        this.Cuenta = Cuenta;
    }
      public centroCosto crearCosa(centroCosto nueva) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("ingrese id de centro de costo"));
        String b = JOptionPane.showInputDialog("agrege una descripcion");
        int c = Integer.parseInt(JOptionPane.showInputDialog("Escribir numero de cuenta"));
        nueva = new centroCosto(a, b, c);
        return nueva;
    }
}

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
/**
 * Datos a almacenar nit integer, nombre varchar(20), direccion varchar(20),
 * telefono integer, ciudad varchar(20), tipo varchar(20),
 */
public class MaestroProveedor {

    int nit;
    String nombre, direccion, ciudad, tipo;
    long telefono;

    public MaestroProveedor() {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.tipo = tipo;
        this.telefono = 31348405;
    }

    public MaestroProveedor(int nit, String nombre, String direccion,
            String ciudad, String tipo, long telefono) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.tipo = tipo;
        this.telefono = telefono;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    /**
     * int nit; String nombre, direccion, ciudad, tipo; long telefono;
     */
    public MaestroProveedor crearCosa(MaestroProveedor nueva) {

        int a= Integer.parseInt(JOptionPane.showInputDialog("Escribir el nit empresa"));
        String b = JOptionPane.showInputDialog("Escribir el nombre");
        String c = JOptionPane.showInputDialog("ingrese la direccion");
        String d = JOptionPane.showInputDialog("agrege una ciudad");        
        String e = JOptionPane.showInputDialog("describa el tipo");
        int f = Integer.parseInt(JOptionPane.showInputDialog("entregue el telefono"));
        nueva = new MaestroProveedor(a, b, c, d,e,f);
        return nueva;
    }
}

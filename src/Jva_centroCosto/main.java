/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jva_centroCosto;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus-PC
 */
public class main {

    int cont = 1;

    public static void main(String[] args) {
        main admin = new main();
        admin.ejecutar();

    }

    public void ejecutar() {
        JOptionPane.showMessageDialog(null, "Bienvenido Progrmaa Tesoreria version 1.0.0");
        main admin = new main();
        Comprobante nuevo = new Comprobante();
        List<Comprobante> comprobar = new ArrayList<Comprobante>();
        admin.opciones(admin, nuevo, comprobar);
    }

    public void opciones(main admin, Comprobante nuevo, List<Comprobante> comprobar) {
        
        int opc = Integer.parseInt(JOptionPane.showInputDialog("iNGRESE:"
                + "\n1) ingresar datos por primera vez"
                + "\n2) mostrar contenido\n3) buscar\n4)editar\n5)agregar adicional"
                + "\n6)eliminar dato especifico\n7) eliminar todo\n "));
        switch (opc) {
            case 1:
                if (cont == 1) {
                    int r = Integer.parseInt(JOptionPane.showInputDialog(""
                            + "ingrese la cantidad de usuarios para ingresar"));
                    for (int i = 0; i < r; i++) {
                        comprobar = admin.crearLista(comprobar, nuevo, admin);
                    }
                    cont++;
                    admin.ejecutar();
                }
                break;
            case 2:
                if (cont > 1) {
                    
                    String c=admin.mostrarListaCompleta(comprobar);
                    //JOptionPane.showMessageDialog(null, "Mostrar Lista:\n"+c);
                    System.out.println(c);
                    // admin.ejecutar();
                }
                break;
            case 3:
                if (cont > 1) {

                }
                break;
            case 4:
                if (cont > 1) {

                }
                break;
            case 5:
                if (cont > 1) {

                }
                break;
            case 6:
                if (cont > 1) {

                }
                break;
            case 7:
                cont = 1;
                break;
        }
    }

    public List<Comprobante> crearLista(List<Comprobante> comprobar, Comprobante nueva, main admin) {
        nueva = nueva.crearCosa(nueva);
        comprobar.add(nueva);
        return comprobar;
    }

    /**
     * String comprobante; String descripcion; String Tipo; int cuenta;
     */
    public String mostrarListaCompleta(List<Comprobante> comprobar) {
        System.out.println("#]identificacion)nombre");
        String a = "#]identificacion)nombre\n";
        int cont = 1;
        for (Comprobante comprobarActual : comprobar) {
            System.out.println(cont + ", " + comprobarActual.getComprobante()
                    + ", " + comprobarActual.getDescripcion()
                    + ", " + comprobarActual.getTipo()
                    + ", " + comprobarActual.getCuenta());

            a += "\n" + cont + "] " + comprobarActual.getComprobante()
                    + ") " + comprobarActual.getDescripcion()
                    + ") " + comprobarActual.getTipo()
                    + ") " + comprobarActual.getCuenta();
            cont++;
        }
        return a;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList100porciento;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus-PC
 */
public class Ejemplo_Cosas_Organizado {

    int x = 0, a = 0, error = 0;
    String b = null;

    public static void main(String[] args) {
        Ejemplo_Cosas_Organizado admin = new Ejemplo_Cosas_Organizado();
        Cosas nueva = new Cosas();
        List<Cosas> pacientes = new ArrayList<Cosas>();
        admin.ejecutar(admin, nueva, pacientes);
    }

    public void ejecutar(Ejemplo_Cosas_Organizado admin, Cosas nueva, List<Cosas> pacientes) {

        int opc = Integer.parseInt(JOptionPane.showInputDialog("iNGRESE:"
                + "\n1) agregar dato"
                + "\n2) mostrar contenido\n3) buscar\n4)editar"
                + "\n5) realizar una adicional\n6)eliminar dato especifico\n7) eliminar todo\n "
                + "8) salir"));
        switch (opc) {
            case 1:
                pacientes = admin.crearLista(pacientes, nueva, admin);
                admin.ejecutar(admin, nueva, pacientes);
                break;
            case 2:
                admin.mostrarListaCompleta(pacientes);
                admin.ejecutar(admin, nueva, pacientes);
                break;
            case 3:
                admin.buscar(pacientes, a, b, admin);
                admin.ejecutar(admin, nueva, pacientes);
                break;
            case 4:
                admin.editar_CosaEspecifico(pacientes, a, b);
                admin.ejecutar(admin, nueva, pacientes);
                break;
            case 5:
                pacientes = admin.agregarCosaAdicional(pacientes, admin, nueva);
                admin.ejecutar(admin, nueva, pacientes);
                break;
            case 6:
                admin.eliminarDatoEspecifico(pacientes, a, b);
                admin.ejecutar(admin, nueva, pacientes);
                break;
            case 7:
                admin.eliminarTodo(pacientes, admin);
                admin.ejecutar(admin, nueva, pacientes);
                break;
            case 8:
                System.exit(0);
                break;
            default:
                if (error <= 3) {
                    JOptionPane.showMessageDialog(null, ""
                            + "el numero marcado no existe, error de digitacion\n\n"
                            + "Cantidad de intentos fallidos" + error
                            + "/3 despues de pasarse de la cantidad superada el sistema se saldra automaticamente");
                    error++;
                    admin.ejecutar(admin, nueva, pacientes);
                } else {
                    JOptionPane.showMessageDialog(null, "supera el limite establecido realizados "
                            + "Hasta pronto");
                    System.exit(0);
                }
                error++;
                break;
        }
    }

    public List<Cosas> crearLista(List<Cosas> pacientes, Cosas nueva, Ejemplo_Cosas_Organizado admin) {
        a = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de informacion a llenar"));
        for (int i = 1; i <= a; i++) {            ///x ++;
            nueva = admin.crearCosa(admin, i);
            pacientes.add(nueva);
        }
        return pacientes;
    }

    public Cosas crearCosa(Ejemplo_Cosas_Organizado admin, int a) {
        /* int a = 0;        a = admin.identifiacion();*/
        String b = null;
        b = admin.nombres();
        Cosas nueva = new Cosas(a, b);
        return nueva;
    }

    public String nombres() {
        String a = JOptionPane.showInputDialog("Escribir nombre");
        return a;
    }

    public String mostrarListaCompleta(List<Cosas> pacientes) {
        // System.out.println("#]identificacion)nombre");
        b = "#]identificacion)nombre\n";
        int cont = 1;
        for (Cosas pacienteActual : pacientes) {
            System.out.println(cont + ", " + pacienteActual.getId() + ", " + pacienteActual.getNombre());
            b += "\n" + cont + "] " + pacienteActual.getId() + ") " + pacienteActual.getNombre();
            cont++;
        }
        JOptionPane.showMessageDialog(null, "\"lo almacenado es:\n " + b);
        return b;
    }
    ///JOptionPane.showMessageDialog(null, "El id: " + pacientes.get(b).getId()                     +"Nombre es: "+  pacientes.get(b).getNombre());

    public void buscar(List<Cosas> pacientes, int a, String c, Ejemplo_Cosas_Organizado admin) {

        int b = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de identificacion"
                + " para buscar de acuerdo a lo siguiente:\n" + c));
        if (b <= a) {
            JOptionPane.showMessageDialog(null, "el numero escrito es: " + b);           // System.out.println(b);
            b = b - 1;
            JOptionPane.showMessageDialog(null, "El id: " + pacientes.get(b).getId()
                    + " Nombre es: " + pacientes.get(b).getNombre());

            System.out.println(pacientes.get(b).getId() + " " + pacientes.get(b).getNombre());
        } else if (b > a) {
            System.exit(0);
        }
    }

    public void editar_CosaEspecifico(List<Cosas> pacientes, int a, String c) {
        int b = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de identificacion"
                + "para editar el dato de cuardo a lo siguiente :\n" + c));
        if (b <= a) {
            JOptionPane.showMessageDialog(null, "el numero escrito es: " + b);
            String nom = JOptionPane.showInputDialog("editar nombre");           /// System.out.println(b);
            b = b - 1;
            pacientes.get(b).setNombre(nom);
            System.out.println(pacientes.get(b).getId() + " " + pacientes.get(b).getNombre());
        } else if (b > a) {
            System.exit(0);
        }
    }

    public List<Cosas> agregarCosaAdicional(List<Cosas> pacientes, Ejemplo_Cosas_Organizado admin, Cosas nueva) {
        a++;
        /* String b = null;
        b = admin.nombres();
        Cosas nueva = new Cosas(a, b);
        return nueva;*/
        nueva = admin.crearCosa(admin, a);
        pacientes.add(nueva);

        return pacientes;
    }

    public void eliminarDatoEspecifico(List<Cosas> pacientes, int a, String c) {
        int b = Integer.parseInt(JOptionPane.showInputDialog("de la siguiente lista escoga cual eliminar" + c));
        if (b <= a) {
            JOptionPane.showMessageDialog(null, "el numero escrito es: " + b);           // System.out.println(b);
            b = b - 1;
            pacientes.remove(b);
        } else if (b > a) {
            System.exit(0);
        }
    }

    public List<Cosas> eliminarTodo(List<Cosas> pacientes, Ejemplo_Cosas_Organizado admin) {
        pacientes.clear();
        JOptionPane.showMessageDialog(null, "\nTamaño de la lista: " + pacientes.size());
        return pacientes;
    }
}

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
public class Cosas_Operaciones_SInOrden {

    int cont = 1;

    public static void main(String[] args) {
        Cosas_Operaciones_SInOrden admin = new Cosas_Operaciones_SInOrden();
        admin.ejecutar(admin);
    }

    public void ejecutar(Cosas_Operaciones_SInOrden admin) {
        Cosas nueva = new Cosas();
        List<Cosas> pacientes = new ArrayList<Cosas>();

        int r = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de usuarios para ingresar"));
        for (int i = 0; i < r; i++) {
            pacientes = admin.crearLista(pacientes, nueva, admin);
        }
        String c = admin.mostrarListaCompleta(pacientes);
        System.out.println("el objeto a buscar es:");
        admin.buscar(pacientes, r, c, admin);
        System.out.println("editar dato especifico");
        admin.editar_CosaEspecifico(pacientes, r, c);
        System.out.println("mostrar todo");
        c = admin.mostrarListaCompleta(pacientes);
        pacientes = admin.agregarAdicional(r, pacientes, nueva, admin);
        System.out.println("mostrar todo");
        c = admin.mostrarListaCompleta(pacientes);
        System.out.println("eliminar todo");
        admin.eliminarTodo(pacientes, admin);
        r = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de usuarios para ingresar"));
        for (int i = 0; i < r; i++) {
            pacientes = admin.crearLista(pacientes, nueva, admin);
        }
        c = admin.mostrarListaCompleta(pacientes);
        System.out.println("eliminar dato especifico");
        admin.eliminarDatoEspecifico(pacientes, r, c);
        c = admin.mostrarListaCompleta(pacientes);

        // admin.buscar(pacientes, r, c, admin,nueva);
    }

    public List<Cosas> crearLista(List<Cosas> pacientes, Cosas nueva, Cosas_Operaciones_SInOrden admin) {
        //nueva = admin.crearCosa(admin);
        nueva= nueva.crearCosa(nueva);
        pacientes.add(nueva);
        return pacientes;
    }

    public String mostrarListaCompleta(List<Cosas> pacientes) {
        System.out.println("#]identificacion)nombre");
        String a = "#]identificacion)nombre\n";
        int cont = 1;
        for (Cosas pacienteActual : pacientes) {
            System.out.println(cont + ", " + pacienteActual.getId() + ", " + pacienteActual.getNombre());

            a += "\n" + cont + "] " + pacienteActual.getId() + ") " + pacienteActual.getNombre();
            cont++;
        }
        return a;
    }

    public void buscar(List<Cosas> pacientes, int a, String c, Cosas_Operaciones_SInOrden admin) {
        int b = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de #"
                + " para buscar de acuerdo a lo siguiente:\n" + c));
        int d = b;
        if (b <= a) {
            JOptionPane.showMessageDialog(null, "el numero escogido del #] es: " + b);
            b = b - 1;
            System.out.println("el numero escogido del #] es:\n" + d
                    + " " + pacientes.get(b).getId() + " " + pacientes.get(b).getNombre());
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

    public List<Cosas> agregarAdicional(int r, List<Cosas> pacientes, Cosas nueva, Cosas_Operaciones_SInOrden admin) {
        System.out.println("agregar adicional");
        r = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de usuarios para ingresar"));
        for (int i = 0; i < r; i++) {
            pacientes = admin.crearLista(pacientes, nueva, admin);
        }
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

    public List<Cosas> eliminarTodo(List<Cosas> pacientes, Cosas_Operaciones_SInOrden admin) {
        pacientes.clear();
        JOptionPane.showMessageDialog(null, "\nTamaño de la lista: " + pacientes.size());
        return pacientes;
    }
}

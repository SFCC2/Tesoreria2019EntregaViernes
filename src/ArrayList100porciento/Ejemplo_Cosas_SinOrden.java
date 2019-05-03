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
public class Ejemplo_Cosas_SinOrden {

    int x = 0;

    public static void main(String[] args) {
        Ejemplo_Cosas_SinOrden admin = new Ejemplo_Cosas_SinOrden();
        admin.ejecutar(admin);
    }

    public void ejecutar(Ejemplo_Cosas_SinOrden admin) {
        Cosas nueva = new Cosas();
        List<Cosas> pacientes = new ArrayList<Cosas>();
        int a = 0;
        String b = null;
        a = numTotal();
        pacientes = admin.crearLista(pacientes, nueva, a, admin);
        b = admin.mostrarLista(pacientes);
        /* System.out.println("Digite");        System.out.println(b);*/
        System.out.println("");
        admin.buscar(pacientes, a, b, admin);
        admin.editar_CosaEspecifico(pacientes, a, b);
        b = admin.mostrarLista(pacientes);
        System.out.println("modificar todos los usuarios");
        admin.Editar_todaInformacion(pacientes, nueva, a, admin);
        b = admin.mostrarLista(pacientes);
        System.out.println("\n\nEliminar un dato en especifico");
        admin.eliminarDatoEspecifico(pacientes, a, b);
        b = admin.mostrarLista(pacientes);
        
        System.out.println("agregar otra cosa");
        pacientes=admin.agregarCosaAdicional(pacientes, a, admin, nueva);
        System.out.println("cosa agregada");
        b = admin.mostrarLista(pacientes);
        System.out.println("\n\nEliminar todo");
        
        admin.eliminarTodo(pacientes, admin);
        b = admin.mostrarLista(pacientes);
    }

    public List<Cosas> crearLista(List<Cosas> pacientes, Cosas nueva, int a, Ejemplo_Cosas_SinOrden admin) {
        for (int i = 1; i <= a; i++) {
            ///x ++;
            nueva = admin.crearCosa(admin, i);
            pacientes.add(nueva);
        }
        return pacientes;
    }
   

    public String mostrarLista(List<Cosas> pacientes) {
        System.out.println("Todos los pacientes:");
        String a = null;
        for (Cosas pacienteActual : pacientes) {
            System.out.println(pacienteActual.getId() + ", " + pacienteActual.getNombre());
            a += ", " + pacienteActual.getId() + ") " + pacienteActual.getNombre();
        }
        return a;
    }

    public Cosas crearCosa(Ejemplo_Cosas_SinOrden admin, int a) {
        /* int a = 0;        a = admin.identifiacion();*/
        String b = null;
        b = admin.nombres();
        Cosas nueva = new Cosas(a, b);
        return nueva;
    }

    public void buscar(List<Cosas> pacientes, int a, String c, Ejemplo_Cosas_SinOrden admin) {

        int b = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de identificacion"
                + " para buscar de acuerdo a lo siguiente:\n" + c));
        if (b <= a) {
            JOptionPane.showMessageDialog(null, "el numero escrito es: " + b);           // System.out.println(b);
            b = b - 1;
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

    public void Editar_todaInformacion(List<Cosas> pacientes, Cosas nueva, int a, Ejemplo_Cosas_SinOrden admin) {
        pacientes.clear();
        admin.crearLista(pacientes, nueva, a, admin);
    }

    public List<Cosas> eliminarTodo(List<Cosas> pacientes, Ejemplo_Cosas_SinOrden admin) {
        pacientes.clear();
        JOptionPane.showMessageDialog(null, "\nTamaño de la lista: " + pacientes.size());
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

    public List<Cosas>  agregarCosaAdicional(List<Cosas> pacientes,int a,  Ejemplo_Cosas_SinOrden admin,Cosas nueva) {
        int b=a;
        a=a+1;
       for ( b = 1; b <= a; b++) {
            ///x ++;
            if (a>b) {
                nueva = admin.crearCosa(admin, a);
            pacientes.add(nueva);
           }
           
        }
        return pacientes;
    }
    ///////////////////////////////

    public int numTotal() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de informacion a llenar"));
        return a;
    }

 public int identifiacion() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Escribir numero de identificacion"));
        return a;
    }   

    public String nombres() {
        String a = JOptionPane.showInputDialog("Escribir nombre");
        return a;
    }

}

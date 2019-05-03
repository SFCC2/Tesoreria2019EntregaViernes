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
public class Cosas_Operaciones_Organizado {

    String a = null;
    int inicializar = 0, cont = 0, error = 0;

    public static void main(String[] args) {
        Cosas_Operaciones_Organizado admin = new Cosas_Operaciones_Organizado();
        Cosas nueva = new Cosas();
        List<Cosas> pacientes = new ArrayList<Cosas>();
        admin.opcion(admin, pacientes, nueva);
    }

    public void opcion(Cosas_Operaciones_Organizado admin, List<Cosas> pacientes, Cosas nueva) {

        int opc = Integer.parseInt(JOptionPane.showInputDialog("iNGRESE:"
                + "\n1) agregar dato"
                + "\n2) mostrar contenido\n3) buscar\n4)editar"
                + "\n5)eliminar dato especifico\n6) eliminar todo\n "
                + "7) salir"));
        switch (opc) {
            case 1:
                admin.llenar(admin, pacientes, nueva);
                admin.opcion(admin, pacientes, nueva);
                break;
            case 2:
                a = admin.mostrarListaCompleta(pacientes);
                admin.opcion(admin, pacientes, nueva);
                break;
            case 3:
                admin.buscar(pacientes, inicializar, a, admin);
                admin.opcion(admin, pacientes, nueva);
                break;
            case 4:
                admin.editar_CosaEspecifico(pacientes, inicializar, a);
                admin.opcion(admin, pacientes, nueva);
                break;
            case 5:
                admin.eliminarDatoEspecifico(pacientes, inicializar, a);
                admin.opcion(admin, pacientes, nueva);
                break;
            case 6:
                admin.eliminarTodo(pacientes, admin);
                admin.opcion(admin, pacientes, nueva);
                break;   
            case 7:
                System.exit(0);
                break;
            default:
                if (error <= 3) {
                    JOptionPane.showMessageDialog(null, ""
                            + "el numero marcado no existe, error de digitacion\n\n"
                            + "Cantidad de intentos fallidos" + error
                            + "/3 despues de pasarse de la cantidad superada el sistema se saldra automaticamente");
                    error++;
                    admin.opcion(admin, pacientes, nueva);
                } else {
                    JOptionPane.showMessageDialog(null, "supera el limite establecido realizados "
                            + "Hasta pronto");
                    System.exit(0);
                }
                error++;
                break;
        }
    }

    public void llenar(Cosas_Operaciones_Organizado admin, List<Cosas> pacientes, Cosas nueva) {
        int r = 0;
        r = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de usuarios para ingresar"));
        inicializar = r;
        for (int i = 0; i < r; i++) {
            pacientes = admin.crearLista(pacientes, nueva, admin);
        }
    }
    


    public List<Cosas> crearLista(List<Cosas> pacientes, Cosas nueva, Cosas_Operaciones_Organizado admin) {
        //nueva = admin.crearCosa(admin);
        nueva = nueva.crearCosa(nueva);
        pacientes.add(nueva);
        return pacientes;
    }

    public String mostrarListaCompleta(List<Cosas> pacientes) {
        // System.out.println("#]identificacion)nombre");
        a = "#]identificacion)nombre\n";
        int cont = 1;
        for (Cosas pacienteActual : pacientes) {
            System.out.println(cont + ", " + pacienteActual.getId() + ", " + pacienteActual.getNombre());

            a += "\n" + cont + "] " + pacienteActual.getId() + ") " + pacienteActual.getNombre();
            cont++;
        }
        JOptionPane.showMessageDialog(null, "\"lo almacenado es:\n " + a);
        return a;
    }

    public void buscar(List<Cosas> pacientes, int a, String c, Cosas_Operaciones_Organizado admin) {

        int b = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de #"
                + " para buscar de acuerdo a lo siguiente:\n" + c));
        int d = b;
        if (b <= a) {
            // JOptionPane.showMessageDialog(null, "el numero escogido del #] es: " + b);
            b = b - 1;
            JOptionPane.showMessageDialog(null, "el numero escogido del #] es:\n " + d
                    + "] " + pacientes.get(b).getId() + " " + pacientes.get(b).getNombre());

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

    public List<Cosas> eliminarTodo(List<Cosas> pacientes, Cosas_Operaciones_Organizado admin) {
        pacientes.clear();
        JOptionPane.showMessageDialog(null, "\nTamaño de la lista: " + pacientes.size());
        return pacientes;
    }
}

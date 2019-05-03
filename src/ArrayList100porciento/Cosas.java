/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList100porciento;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus-PC
 */
public class Cosas {

    int Id;
    String nombre;

    public Cosas(int Id, String nombre) {
        this.Id = Id;
        this.nombre = nombre;
    }

    public Cosas() {
        this.Id = 1;
        this.nombre = "NA";
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Cosas crearCosa(Cosas nueva){
         String a = JOptionPane.showInputDialog("Escribir nombre");
          int ba = Integer.parseInt(JOptionPane.showInputDialog("Escribir numero de identificacion"));
          nueva= new Cosas(ba,a);
          return nueva;
    }
            

}

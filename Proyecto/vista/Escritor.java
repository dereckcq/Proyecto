package vista; //Paquete donde se encuentra la clase

import javax.swing.JOptionPane; //Se importa JOptionPane

//Clase Escritor: será responsable de mostrar información al usuario utilizando JOptionPane.

public class Escritor {

    //Método mostrarMensaje para escribir mensajes por JOptionPane
    public static void mostrarMensaje(String mensaje) {

        JOptionPane.showMessageDialog(null, mensaje);
    } 

    //Método mostrarError para escribir mensajes de error por JOptionPane
    public static void mostrarError(String mensaje) {

        JOptionPane.showMessageDialog(null, mensaje, "HA OCURRIDO UN ERROR" , JOptionPane.ERROR_MESSAGE);
    }
}
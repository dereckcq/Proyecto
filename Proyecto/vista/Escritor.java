package vista;

import javax.swing.JOptionPane;

//Clase Escritor: será responsable de mostrar información al usuario utilizando JOptionPane.

public class Escritor {

    //Método mostrarMensaje para escribir mensajes por JOptionPane.
    
    public static void mostrarMensaje(String mensaje) {

        JOptionPane.showMessageDialog(mensaje);
    } 

    //Método mostrarError para escribir mensajes de error por JOptionPane.

    public static void mostrarError(null, String mensaje, "HA OCURRIDO UN ERROR" , ERROR_MESSAGE) {

        JOptionPane.showMessageDialog(mensaje);
    }
}
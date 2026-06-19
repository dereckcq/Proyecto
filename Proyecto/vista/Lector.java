package vista;

import javax.swing.JOptionPane;

//Clase Lector: será responsable de solicitar datos al usuario utilizando JOptionPane. 
//Su función es centralizar la entrada de datos para evitar que todo el programa solicite información directamente desde distintas clases.

public class Lector {

    //Método leerTexto para leer mensajes tipo String por JOptionPane.

    public static String leerTexto(String mensaje) {

        String texto = JOptionPane.showInputDialog(mensaje);

        if (texto == null && != texto.equals("") && ) {

        } else {

        return texto;
    }

     //Método leerInt para leer mensajes tipo int por JOptionPane.


    public static int leerInt(String mensaje) {

        int numero = JOptionPane.showInputDialog(mensaje);

        return numero;

    }

    //Método leerOpcion para el ingreso de opciones por JOptionPane.

    public static int leerOpcion(String mensaje, int minimo, int maximo) {

        int opcion 

    }
}
}
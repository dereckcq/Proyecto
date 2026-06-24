package vista; //Paquete de la clase

import javax.swing.JOptionPane; //Se importa JOptionPane

//Clase Lector: será responsable de solicitar datos al usuario utilizando JOptionPane. 
//Su función es centralizar la entrada de datos para evitar que todo el programa solicite información directamente desde distintas clases.

public class Lector {

    //Método leerTexto para leer mensajes tipo String por JOptionPane.
    public static String leerTexto(String mensaje) {
        String texto;
  
        //Este ciclo se repite mientras el usuario no ingrese un texto válido
        do {
            texto = JOptionPane.showInputDialog(mensaje);
    
            //Este if valida que no esté vacío
            if (texto == null || texto.equals("")) {
                JOptionPane.showMessageDialog(null, "No puede dejar el espacio vacio");
            }
    
        } while (texto == null || texto.equals(""));
  
        return texto;
    } 

    //Método leerInt para leer mensajes tipo int por JOptionPane.
    public static int leerInt(String mensaje) {
        int numero = 0;
        boolean valido = false;
  
        // Repite hasta que el usuario ingrese un entero válido
        while (!valido) {
    
            try {
                //Solicita el dato al usuario
                String texto = JOptionPane.showInputDialog(mensaje);
                //Convierte el texto ingresado a entero
                numero = Integer.parseInt(texto);
                //Si la conversión funciono se termina el ciclo
                valido = true;
      
            }catch (NumberFormatException e){ //excepción que maneja el error cuando se intenta convertir texto a entero
                //Este se ejecuta si el usuario ingresa texto o caracteres inválidos
                JOptionPane.showMessageDialog(null, "Debe ingresar un número");
            }
        }
        return numero;
    }

    //Método leerOpcion para el ingreso de opciones por JOptionPane.
    public static int leerOpcion(String mensaje, int minimo, int maximo) {
       int opcion;
  
        //Se repite mientras la opción esté fuera del rango permitido
        do {
            opcion = leerInt(mensaje);
    
            //Este if verifica que la opción esté entre mínimo y máximo
            if (opcion < minimo || opcion > maximo) {
                JOptionPane.showMessageDialog(null, "Opcion invalida debe ingresar una opcion entre " + minimo + " y " + maximo);
            }
    
        } while (opcion < minimo || opcion > maximo);
  
        return opcion;
    }
}

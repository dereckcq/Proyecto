package vista;
import javax.swing.JOptionPane;

//Clase Lector: será responsable de solicitar datos al usuario utilizando JOptionPane. 
//Su función es centralizar la entrada de datos para evitar que todo el programa solicite información directamente desde distintas clases.

public class Lector {

    //Método leerTexto para leer mensajes tipo String por JOptionPane.
    public static String leerTexto(String mensaje) {
        String texto;
  
        do {
            texto = JOptionPane.showInputDialog(mensaje);
    
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
  
        while (!valido) {
    
            try {
                String texto = JOptionPane.showInputDialog(mensaje);
                numero = Integer.parseInt(texto);
                valido = true;
      
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Debe ingresar un número.");
            }
        }
        return numero;
    }

    //Método leerOpcion para el ingreso de opciones por JOptionPane.
    public static int leerOpcion(String mensaje, int minimo, int maximo) {
       int opcion;
  
        do {
            opcion = leerInt(mensaje);
    
            if (opcion < minimo || opcion > maximo) {
                JOptionPane.showMessageDialog(null, "Opcion invalida debe ingresar una opcion entre " + minimo + " y " + maximo);
            }
    
        } while (opcion < minimo || opcion > maximo);
  
        return opcion;
    }
}

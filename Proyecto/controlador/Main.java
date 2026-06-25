package controlador; //Paquete de la clase

//Importaciones de las clases
import controlador.Combate;
import modelo.Arma;
import modelo.Enemigo;
import modelo.Protagonista;
import vista.Escritor;
import vista.Lector;
import excepciones.ExcepcionValorNegativo;
import excepciones.ExcepcionValorNulo;

//Clase main
public class Main { 
  public static void main(String[] args){
    
    
    try{
      //mensaje de bienvenida
      Escritor.mostrarMensaje("¡Bienvenido o bienvenida a las Crónicas del Programador!"); //Bienvenida al juego
      
      String nombre = Lector.leerTexto("¿Cómo desea que se llame su Protagonista?"); //Ingresar nombre
      
      //Variables de las armas que se usarán en el juego 
      
      //Armas del Protagonista
      Arma mango = new Arma("Un mango", 19, 38);
      Arma lataAtun = new Arma("Lata de atún", 5, 12);
      Arma bisturi = new Arma("Bisturí", 17, 29);
      Arma legos = new Arma("Legos", 7, 17);
      Arma candelabro = new Arma("Candelabro", 22, 49);
      
      //Armas de los enemigos
      Arma manopla = new Arma("Manopla", 7, 19);
      Arma sai = new Arma("Sai", 20, 32);
      Arma resortera = new Arma("Resortera", 11, 24);
      
      //Seleccion del arma

      //Permite escoger el arma del protagonista
      int opcionArma = Lector.leerOpcion("Que arma desea usar: \n " + "1. Un mango" + "\n 2. Lata de atún" + "\n 3. Bisturí" + "\n 4. Legos" + "\n 5. Candelabro",1 ,5);
      
      Arma armaSeleccionada = legos; //Arma por defecto
      
      switch(opcionArma){  //Este swich signa el arma seleccionada
        
        case 1:
          armaSeleccionada = mango; //Arma 1
          break;
          
        case 2:
          armaSeleccionada = lataAtun; //Arma 2
          break;
          
        case 3:
          armaSeleccionada = bisturi; //Arma 3
          break;
          
        case 4:
          armaSeleccionada = legos; //Arma 4
          break;
          
        case 5:
          armaSeleccionada = candelabro; //Arma 5
          break;
      }
      
      //Protagonista y sus estadísticas iniciales
      Protagonista protagonista = new Protagonista(nombre, 160, 10, 25, armaSeleccionada, 3);
      
      //Enemigos y sus estadísticas
      Enemigo ronald = new Enemigo("Ronald McDonald", 200, 6, 5, manopla);
      
      Enemigo rafael = new Enemigo("Rafael", 125, 16, 12, sai);
      
      Enemigo rojo = new Enemigo("Angry Bird", 175, 10, 15, resortera);
      
      int enemigoAleatorio = (int)(Math.random() * 3); //Operación para que el enemigo se escoga de manera aleatoria
      
      Enemigo enemigo; //variable que almacena el enemigo seleccionado
      
      switch(enemigoAleatorio) { //Selecciona un enemigo a partor del numero generado
        
        case 0:
          enemigo = ronald; //Enemigo 1
          break;
          
        case 1:
          enemigo = rafael; //Enemigo 2
          break;
          
        default:
          enemigo = rojo; //Enemigo 3
          break;

      }
      
      Escritor.mostrarMensaje(enemigo.toString()); //muestra la informacion del enemigo
      
      Combate combate = new Combate(protagonista, enemigo); //crea el combate utilizando al protagonista y al enemigo
      
      combate.ejecutarCombate(); //ejecuta el combate
      
    } catch (ExcepcionValorNulo e) {
      
      Escritor.mostrarError(e.getMessage()); //Muestra un mensaje de error cuando se ingresa un valor nulo
      
    } catch (ExcepcionValorNegativo e) {
      
      Escritor.mostrarError(e.getMessage()); //Muestra un mensaje de error cuando se ingresa un valor negativo
    } 
  } 
}

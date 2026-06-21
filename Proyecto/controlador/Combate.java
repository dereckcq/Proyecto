package controlador; //Paquete de la clase

import vista.*; //Se importa al paquete vista

import modelo.Protagonista; //Se importa el objeto Protagonista del paquete modelo.

import modelo.Enemigo; //Se importa el objeto Enemigo del paquete modelo.

//Clase Combate: Controla la lógica principal del enfrentamiento entre el enemigo y el enemigo

public class Combate {
  
  //Atributos de la clase
  
  private Protagonista protagonista;
  private Enemigo enemigo;
  int opcionSwitch;
  
  //Método constructor con parámetros
  
  public Combate(Protagonista protagonista, Enemigo enemigo) {
    this.protagonista = protagonista;
    this.enemigo = enemigo;
  }
  
  //Método turnoProtagonista
  
  public void turnoProtagonista() {
    
    while (true) {
      
      opcionSwitch = Lector.leerOpcion("Seleccione una opción:" + 
                                       "\n1. Atacar " + 
                                       "\n2. Usar poción " + 
                                       "\n3. Ver estado " + 
                                       "\n4. Rendirse",
                                       1,
                                       4);
      
      switch(opcionSwitch) {
        
        //Opción 1: Atacar, el protagonista ataca al enemigo.
        
        case 1:
          
          double danio = protagonista.getAtaque();
          
          if (protagonista.getArma() != null) {
            
            danio += protagonista.getArma().generarDanio();
          }
          
          enemigo.recibirDanio(danio);
          
          Escritor.mostrarMensaje(protagonista.getNombre() + 
                                  " atacó a " + 
                                  enemigo.getNombre() + 
                                  " y le inflingió " + 
                                  danio + " puntos de daño.");
          
          return; //Para terminar el turno del protagonista
          
          //Opción 2: Usar poción
          
        case 2: 
          
          if(protagonista.getCantidadPociones() > 0) {
          
          protagonista.usarPocion();
          
          Escritor.mostrarMensaje(protagonista.getNombre() + " utilizó una poción y recuperó toda su vida.");
          
          return; //Para terminar el turno del protagonista
          
        } else {
          
          Escritor.mostrarError("No tienes pociones disponibles.");
        }
        
        continue; //Para volver al menú sin usar un turno
        
        case 3:
          
          Escritor.mostrarMensaje("=== Estado del protagonista ===\n" + 
                                  protagonista.toString() + 
                                  "\n\n=== Estado del enemigo ===\n" + 
                                  enemigo.toString());
          
          continue; //Se usa un continue para que no se consuma un turno
          
          
        case 4:
          
          protagonista.setVida(0);
          
          Escritor.mostrarMensaje(protagonista.getNombre() + " se ha rendido. Has perdido el combate.");
          
          return;
          
        default:
          
          Escritor.mostrarError("¡ERROR! Opción inválida: Debe seleccionar una opción entre 1 y 4.");
          
      }
    }
  }
  
  //Método turnoEnemigo
  
  public void turnoEnemigo() {
    
    double danio = enemigo.getAtaque();
    
    if(enemigo.getArma() != null) {
      
      danio += enemigo.getArma().generarDanio();
    } 
    
    protagonista.recibirDanio(danio);
    
    Escritor.mostrarMensaje(
                            enemigo.getNombre() + 
                            " atacó a " + 
                            protagonista.getNombre() + 
                            " y le infligió " + 
                            danio + " puntos de daño." );
    
  }
  
  //Método ejecutarCombate
  
  public void ejecutarCombate() {
    
    while(!verificarFinalizacion()) {
      
      turnoProtagonista();
      
      if (verificarFinalizacion()) {
        break;
      }
      
      turnoEnemigo();
    }
    
    verificarGanador();
  }
  
//Método verificarFinalizacion
  
  public boolean verificarFinalizacion() {
    
    return !protagonista.estaVivo() || !enemigo.estaVivo();
    
  }
  
//Método verificarGanador
  
  public void verificarGanador() {
    
    if (protagonista.estaVivo()) {
      
      Escritor.mostrarMensaje("¡Felicidades! Has derrotado a " + enemigo.getNombre());
      
    } else {
      
      Escritor.mostrarMensaje("Has sido derrotado por " + enemigo.getNombre());
    }
  }
}    
   
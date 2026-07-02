package modelo; //Paquete donde se encuentra la clase

import excepciones.ExcepcionValorNegativo; //Se importan las excepciones
import excepciones.ExcepcionValorNulo;

//Clase Protagonista: Representa al personaje controlado por el jugador en el Combate
public class Protagonista {

//Atributos que pertenecen a la clase
  private String nombre;
  private int vida;
  private int ataque;
  private int defensa;
  private int cantidadPociones;
  private Arma arma;
  
  
  //Constructor con parametros
  public Protagonista(String nombre, int vida, int ataque, int defensa, Arma arma, int cantidadPociones) throws ExcepcionValorNegativo, ExcepcionValorNulo {

    //Validacion del nombre
    if (nombre != null && !nombre.equals("")) {
      this.nombre = nombre;
    }else{
      throw new ExcepcionValorNulo("El nombre no puede ser nulo o vacio");
    }

    //Validacion de la vida
    if (vida >= 0) {
      this.vida = vida;
    }else{
      throw new ExcepcionValorNegativo("La vida no puede ser negativa");
    }

    //Validacion del ataque
    if (ataque >= 0) {
      this.ataque = ataque;
    }else{
      throw new ExcepcionValorNegativo("El ataque debe ser mayor a cero");
    }

    //Validacion de la defensa
    if (defensa >= 0) {
      this.defensa = defensa;
    }else{
      throw new ExcepcionValorNegativo("La defensa debe ser mayor cero");
    }

    //Validacion de la cantidad de pociones
     if (cantidadPociones >= 0) {
      this.cantidadPociones = cantidadPociones;
    }else{
      throw new ExcepcionValorNegativo("La cantidad de pociones no puede ser negativa");
    }

    //Validacion del arma
    if (arma != null){
      this.arma = arma;
    }else{
      throw new ExcepcionValorNulo("El arma no puede estar nulo o vacio");
    }
  }
  
  //Metodo set para asignar el nombre
  public void setNombre(String nombre) throws ExcepcionValorNulo {
    if (nombre != null && !nombre.equals("")){
      this.nombre = nombre;
    }else{
      throw new ExcepcionValorNulo("El nombre no puede ser nulo o vacio");
    }
  }
  
  //metodo get para obtener el nombre
  public String getNombre(){
    return nombre;
  }
  
  //Metodo set para asignar la vida
  public void setVida(int vida) throws ExcepcionValorNegativo {
    if (vida >= 0) {
      this.vida = vida;
    }else{
      throw new ExcepcionValorNegativo("La vida no puede ser negativa");
    }
  }
  
  //metodo get para obtener la vida
  public int getVida(){
    return vida;
  }
  
  //metodo set para asignar el ataque
  public void setAtaque(int ataque) throws ExcepcionValorNegativo {
    if (ataque >= 0) {
      this.ataque = ataque;
    }else{
      throw new ExcepcionValorNegativo("El ataque debe ser mayor a cero");
    }
  }
  
  //metodo get para obtener el ataque
  public int getAtaque(){
    return ataque;
  }
  
  //metodo set para asignar la defensa
  public void setDefensa(int defensa) throws ExcepcionValorNegativo {
    if (defensa >= 0) {
      this.defensa = defensa;
    }else{
      throw new ExcepcionValorNegativo("La defensa debe ser mayor cero");
    }
  }
  
  //Metodo get para obtener la defensa
  public int getDefensa(){
    return defensa;
  }
  
  public void setArma(Arma arma) throws ExcepcionValorNulo {
    if (arma != null){
      this.arma = arma;
    }else{
      throw new ExcepcionValorNulo("El arma no puede estar nulo o vacio");
    }
  }

  //Metodo get para llamar al Arma
  public Arma getArma(){
    return arma;
  }
  
  //Metodo para asignar la cantidad de pociones
  public void setCantidadPociones(int cantidadPociones) throws ExcepcionValorNegativo {
    if (cantidadPociones >= 0) {
      this.cantidadPociones = cantidadPociones;
    }else{
      throw new ExcepcionValorNegativo("La cantidad de pociones no puede ser negativa");
    }
  }
  
  //Metodo para obtener la cantidad de pociones
  public int getCantidadPociones(){
    return cantidadPociones;
  }
  
  //Metodo que reduce la vida del protagonista al recibir dano
  public void recibirDanio(int danio) {
    //reduce el danio segun la defensa del personaje
    danio = danio - defensa;
    
    //Este if se encarga de evitar que la defensa convierta el danio en un  numero negativo
    if (danio < 0) {
      danio = 0;
    }

    //resta el danio a la vida
    vida = vida - danio;

    //este if se encarga de evitar que la vida sea negativa
    if (vida < 0) {
      vida = 0;
    }
  }

  //Metodo que utiliza una pocion para recuperar vida
  public boolean usarPocion() {
    if (cantidadPociones > 0) {
      vida = 160;
      cantidadPociones--;
      return true;
    } else {
      return false;
    }
  }

//Metodo que se encarga de verficar si el protagonista sigue vivo
  public boolean estaVivo() {
    if (vida > 0){
      return true;
    } else {
      return false;
    }
  }
  
  //Metodo toString para mostrar la informacion completa
  @Override
  public String toString(){
    return ("El nombre del protagonista es: " + nombre + "\nLa vida del protagonista es: " + vida + "\nEl ataque del protagonista es: " + ataque + "\nLa defensa del protagonista es: " + defensa + "\nEl arma del protagonista es: " + arma + "\nLa cantidad de pociones del protagonista es: " + cantidadPociones);
  }
}
  
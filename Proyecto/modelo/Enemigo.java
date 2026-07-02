package modelo; //Paquete donde se encuentra la clase

import excepciones.ExcepcionValorNegativo; //Se importan las excepciones
import excepciones.ExcepcionValorNulo;

public class Enemigo {

  //Atributos que pertenecen a la clase
  private String nombre;
  private int vida;
  private int ataque;
  private int defensa;
  private Arma arma;

  //constructor con parametros
  public Enemigo(String nombre, int vida, int ataque, int defensa, Arma arma) throws ExcepcionValorNegativo, ExcepcionValorNulo {

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
      throw new ExcepcionValorNegativo("La vida debe ser mayor a cero");
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

    //Asignación del arma
     if (arma != null){
        this.arma = arma;
    }else{
      throw new ExcepcionValorNulo("El arma no puede estar nulo o vacio");
    }
  }

  //Método set para asignar el nombre
  public void setNombre(String nombre) throws ExcepcionValorNulo {
    if (nombre != null && !nombre.equals("")) {
      this.nombre = nombre;
    }else{
      throw new ExcepcionValorNulo("El nombre no puede ser nulo o vacio");
    }
  }

  //Método get para obtener el nombre
  public String getNombre() {
    return nombre;
  }

  //Método set para asignar la vida
  public void setVida(int vida) throws ExcepcionValorNegativo {
    if (vida >= 0) {
      this.vida = vida;
    }else{
      throw new ExcepcionValorNegativo("La vida debe ser mayor a cero");
    }
  }

  //Método get para obtener la vida
  public int getVida() {
    return vida;
  }

  //Método set para asignar el ataque
  public void setAtaque(int ataque) throws ExcepcionValorNegativo {
    if (ataque >= 0) {
      this.ataque = ataque;
    }else{
      throw new ExcepcionValorNegativo("El ataque debe ser mayor a cero");
    }
  }

  //Método get para obtener el ataque
  public int getAtaque() {
    return ataque;
  }

  //Método set para asignar la defensa
  public void setDefensa(int defensa) throws ExcepcionValorNegativo {
    if (defensa >= 0) {
      this.defensa = defensa;
    }else{
      throw new ExcepcionValorNegativo("La defensa debe ser mayor cero");
    }
  }

  //Método get para obtener la defensa
  public int getDefensa() {
    return defensa;
  }

  //metodo set para asignar el arma
  public void setArma(Arma arma) throws ExcepcionValorNulo {
     if (arma != null){
        this.arma = arma;
    }else{
      throw new ExcepcionValorNulo("El arma no puede estar nulo o vacio");
    }
  }

  //Método get para obtener el arma
  public Arma getArma() {
    return arma;
  }

  //Método que reduce la vida del enemigo al recibir dano
  public void recibirDanio(int danio) {
    //reduce el danio segun la defensa del personaje
    danio = danio - defensa;
    
    //Este if se encarga de evitar que la defensa convierta el danio en un  numero negativo
    if (danio < 0) {
      danio = 0;
    }

    //resta el danio a la vida
    vida = vida - danio;

    //Este if se encarga de evitar que la vida sea negativa
    if (vida < 0) {
      vida = 0;
    }
  }

  //Método que calcula el dano que el enemigo inflige al atacar
  public int atacar() {
    int danioTotal = ataque;
    
    //Si el enemigo tiene un arma, se suma el dano del arma al ataque base
    if (arma != null) {
      danioTotal =+ danioTotal + arma.generarDanio();
    }
    return danioTotal;
  }

  //Método que se encarga de verificar si el enemigo sigue vivo
  public boolean estaVivo() {
    return vida > 0;
  }

  //Método toString para mostrar la informacion completa
  @Override
  public String toString() {
    return ("El nombre del enemigo es: " + nombre + "\nLa vida del enemigo es: " + vida + "\nEl ataque del enemigo es: " + ataque + "\nLa defensa del enemigo es: " + defensa + "\nEl arma del enemigo es: " + arma);
  }
}

package modelo; //Paquete donde se encuentra la clase

public class Enemigo {

  //Atributos que pertenecen a la clase
  private String nombre;
  private int vida;
  private int ataque;
  private int defensa;
  private Arma arma;

  //Constructor con parametros
  public Enemigo(String nombre, int vida, int ataque, int defensa, Arma arma) {

    //Validacion del nombre
    if (nombre != null && !nombre.equals("")) {
      this.nombre = nombre;
    } else {
      this.nombre = "sin nombre";
    }

    //Validacion de la vida
    if (vida >= 0) {
      this.vida = vida;
    }

    //Validacion del ataque
    if (ataque >= 0) {
      this.ataque = ataque;
    }

    //Validacion de la defensa
    if (defensa >= 0) {
      this.defensa = defensa;
    }
    //Asignación del arma
    this.arma = arma;
  }

  //Método set para asignar el nombre
  public void setNombre(String nombre) {
    if (nombre != null && !nombre.equals("")) {
      this.nombre = nombre;
    } else {
      this.nombre = "sin nombre";
    }
  }

  //Método get para obtener el nombre
  public String getNombre() {
    return nombre;
  }

  //Método set para asignar la vida
  public void setVida(int vida) {
    if (vida >= 0) {
      this.vida = vida;
    }
  }

  //Método get para obtener la vida
  public int getVida() {
    return vida;
  }

  //Método set para asignar el ataque
  public void setAtaque(int ataque) {
    if (ataque >= 0) {
      this.ataque = ataque;
    }
  }

  //Método get para obtener el ataque
  public int getAtaque() {
    return ataque;
  }

  //Método set para asignar la defensa
  public void setDefensa(int defensa) {
    if (defensa >= 0) {
      this.defensa = defensa;
    }
  }

  //Método get para obtener la defensa
  public int getDefensa() {
    return defensa;
  }

  //Método set para asignar el arma
  public void setArma(Arma arma) {
    this.arma = arma;
  }

  //Método get para obtener el arma
  public Arma getArma() {
    return arma;
  }

  //Método que reduce la vida del enemigo al recibir dano
  public void recibirDanio(int danio) {
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
      danioTotal = danioTotal + arma.getDanio();
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

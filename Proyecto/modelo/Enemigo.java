package modelo; //paquete donde se encuentra la clase

public class Enemigo {

  //atributos que pertenecen a la clase
  private String nombre;
  private int vida;
  private int ataque;
  private int defensa;
  private Arma arma;

  //constructor con parametros
  public Enemigo(String nombre, int vida, int ataque, int defensa, Arma arma) {
    //validacion del nombre
    if (nombre != null && !nombre.equals("")) {
      this.nombre = nombre;
    } else {
      this.nombre = "sin nombre";
    }
    //validacion de la vida
    if (vida >= 0) {
      this.vida = vida;
    }
    //validacion del ataque
    if (ataque >= 0) {
      this.ataque = ataque;
    }
    //validacion de la defensa
    if (defensa >= 0) {
      this.defensa = defensa;
    }
    //asignacion del arma
    this.arma = arma;
  }

  //metodo set para asignar el nombre
  public void setNombre(String nombre) {
    if (nombre != null && !nombre.equals("")) {
      this.nombre = nombre;
    } else {
      this.nombre = "sin nombre";
    }
  }

  //metodo get para obtener el nombre
  public String getNombre() {
    return nombre;
  }

  //metodo set para asignar la vida
  public void setVida(int vida) {
    if (vida >= 0) {
      this.vida = vida;
    }
  }

  //metodo get para obtener la vida
  public int getVida() {
    return vida;
  }

  //metodo set para asignar el ataque
  public void setAtaque(int ataque) {
    if (ataque >= 0) {
      this.ataque = ataque;
    }
  }

  //metodo get para obtener el ataque
  public int getAtaque() {
    return ataque;
  }

  //metodo set para asignar la defensa
  public void setDefensa(int defensa) {
    if (defensa >= 0) {
      this.defensa = defensa;
    }
  }

  //metodo get para obtener la defensa
  public int getDefensa() {
    return defensa;
  }

  //metodo set para asignar el arma
  public void setArma(Arma arma) {
    this.arma = arma;
  }

  //metodo get para obtener el arma
  public Arma getArma() {
    return arma;
  }

  //metodo que reduce la vida del enemigo al recibir dano
  public void recibirDanio(int danio) {
    vida = vida - danio;
    //este if se encarga de evitar que la vida sea negativa
    if (vida < 0) {
      vida = 0;
    }
  }

  //metodo que calcula el dano que el enemigo inflige al atacar
  public int atacar() {
    int danioTotal = ataque;
    //si el enemigo tiene un arma, se suma el dano del arma al ataque base
    if (arma != null) {
      danioTotal = danioTotal + arma.getDanio();
    }
    return danioTotal;
  }

  //metodo que se encarga de verificar si el enemigo sigue vivo
  public boolean estaVivo() {
    return vida > 0;
  }

  //metodo toString para mostrar la informacion completa
  @Override
  public String toString() {
    return ("El nombre del enemigo es: " + nombre + "\nLa vida del enemigo es: " + vida + "\nEl ataque del enemigo es: " + ataque + "\nLa defensa del enemigo es: " + defensa + "\nEl arma del enemigo es: " + arma);
  }
}

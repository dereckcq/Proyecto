package modelo; //paquete donde se encuentra la clase
public class Protagonista {

//atributos que pertenecen a la clase
  private String nombre;
  private int vida;
  private int ataque;
  private int defensa;
  private int cantidadPociones;
  private Arma arma;
  
  //constructor vacio
  public Protagonista() {
  }
  
  //constructor con parametros
  public Protagonista(String nombre, int vida, int ataque, int defensa, Arma arma, int cantidadPociones) {
    //validacion del nombre
    if (nombre != null && !nombre.equals("")){
      this.nombre = nombre;
    }else{
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
    //validacion de la cantidad de pociones
     if (cantidadPociones >= 0) {
      this.cantidadPociones = cantidadPociones;
    }
  }
  
  //metodo set para asignar el nombre
  public void setNombre(String nombre){
    if (nombre != null && !nombre.equals("")){
      this.nombre = nombre;
    }else{
      this.nombre = "sin nombre";
    }
  }
  
  //metodo get para obtener el nombre
  public String getNombre(){
    return nombre;
  }
  
  //Metodo set para asignar la vida
  public void setVida(int vida){
    if (vida >= 0) {
      this.vida = vida;
    }
  }
  
  //metodo get para obtener la vida
  public int getVida(){
    return vida;
  }
  
  //metodo set para asignar el ataque
  public void setAtaque(int ataque){
    if (ataque >= 0) {
      this.ataque = ataque;
    }
  }
  
  //metodo get para obtener el ataque
  public int getAtaque(){
    return ataque;
  }
  
  //metodo set para asignar la defensa
  public void setDefensa(int defensa){
    if (defensa >= 0) {
      this.defensa = defensa;
    }
  }
  
  //metodo get para obtener la defensa
  public int getDefensa(){
    return defensa;
  }
  
  //metodo get para llamar a Arma
  public void getArma(Arma arma){
    return arma;
  }
  
  //metodo para asignar la cantidad de pociones
  public void setCantidadPociones(int cantidadPociones){
    if (cantidadPociones >= 0) {
      this.cantidadPociones = cantidadPociones;
    }
  }
  
  //metodo para obtener la cantidad de pociones
  public int getCantidadPociones(){
    return cantidadPociones;
  }
  
  //metodo que reduce la vida del protagonista al recibir dano
  public void recibirDanio(int danio) {
    vida = vida - danio;
    //este if se encarga de evitar que la vida sea negativa
    if (vida < 0) {
      vida = 0;
    }
  }

  //metodo que utiliza una pocion para recuperar vida
  public boolean usarPocion() {
        if (cantidadPociones > 0) {
            vida = 100;
            cantidadPociones--;
            return true;
        }
        return false;
    }

//metodo que se encarga de verficar si el protagonista sigue vivo
  public boolean estaVivo() {
        return vida > 0;
    }
  
  //metodo toString para mostrar la informacion completa
  @Override
  public String toString(){
    return ("El nombre el protagonista es: " + nombre + "\nLa vida del protagonista es: " + vida + "\nEl ataque del protagonista es: " + ataque + "\nLa defensa del protagonista es: " + defensa + "\nEl arma del protagonista es: " + arma + "\nLa cantidad de pociones del protagonista es: " + cantidadPociones);
  }




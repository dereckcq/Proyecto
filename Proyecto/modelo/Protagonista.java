package modelo;
public class Protagonista {

  private String nombre;
  private int vida;
  private int ataque;
  private int defensa;
  private Arma arma;
  private int cantidadPociones;
  
  public Protagonista() {
  }
  
  public Protagonista(String nombre, int vida, int ataque, int defensa, Arma arma, int cantidadPociones) {
  }
  
  public void setNombre(String nombre){
    if (nombre != null && !nombre.equals("")){
      this.nombre = nombre;
    }else{
      this.nombre = "sin nombre";
    }
  }
  
  public String getNombre(){
    return nombre;
  }
  
  public void setVida(int vida){
    if (vida >= 0) {
      this.vida = vida;
    }
  }
  
  public int getVida(){
    return vida;
  }
  
  public void setAtaque(int ataque){
    if (ataque >= 0) {
      this.ataque = ataque;
    }
  }
  
  public int getAtaque(){
    return ataque;
  }
  
  public void setDefensa(int defensa){
    if (defensa >= 0) {
      this.defensa = defensa;
    }
  }
  
  public int getDefensa(){
    return defensa;
  }
  
  public void getArma(Arma arma){
    return arma;
  }
  
  public void setCantidadPociones(int cantidadPociones){
    if (cantidadPociones >= 0) {
      this.cantidadPociones = cantidadPociones;
    }
  }
  
  public int getCantidadPociones(){
    return cantidadPociones;
  }
  
  public void recibirDanio(int danio) {
    vida = vida - danio;
    if (vida < 0) {
      vida = 0;
    }
  }

  public boolean usarPocion() {
        if (cantidadPociones > 0) {
            vida = 100;
            cantidadPociones--;
            return true;
        }
        return false;
    }

  public boolean estaVivo() {
        return vida > 0;
    }
  
  @Override
  public String toString(){
    return ("El nombre el protagonista es: " + nombre + "\nLa vida del protagonista es: " + vida + "\nEl ataque del protagonista es: " + ataque + "\nLa defensa del protagonista es: " + defensa + "\nEl arma del protagonista es: " + arma + "\nLa cantidad de pociones del protagonista es: " + cantidadPociones);
  }




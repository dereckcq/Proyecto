package modelo;

public class Arma {
  
  private String nombre;
  private int danioMinimo;
  private int danioMaximo;
  
  
  // Constructor con parametros 
  public Arma (String nombre , int danioMaximo , int danioMinimo){
    
    if (nombre != null && !nombre.equals("")) {
      this.nombre = nombre;
    }else{
      this.nombre = "sin nombre";
    }
    
    if (danioMaximo >= 0 && danioMaximo <= 100 ) {
      this.danioMaximo = danioMaximo;
    }else{
      this.danioMaximo = 100;
    } 
    
    if (danioMinimo >= 0 && danioMinimo <= 100 ) {
      this.danioMinimo = danioMinimo;
    }else{
      this.danioMinimo = 1;
    } 
  }
  
  //metodo Para generar danio aleatorio 
  public int generarDanio() {
    int danioGenerado = (int)(Math.random() * (danioMaximo - danioMinimo + 1)) + danioMinimo;
    return danioGenerado;
  }
  
  
  //Metodos set 
  public void setNombre(String nombre) {
    if (nombre != null && !nombre.equals("")) {
      this.nombre = nombre;
    }else{
      this.nombre = "sin nombre";
    }
  }   
  
  public void setDanioMaximo (int danioMaximo){
    if (danioMaximo >= 0 && danioMaximo <= 100 ){
      this.danioMaximo = danioMaximo;
    }else{
      this.danioMaximo = 100;
    } 
  }
  
  public void setDanioMinimo (int danioMinimo){
    if (danioMinimo >= 0 && danioMinimo <= 100 ){
      this.danioMinimo = danioMinimo
    }else{
        this.danioMinimo = 1;
      }
  }
  
  // Metodos get 
  public String getNombre() {
    return nombre;
  }
  
  public int getDanioMaximo() {
    return danioMaximo;
  }
  
  public int getDanioMinimo() {
    return danioMinimo;
  }
  
  //Metodo toString
  @Override
  public String toString() {
    return "Nombre: " + nombre + "\nDanioMaximo: " + danioMaximo + "\nDanio minimo: " + danioMinimo;
  }
}
package excepciones; //Paquete donde se encuentra la clase

//Esta clase sirve para indicar que se ingresó un valor negativo
public class ExcepcionValorNegativo extends Exception {
  
  //Constructor que recibe el mensaje de error
  public ExcepcionValorNegativo(String msg) {
    //Llama al constructor y guarda el mensaje
    super(msg);
  }
}
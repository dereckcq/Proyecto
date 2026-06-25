package excepciones; //Paquete donde se encuentra la clase

//Esta clase sirve para indicar que se ingresó un valor nulo
public class ExcepcionValorNulo extends Exception {
  
  //Constructor que recibe el mensaje de error
  public ExcepcionValorNulo(String msg) {
    //Llama al constructor y guarda el mensaje
    super(msg);
  }
}

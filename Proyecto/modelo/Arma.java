package modelo;

public class Arma {

    private String nombre;
    private int danioMinimo;
    private Int danioMaximo;

    
    // Constructor con parametros 
    public Arma (String nombre , int danioMaximo , int danioMinimo){

        if (nombre == null || nombre.equals("")) {
            this.nombre = " noName ";
        } else {
            this.nombre = nombre;
        }

        if (danioMaximo > 100 || danioMaximo < 0 )

            this.danioMaximo = 100;
        } else {
            this.danioMaximo = danioMaximo;
        } 

        if (danioMinimo > 100 || danioMinimo < 0 ){

            this.danioMinimo = 1;
        } else {
            this.danioMinimo = danioMinimo;
        } 

        //metodo Para generar danio aleatorio 
    public int generarDanio() {
        Random random = new Random();
        return random.nextInt(danioMaximo - danioMinimo + 1) + danioMinimo;
    }


    //Metodos set 
    public void setNombre(String nombre) {
        if (nombre == null || Nombre.equals("")) {
                this.Nombre = "noName";
        } else {
            this.nombre = nombre;
        }
    }   

    public void setDanioMaximo (int danioMaximo){
        if (danioMaximo > 100 || danioMaximo < 0 ){

            this.danioMaximo = 100;
        } else {
            this.danioMaximo = danioMaximo;
        } 

    }

    public void setDanioMinimo (int danioMinimo){
        if (danioMinimo > 100 || danioMinimo < 0 ){

            this.danioMinimo = 100;
        } else {
            this.danioMinimo = danioMinimo;
        } 
    }



    // Metodos get 
    public String Nombre() {
        return nombre
    }
    
    public int danioMaximo() {
        return danioMaximo
    }
    
    public int danioMinimo) {
        return danioMinimo
    }

    //Metodo toString

    @Override
    public String toString() {
    Return " Nombre: " + nombre+ ", DanioMaximo: " + danioMaximo + ", Danio minimo: " + danioMinimo;
    }

    
}
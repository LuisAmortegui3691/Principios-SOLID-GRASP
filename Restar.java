package principioRU;

public class Restar {
    
     //Se crean las variables apara la resta y su resultado
    public int a = 0, b = 0, resultado = 0;
    
    //Se crea constructor para enviar los datos mediante una instancia de la clase EntradaDatos
    //Se declaran en los argumentos del constructor de tipo entero
    public Restar(int a, int b){
        
        //Se asignan las variables
        this.a = a;
        this.b = b;
     
        
    }
    
    public void operacionRestar(){
    
        resultado = a - b;
        
        System.out.println("La suma es: " + resultado);
    }
    

}



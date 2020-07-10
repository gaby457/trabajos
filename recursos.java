/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YANEZ
 */
public class recursos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
​
   
Mensajes mensajes = new Mensajes(); //Instancia de la clase Mensajes
mensajes.Saludo();                  //Llamar los métodos en esa clase por medio de objeto mensajes
mensajes.dibujar(10);               //Llamar el segundo método
mensajes.divicion(10); 

    }
   
    public static class Mensajes {
​
  //Método que no recibe parámetro de entrada ni retorna valor
  public void Saludo() {
    System.out.println("Estoy aprendiendo, pero sere el mejor");
}
    
  //Método que  recibe parámetro entero para imprimir un valor
public void dibujar(int nota) {
  if (nota > 70){
     System.out.println("aprobo");
  }else{
     System.out.println("reprobado");
     }
    }
public int  division(int  num1, int num2;) static {
    try { 
       
     }
      catch (ArithmeticException e){
              }
       System.out.println("La division no se puede dividir entre 0 " );
       return 0;
       
    }
      if (num2!=0){
            return division= num1 / num2;
     }
      catch (ArithmeticException e){
              }
       System.out.println("La division no se puede dividir entre 0 " );
       return 0;
       
    }
    public void lista (int numero) {
        int [] listanumero= null;
  if (numero > 0){
      listanumero = new int [numero + 1];
      for (int i=1; i < listanumero.length; i++){
          listanumero[i]=i;
          System.out.prinln(listanumero[i]);
  
     }
    }
   }
  
    }
    


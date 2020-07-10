/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YANEZ
 */
public class clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nombre;
       int nota;
       String resultado;
       class scanner teclado = new class scanner(System.in);
       
       System.out.println("Ingrese su nombre:");
       nombre=teclado.nextLine();
       System.out.println("Calificacion:");
       nota=teclado.nextInt();
       
       if (nota >=70){
           System.out,println("aprobado");
       } 
       eslse if (nota <70){
           System.out.prinln("reprobado");
       }
    }
    
}

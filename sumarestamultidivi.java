/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YANEZ
 */
public class sumarestamultidivi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1=20;
        double num2=30;
        double suma, resta, multi, division=0 ;
        suma= num1 + num2;
        resta= num1 - num2;
        multi= num1 * num2;
        
        if (num2!=0){
            division= num1 / num2;
            
        }
        
         System.out.println("La suma es: " + suma);
 System.out.println("La resta es: " + resta);
 System.out.println("La multiplicacion es: " + multi);
 System.out.println("La division es: " + division);
        
    }
    
}

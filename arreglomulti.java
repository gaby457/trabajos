/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YANEZ
 */
public class arreglomulti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   String nombres[][] = {
         
           {
           "Esdras",
           "Ramos",
           " Ing. ELECTRONICA",
           },
           {
             "Carlos",
             " Erazo",
             "Ing.Produccion Industrial",
             "sin Trabjo",
              },
             {
           "Carlos",
           "Cruz",
           "Ing. ELECTRONICA",
           "sin trbajo",
            },
            {
               "Dimas",
               "Guzman",
               "Ing. ELECTRONICA",
                "sin trabajo"
               },
             {
             "Jorge",
             "antonio",
             "Computacion",
             "TEST"
             }};  
    {    
        
        for(int i=0;i<=nombres.length;i++)
            
       System.out.println(Arrays.toString(nombres[i]));
    }
    }
}

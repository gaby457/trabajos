
import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Linea;
import helpers.triangulo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YANEZ
 */
public class practicaherencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circulo = new Circulo();
        Cuadrado cuadrado = new Cuadrado();
        Linea linea = new Linea();
        triangulo triangulo= new triangulo ();
        
        System.out.println("Formas");
        
        circulo.imprimirInformacion();
        cuadrado.imprimirInformacion();
        linea.imprimirInformacion();
        triangulo.imprimirInformacion();
    }
    
}

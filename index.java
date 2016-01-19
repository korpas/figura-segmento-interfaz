/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.figura.interfaz;


/**
 *
 * @author Rubén
 */
public class index {
/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Punto punto1 = new Punto(2,3);
     Punto punto2 = new Punto(4,5);
     
     Segmento seg1 = new Segmento(punto1, punto2, 3, 6);
     Segmento seg2 = new Segmento(punto1, punto2, 8, 9 );
     
     Rectangulo rect = new Rectangulo(seg1, seg2, punto1, punto2, 7, 9);
     
     
        
     System.out.println(rect.toString());   
        
        
        
    }
    
}
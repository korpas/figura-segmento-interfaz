/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.figura.interfaz;


/**
 *
 * @author sara
 */
public class Segmento extends Punto{
    
   protected Punto origen;                  
   private Punto destino;

    public Segmento(Punto origen, Punto destino, double x, double y) {
        super(x, y);
        this.origen = origen;
        this.destino = destino;
    }

    public Punto getOrigen() {
        return origen;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }

    public Punto getDestino() {
        return destino;
    }

    public void setDestino(Punto finaloso) {
        this.destino = destino;
    }  
    
    @Override
     public void Desplazar (double x, double y) 
    { 
        this.origen.Desplazar(x, y);
        this.destino.Desplazar(x, y);
    } 
    
    
     public double Distancia() 
    { 
        double resultado = this.origen.Distancia(destino.getX(), destino.getY());
        return resultado;
    } 
     
    public void Escalar(double x1, double x2, double y1, double y2) 
    { 
        this.origen.Desplazar(x1, y1);
        this.destino.Desplazar(x2, y2);
    } 
    

    @Override
    public String toString() {
        return "Segmento{" + "origen=" + origen + ", destino=" + destino + '}';
    }


   
    
}
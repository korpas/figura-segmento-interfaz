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
public class Punto {
private double x;
private double y;
public Punto() {
x = 0;
y = 0;
}
public Punto(double x, double y) {
this.x = x;
this.y = y;
}
public double getX() {
return x;
}
public void setX(double x) {
this.x = x;
}
public double getY() {
return y;
}
public void setY(double y) {
this.y = y;
}
public void Desplazar(double x2, double y2) {
this.x += this.x+ x2;
this.y += this.y+ y2;
}
public double Distancia(double x2, double y2) {

        double result = Math.sqrt((Math.pow((this.x - x2), 2)) + (Math.pow((this.y - y2), 2)));
        return result;
}
public void Sumar(Punto p) {
this.x += p.getX();
this.y += p.getY();
}
@Override
public String toString() {
return "Punto( " + x + " - " + y + " )";
}

}

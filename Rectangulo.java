package java.figura.interfaz;


/**
 *
 * @author Rubén
 */

public class Rectangulo extends Cuadrado implements InterfazFigura{
double alto;
public Rectangulo() {
super();
this.alto = 0;
}
public static Rectangulo Rectangulo(Punto p, double ancho, double alto){
Rectangulo r;
r = new Rectangulo();
r.origen = p;
r.ancho = ancho;
r.alto = alto;
return r;
}

public Rectangulo(double ancho, double alto) {
super();
this.ancho = ancho;
this.alto = alto;
}
public Rectangulo(Punto p) {
super();
this.origen = p;
this.alto = 0;
}
public double getAlto() {
return alto;
}
public void setAlto(double alto) {
this.alto = alto;
}
@Override
public double Area() {
return (ancho * alto);
}
@Override
public double Perimetro() {
return (ancho * 2 + alto * 2);
}
@Override
public void Escalar(double n) {
super.Escalar(n);
this.alto = alto + alto * n / 100;
}
void Escalar(double nAncho, double nAlto) {
this.ancho = nAncho;
this.alto = nAlto;
}
@Override
public String toString() {
return "Rectangulo( " + super.toString() + " - Alto: " + this.alto + " )";
}
}
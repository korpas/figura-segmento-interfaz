package java.figura.interfaz;


/**
 *
 * @author Rubén
 */
public class Circulo extends Figura {
double radio;
public Circulo() {
super();
this.origen = new Punto();
this.radio = 0;
}
public Circulo(Punto p, double r) {
super();
this.origen = p;
this.radio = r;
}
public static Circulo Circulo(Punto p) {
Circulo c;
c = new Circulo();
c.origen = p;
c.radio = 0;
return c;
}
public static Circulo Circulo(double r) {
Circulo c;
c = new Circulo(new Punto(), r);
return c;
}

public double getRadio() {
return radio;
}
public void setRadio(double radio) {
this.radio = radio;
}
@Override
public double Area() {
return (Math.pow(Math.PI * this.radio, 2));
}
@Override
public double Perimetro() {
return (2 * Math.PI * this.radio);
}
@Override
public void Escalar(double porc) {
this.radio = radio + radio * porc / 100;
}
}
package java.figura.interfaz;


/**
 *
 * @author Rubén
 */
public class Triangulo extends Figura implements InterfazFigura {
double base;
double altura;
public Triangulo() {
super();
this.origen = new Punto();
this.base = 0;
this.altura = 0;
}
public Triangulo(Punto p, double b, double a) {
super();
this.origen = p;
this.base = b;
this.altura = a;
}
public static Triangulo Triangulo(double b, double a) {
Triangulo t;
t = new Triangulo(new Punto(), b, a);
return t;
}
public static Triangulo Triangulo(Punto p) {
Triangulo t;
t = new Triangulo(p, 0, 0);
return t;
}

public double getBase() {
return base;
}
public void setBase(double base) {
this.base = base;
}
public double getAltura() {
return altura;
}
public void setAltura(double altura) {
this.altura = altura;
}
@Override
public double Area() {
return ((this.base * this.altura) / 2);
}
@Override
public double Perimetro() {
return (Math.sqrt(Math.pow(this.altura, 2) + Math.pow((this.base / 2), 2)) * 2 + this.base);

}
@Override
public void Escalar(double porc) {
this.base = base + base * porc / 100;
this.altura = altura + altura * porc / 100;
}
@Override
public String toString() {
return "Triangulo( Origen: " + origen.toString()
+ " - Base: " + this.base + " - Altura: " + this.altura + ")";
}
}
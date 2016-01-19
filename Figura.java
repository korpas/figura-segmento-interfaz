package java.figura.interfaz;;


/**
 *
 * @author Rubén
 */
public abstract class Figura implements InterfazFigura {
protected Punto origen = new Punto();
private int numFiguras = 0;
public Figura() {
numFiguras++;
}
public void Desplazar(double dx, double dy) {
this.origen.Desplazar(dx, dy);
}
@Override
public abstract double Area();
@Override
public abstract double Perimetro();
@Override
public abstract void Escalar(double n);
}
package reto5;

public class Rectangulo extends Poligono{

    double base;
    double altura;
    

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    public void calcularArea() {
        area=base*altura;
       
    }


    @Override
    public String toString() {
        
        return ""+area;
    }
    

}

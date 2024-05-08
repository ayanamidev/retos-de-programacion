package reto5;

public class Triangulo extends Poligono  {

    double base;
    double altura;

    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    public void calcularArea() {
        area=(base*altura)/2;
        
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ""+area;
    }

    

}

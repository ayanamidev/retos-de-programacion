package reto5;

public class Cuadrado extends Poligono {

    double lado;

    

    public Cuadrado(double lado) {
        this.lado = lado;
    }



    @Override
    public void calcularArea() {
        area=lado*lado;
       
    }



    @Override
    public String toString() {
        
        return ""+area;
    }
    

}

package reto5;
/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

import java.util.Random;

public class principal {
    public static void main(String[] args) {

       Poligono cuadrado=new Cuadrado(4.00) ;
       Poligono triangulo=new Triangulo(5.00, 7.00);
       Poligono rectangulo= new Rectangulo(8.00, 3.00);


       cuadrado.calcularArea();
       System.out.println(cuadrado.toString());
       triangulo.calcularArea();
       System.out.println(triangulo.toString());
       rectangulo.calcularArea();
       System.out.println(rectangulo.toString());
       
    }

    
}

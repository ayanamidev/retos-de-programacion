/*
 * Crea una función que reciba días, horas, minutos y segundos (como enteros)
 * y retorne su resultado en milisegundos.
 */

package reto20;

public class Principal {
public static void main(String[] args) {

    int dias=3;
    int horas=4;
    int minutos=8;
    int segundos=1;
    System.out.println(tiempoToMilis(dias, horas, minutos, segundos));
    

    
}

public static long  tiempoToMilis(int dias, int horas, int minutos,int segundos){

    long diasToMiliseg=dias*24*60*60*1000;
    long horasToMiliseg=horas*60*60*1000;
    long minutosToMiliseg=minutos*60*1000;
    long segundosToMiliseg=segundos*1000;

    return diasToMiliseg+horasToMiliseg+minutosToMiliseg+segundosToMiliseg;
}

}

/*
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */

package reto9;

public class Principal {
public static void main(String[] args) {
    int decimal=0;
    deciamlTobinario(decimal);
}
public static void deciamlTobinario(int decimal){
    StringBuilder binario=new StringBuilder();

    while (decimal>0) {
        int digito=decimal%2;
        decimal/=2;
        if (digito==0) {
            binario.append(digito);
            
        }else{
            binario.append(1);
        }
    }

    binario.reverse();

    if (binario.length()==0) {
        System.out.println(0);
    }else{
        System.out.println(binario.toString());
    }
    
}
}

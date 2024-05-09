/*
 * Escribe una función que calcule y retorne el factorial de un número dado
 * de forma recursiva.
 */

package reto14;

public class Principal {
    public static void main(String[] args) {
        int n=5;
        int resultado=calcularFactorial(n);
        System.out.println(resultado);

        
    }
    

    public static int calcularFactorial(int cifra){
       
        if(cifra==0){
            return 1;
        }else{
            System.out.println(cifra * calcularFactorial(cifra-1));
            return cifra * calcularFactorial(cifra-1);
            
        }
    }
}

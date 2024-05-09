/*
 * Escribe una función que calcule si un número dado es un número de Armstrong
 * (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información
 * al respecto.
 */

package reto15;

public class Principal {
    public static void main(String[] args) {
        int numero=371;

        calcularArmstrong(numero);
    }

    public static void calcularArmstrong(int numero){

        /*Paso el numero a String */
        String caracteres=numToString(numero);

        /*Creo un array de caracteres cpara saber el valor de cada cifra sin hacer operaciones matematicas */
        char[]cifras=caracteres.toCharArray();

        /* Creo un array de enteros*/
        int[]enteros=new int[cifras.length];

        /*Convierto los valores de char a int y los gurado en el array que creé */
        for(int i=0;i<cifras.length;i++){
            enteros[i]=Character.getNumericValue(cifras[i]);
            
        }


        double resultado=0.00;

        /*Hago por cada numero la potencia */

        for(int j=0;j<enteros.length;j++){
            resultado+= Math.pow(enteros[j], enteros.length);

        }

        
        if (resultado!=numero) {
            System.out.println("El numero no es un numero Armstrong");

            
        }else{
            System.out.println("El numero es un numero armstrong");
        }





    }

    public static String numToString(int numero){

        return Integer.toString(numero);
        
    }
}

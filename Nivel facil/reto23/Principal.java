/*
 * Crea una función que reciba dos array, un booleano y retorne un array.
 * - Si el booleano es verdadero buscará y retornará los elementos comunes
 *   de los dos array.
 * - Si el booleano es falso buscará y retornará los elementos no comunes
 *   de los dos array.
 * - No se pueden utilizar operaciones del lenguaje que
 *   lo resuelvan directamente.
 */

package reto23;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {

        int[]array1={1,2,1,4,5,6};
        int[]array2={4,7,9,1,3,4,6,8,6};
        boolean comunes=true;

        System.out.println(encontrarElementos(array1,array2,comunes));
        
    }

    private static int[] encontrarElementos(int[] array1, int[] array2, boolean comunes) {
        int longitud=0;
        int[]resultado=new int[longitud];

        if (comunes) {
            for(int i=0;i<array1.length;i++){
                for(int j=0;j<array2.length;j++){
                    if (array1[i]==array2[j]) {
                        boolean repetido=true;
                        if (resultado.length==0) {
                            resultado[longitud]=array1[i];
                            
                        }else{
                         for(int x=0;x<resultado.length;x++){

                            if (resultado[x]==array1[i]) {
                            repetido=true;
                            break;
                            }else{
                                repetido=false;
                            }
                        }
                        if(repetido){
                         resultado[longitud]=array1[i];
                        longitud++;   
                        }   
                        }
                        
                        
                    }
                }
            }
        }
        return resultado;
    }
}

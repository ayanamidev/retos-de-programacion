/*
 * Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 * - No se pueden utilizar operaciones del lenguaje que
 *   lo resuelvan directamente.
 */

package reto17;

public class Princial {
    public static void main(String[] args) {
        String frase= "este    programa transforma la primera letra de cada palabra en mayuscula";
        String fraseConvertida=convertMayus(frase);
        System.out.println(fraseConvertida);
    }

    public static String convertMayus(String frase){

        String[]palabrasSeparadas=frase.trim().split("\\s+");
        for(int i=0;i<palabrasSeparadas.length;i++){
            palabrasSeparadas[i]=palabrasSeparadas[i].substring(0,1).toUpperCase()+palabrasSeparadas[i].substring(1);
        }




        return String.join(" ", palabrasSeparadas);
    }
}

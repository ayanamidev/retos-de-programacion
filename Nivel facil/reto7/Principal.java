/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

package reto7;

public class Principal {

public Principal(){

}

    


    public static void main(String[] args) {

        String cadena="Hola Mundo";
        convertirCadena(cadena);

       

       


        
    }
    
    public static void convertirCadena(String cadena){
        
        char[]caracteres=cadena.toCharArray(); /* toCharArray()==["h","o","l", ...] */

        char[]caracteresOrdenados= new char[caracteres.length];
        int y=0;

        for(int i=caracteres.length-1;i>=0;i--){
            caracteresOrdenados[y]=caracteres[i];
            y++;
        }

      

        System.out.println(cadena.valueOf(caracteresOrdenados));

    }
    
}

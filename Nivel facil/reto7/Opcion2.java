package reto7;

public class Opcion2 {


     public static void main(String[] args) {
 
         String cadena="Hola Mundo";
         convertirCadena(cadena);
        }
     
     public static void convertirCadena(String cadena){
         
         char[]caracteres=cadena.toCharArray(); /* toCharArray()==["h","o","l", ...] */
 
         
         
 
         for(int i=caracteres.length-1;i>=0;i--){
             System.out.print(caracteres[i]);
         }
        }
     
}
 


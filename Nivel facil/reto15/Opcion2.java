package reto15;

public class Opcion2 {
    public static void main(String[] args) {
        int numero=371;

        if (esArmstrong(numero)) {
            System.out.println("El número "+numero+" es Armstrong");
        }else{
            System.out.println("El número "+numero+" no es Armstrong");
        }

        

        
    }

    public static boolean esArmstrong(int numero){

        /* numero a String */
        String caracteres=Integer.toString(numero);
        int longitud=caracteres.length();
        int resultado=0;

       

        /*Convierto los valores de char a int y los gurado en el array que creé */
        for(int i=0;i<longitud;i++){
            int cifra=Character.getNumericValue(caracteres.charAt(i));
            resultado+=Math.pow(cifra, longitud);
            
            
        }


        

        /*Hago por cada numero la potencia */

       

        
        return resultado==numero;




    }

    public static String numToString(int numero){

        return Integer.toString(numero);
        
    }
}



/*
 * Crea una función que reciba dos cadenas como parámetro (str1, str2)
 * e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO
 *   estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO
 *   estén presentes en str1.
 */

 package reto12;
 
class Principal {
 
    public static void main(String[] args) {
        String str1="cAsa";
        String str2="cocHe";

        convert(str1,str2);
    }

    public static void convert(String str1, String str2){

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        StringBuilder out1=new StringBuilder();
        /*StringBuilder out2=new StringBuilder();*/

        for(int i=0; i<str1.length();i++){

            if (str2.indexOf(str1.charAt(i))==-1&&out1.toString().contains(String.valueOf(str1.charAt(i)))==false) {
                
                out1.append(str1.charAt(i));   

                 
            }
        }

        System.out.println(out1.toString());

        

    }

    

}
    

    
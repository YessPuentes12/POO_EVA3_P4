/*

 */
package eva3_4_multiples_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;


public class EVA3_4_MULTIPLES_EXCEPCIONES {


    public static void main(String[] args) {
    
    
   try{
     int x,y;
     
   do{ 
     try{  
     Scanner input = new Scanner (System.in);  
   System.out.println("Introduzca el valor (entero) de X:");
    x = input.nextInt();
   System.out.println("Introduzca el valor (entero) de Y:");
    y = input.nextInt();
     int resu = x/y;
        System.out.println("Resultado de la división de " +x+ " y " +y+ " es: " +resu);
   
     }catch(InputMismatchException e){
       System.out.println("La captura es incorrecta: "+ e.getMessage()); 
       System.out.println("Vuelva a capturar. Solo números válidos.");
     } 
   }while(true);
    }catch(ArithmeticException e){
        System.out.println("No se puede dividir entre 0.");
    }
  
    System.out.println("Programa terminado con éxito.");
   
    }
    
}

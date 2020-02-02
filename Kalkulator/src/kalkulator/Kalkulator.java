
package kalkulator;

import static java.time.Clock.system;

/**
 *
 * @author Asus
 */
public class Kalkulator {

   public int dodajLiczby(int a , int b )
   {
       return a + b ; 
   }
         
   public int odejmowanieLiczby(int a , int b )
   {
       return a - b ; 
   }
   
   public int mnozenieLiczby(int a , int b )
   {
       return a * b ; 
   }
   
   public double dzielenieLiczby(double a , double b )
   {
       if(b==0)
       {
         throw new IllegalArgumentException("Nie mozna dzielic przez zero") ; 
       }
           
       return a / b ; 
   }
    
}

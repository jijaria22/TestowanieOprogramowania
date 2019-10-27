/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestowanieOprogramowania;
public class Testowanie {
    
    public int dodawanie(int x , int y)
    {
        return x + y ; 
    }
 
    public boolean sprawdzZakres(int zakresMin , int zakresMax , int liczba)
    { 
        if(liczba >= zakresMin && liczba <= zakresMax)
        {
          return true ;   
        }
        else 
        {
             return false ; 
        }

}

}

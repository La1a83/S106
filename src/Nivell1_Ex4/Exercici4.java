
package Nivell1_Ex4;

/**
 *
 * @author Laia Facundo
 */
import java.util.Arrays;


public class Exercici4  {
    
    
    //Mètode genèric que rep tres paràmetres de diferents tipus:
    public static  <T> void f(T...parametres) {
        T llista[] = parametres;
        System.out.println("Cridant al mètopde f()...");
        System.out.println(Arrays.toString(llista));
        
    }
    
    
    public static void main (String [] args) {
        
        
       
        //Test1: Es crida al métode sense cap argument:
        f();
        
        //Test2:  amb 30 arguments integer:
        f(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        
        //Test3: amb arguments de tipus string:
        f("Hola, ","món","!");
        
        //Test4:amb arguments boolean?:
        f(true,false,false,true,false,true);
    }    
    
    
}

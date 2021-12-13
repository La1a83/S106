
package Nivell1_Ex3;


public class Exercici3  {
    
    
    //Mètode genèric que rep 3 paràtres genèrics: l'últim és opcional:
    public static <T,S,U> void f(T entrada1, S entrada2, U...entrada3) {
        /*Condicional ternari per verificar si hi ha o no tercer parámetre:
        Si es passa, s'imprimirà el valor, sino serà null.
        */
        U a1 = entrada3.length > 0 ? entrada3[0] : null;
        
        System.out.println("paràmetre1: "+entrada1+"\nparàmetre 2: "+entrada2+
                "\nparàmetre 3: "+a1+"\n");
    }
 
    
    public static void main (String [] args) {
        //Prova1 provant amb arguments de tipus Integer, Double i String:
        f(5,5.5,"paraula");
        
        
        //Prova2 provant amb Character i String (obviant el tercer parámetre):
        f('a',"paraula2");
        
    }
    
    
    
    
}





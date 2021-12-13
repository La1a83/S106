
package Nivell1_Ex2;


public class GenericMethods  {
    
    
    //Mètopackage Nivell1_Ex2;de genèric que rep tres paràmetres de diferents tipus:
    public static <T,S,U> String f(T entrada1, S entrada2, U entrada3) {
        
        return "Argument 1: "+entrada1.toString()+"\nArgument 2: "+entrada2.toString()
                +"\nArgument 3: "+entrada3.toString();
    }
    
    
    public static void main (String [] args) {
        //Prova1 provant amb arguments de tipus Integer, Double i String:
        Integer num = 30;
        Double num2 = 30.40;
        String paraula = "Hola!";
        
        String prova1 = f(num,num2,paraula);
        System.out.println(prova1);
        
        //Prova2 provant amb Character, String i Long:
        Character a =  'C';
        String paraula2 = "Prova2";
        Long num3 = 30000000000000000L;
        String prova2 = f(a,paraula2,num3);
        System.out.println(prova2);
    }
    
    
    
    
}


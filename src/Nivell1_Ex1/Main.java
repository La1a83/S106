
package Nivell1_Ex1;



//Per comprovar el funcionament:
public class Main {

    
    public static void main(String[] args) {
        
        Main programa = new Main();
        programa.inici();
        
    }
    
    public void inici() {
        
        //Provant de crear objectes integer:
        NoGenericMethods <Integer> test1 = new NoGenericMethods <>(30,2180,17);
        
        //Provant de crear objectes String:
        NoGenericMethods <String> test2 = new NoGenericMethods <> ("Hola","món ","!");
        
        System.out.println(test1.getObj1());
        System.out.println(test1.getObj2());
        System.out.println(test1.getObj3());
        test1.MostraTipus();
        
        System.out.println(test2.getObj1());
        System.out.println(test2.getObj2());
        System.out.println(test2.getObj3());
        test2.MostraTipus();
        
        
        
    }

    
    
}

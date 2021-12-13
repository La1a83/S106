
package Nivell1_Ex1;




public class NoGenericMethods <T>  {
    
    private T obj1,obj2,obj3;
   
    
    //Constructor amb tres paràmetres:
    public NoGenericMethods(T o1, T o2, T o3) {
        this.obj1 = o1;
        this.obj2 = o2;
        this.obj3 = o3;
        
    }
       
    
    // setters
    public void setObj1(T objecte) {
            this.obj1 = objecte;
    }
	
    public void setObj2(T objecte) {
            this.obj2 = objecte;
    }
    
    public void setObj3(T objecte) {
            this.obj3 = objecte;
    }
    
    //getters
    public T getObj1() {
        return obj1;
    }

    public T getObj2() {
        return obj2;
    }

    public T getObj3() {
        return obj3;
    }
   
    public void  MostraTipus() {
        System.out.println("El tipus de T és: "+this.obj1.getClass().getName());
    }
    
    
}

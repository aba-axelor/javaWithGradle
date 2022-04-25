package defaultAndStaticMethod;

import java.util.Optional;

interface deafultMethod{
     default void default_method(){
         System.out.println("Deafult method is Running here.");
    }
}
class derived_class implements deafultMethod{
 
}
class Main{
   public static void main(String[] args){
        derived_class obj1 = new derived_class();
        obj1.default_method();
    }
}
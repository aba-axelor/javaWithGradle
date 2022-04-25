package optionalClass;

import java.util.Optional;

public class optionalClass{ 
 
   public static void main(String[] args) { 
        String[] str = new String[10]; 
        Optional<String> checkNull =  Optional.ofNullable(str[5]); 
        if (checkNull.isPresent()) { 
            String word = str[5].toLowerCase(); 
            System.out.print(str); 
         } else
           System.out.println("string is null"); 
    } 
}
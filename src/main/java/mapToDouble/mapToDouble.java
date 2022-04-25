package mapToDouble;

import java.util.*;

public class mapToDouble{

	    // Driver code
	    public static void main(String[] args)
	    {
	  
	        // Creating a list of Strings
	        List<String> list = Arrays.asList("3", "6", "8", "14", "15");
	        List<String> list1 = Arrays.asList("10", "6.548", "9.12","11", "15");
	        List<String> list2 = Arrays.asList("25", "225", "1000","20", "15");
	        
	        System.out.println("The stream after applying "+ "the function is : ");

	        System.out.println("\nMapToDouble");
	    
	        list1.stream().mapToDouble(num -> Double.parseDouble(num))
	        			  .filter(num -> (num * num) * 2 == 450)
	        			  .forEach(System.out::println);

	    }
}
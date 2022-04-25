package streamFilter;

import java.util.stream.Stream;

public class streamFilter {	  
	    // Driver code
	    public static void main(String[] args)
	    {
	  
	        // Creating a Stream of Strings
	        Stream<String> stream = Stream.of("Axelor", "xXlr","AXELOR");
	  
	        // Using Stream filter(Predicate predicate)
	        // to get a stream consisting of the
	        // elements having UpperCase Character
	        // at index 1
	        stream.filter(str -> Character.isUpperCase(str.charAt(1)))
	            .forEach(System.out::println);
	    
}
}
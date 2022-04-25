package lambdaExpressions;                            // Lambda can only be used for "Functional Interface"

public class main {

	public static void main(String[] args) {
		
 // implementing Interface by creating  another Class
		
		myInterface obj = new myInterfaceImplement();                
		obj.sayHello();
		
	
// implementing Interface  by creating Anonymous class

		myInterface a1 = new myInterface() {                           
			
			@Override
			public void sayHello() {
				System.out.println("My first Anonmous class.");
			}
		};
		
		a1.sayHello();
		
		myInterface a2 = new myInterface() {
			
			@Override
			public void sayHello() {
				System.out.println("My second Anonymous class");
			}
		};
		
		a2.sayHello();
		
		
//lambda function of "sayHello" fun in "myInterface" interface.
		
		myInterface l1 = () -> System.out.println("This is the first time i'm using Lambda.");        
		
		l1.sayHello();           // since this was only one "SOUT" statement so we removed the brackets i.e implenmting 1st rule of lambda function.
		
		
		myInterface l2 = () -> {
			System.out.println("This is second time i'm using Lambda."); 
			System.out.println("This is the Third time i'm using Lambda.");
		};
		
		l2.sayHello();
		
// Implementing "Sum Function" using "Lambda function"
		
		sumInterface sumInt = (a, b)-> a+b;
		int s1 = sumInt.sum(2, 5);
	    System.out.println(sumInt.sum(5, 8));
	    System.out.println(s1);
	    
// Implementing "lengthInter" interface
	    
	    lengthInter objlen = (str) -> str.length();                 //defining "lengthInter" interface
	    System.out.println("Length of the string is "+objlen.getLength("Arun"));
		
		
	}

}

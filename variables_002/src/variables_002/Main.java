package variables_002;

public class Main {
	public static void main(String[] args) {
		/*
		 * Variables are symbolic names that store data. They are used to separate data
		 * from one another. They are divided into two categories: primitive and
		 * reference. Primitive variables are stored in the stack part of memory, while
		 * reference variables are stored in the heap part. Every variable must have a
		 * type, variables cannot be used without being assigned a value, variables of
		 * the same type can be declared on the same line, and variable names cannot
		 * start with a number.
		 */

		// int x = 2;
		// int _b = 10;

		/*
		 * 
		 * primitive types Primitive types hold numbers, characters, and boolean values
		 * 
		 * byte:8bit(1 byte) short : 2 byte int : 4 byte long : 8 byte float : 4 byte
		 * double : 8 byte char : 2 byte boolean:
		 * 
		 */
//		byte n1 = 1;
//		short n2 = 2;
//		int n3 = 3;
//		long n4 = 4;
//		float n5 = 123.312f;
//		double n6 = 322.1234;

		// System.out.println("n1:"+n1+" n2:"+n2+" n3:"+n3+" n4:"+n4+" n5:"+n5+"
		// n6:"+n6);

		/*
		 * 
		 * reference types :array,class,string
		 * 
		 * String
		 */
//		String text = "hello world";
//		String text2 = "I'm learning JAVA";
		// System.out.println(text+" "+text2);

		/*
		 * In addition to being defined as primitive, a variable can also be defined
		 * with the class of that data type. The data types of variables are also
		 * classes, which means they can also be defined as objects
		 */

//		int i  = 5 ; // primitive
//		Integer j = new Integer(6) ; // old way
//		Integer k = Integer.valueOf(7); // better way
//		System.out.println(k.getClass().getName());

		/*
		 * Differences: A variable of type Integer can use the methods of the
		 * java.lang.Integer class, while a variable of type int cannot. Primitive
		 * variables cannot be serialized. We can assign a null value to a variable of
		 * type Integer
		 */

		// This part is used in collections because collections take objects as
		// parameters
//		Integer b= Integer.valueOf(6) ; // boxing
//		int y = b.intValue();//unboxing 

		/*
		 * Variables defined within a loop or a method are called local variables. The
		 * lifetime of these variables lasts until they exit their blocks
		 */

		// var keyword
		/*
		 * When declaring with var, assigning a value is mandatory Because the JVM
		 * cannot determine the type of the variable at the start It is used only for
		 * local variables and cannot be used for class variables
		 */
//		var x = 10 ;
//		int x = 10 ;
//		x = "kadir";//invalid

		// constant
		/*
		 * 
		 * Constants are used for variables whose values cannot be changed. They are
		 * declared using the 'final' keyword. An initial value must be assigned (it can
		 * be done through a constructor method) "If a constant is defined within a
		 * method, its initial value can be assigned on the next line; this cannot be
		 * done within a class
		 */

//		final int x = 5 ;
//		final String name; 
//		name = "kadir" ; 

		
		/*
		 * 
		 * type casting
		 * 
		 * 
		 */
		
//		//string to int 
//		String number = "5";
//		int n1 = Integer.parseInt(number); //returns a int value 
//		int n2 =Integer.valueOf(number) ;// slower, returns a Integer value
		
		
		
		//int to string
//		int n1 = 9 ;
//		String value1 = String.valueOf(n1);
//		String value2 = Integer.toString(n1) ;
//		
		
		//double to int
//		double n1 = 345.2 ;
//		int n2 = (int)n1;
		
		
		//mix  exams
//		int n1 = 5;
//		double n2 = (double) n1 ;
//		
//		float n3 = 213.3123f;
//		long n4 = (long) n3 ;
		
		/*
		 * 
		 * binary values
		 * 
		 */
//		int x = 0b11110;
//		float y = 0b01010 ;
//		System.out.println(x);
//		System.out.println(y);
		
		
		
		
		
	}

}

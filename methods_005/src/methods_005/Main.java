package methods_005;

public class Main {
	public static void main(String[] args) {
		/*
		 * Methods are a way of breaking down a program into smaller pieces. We
		 * distinguish operations from one another with methods.
		 */

		// methods without parameter
		// sayHello();
		// System.out.println(retHello());

		// methods with parameter
		// System.out.println(add(5, 3));
		// System.out.println(larger(12, 9));

//Passing an array as a parameter to methods
//		int array[] = new int[] { };
//		int[] square = square(array);
//		for (int i : square) {
//			System.out.println(i);
//		}
		
		
	}

	static void sayHello() {
		System.out.println("hello");
	}

	static String retHello() {
		return "hello";
	}

	static int add(int a, int b) {
		return a + b;
	}

	static int larger(int a, int b) {
		int larger = 0;
		if (a > b) {
			larger = a;
		} else {
			larger = b;
		}
		return larger;
	}

	static int[] square(int array[]) {
		int newArray[] = new int[array.length];
		if (array.length == 0) {
			System.out.println("0");
		} else {

			for (int i = 0; i < array.length; i++) {
				newArray[i] = array[i] * array[i];
			}
		}

		return newArray;
	}
}
